package com.impler.pojbd;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import java.lang.annotation.Annotation;

/**
 * PojRunner
 */
public class ParamRunner extends BlockJUnit4ClassRunner {

    private final Object[] fParameters;

    private final String fName;

    ParamRunner(Class<?> type, Object[] parameters,
                                 String name) throws InitializationError {
        super(type);
        fParameters = parameters;
        fName = name;
    }

//        @Override
//        public Object createTest() throws Exception {
//            if (fieldsAreAnnotated()) {
//                return createTestUsingFieldInjection();
//            } else {
//                return createTestUsingConstructorInjection();
//            }
//        }

//        private Object createTestUsingConstructorInjection() throws Exception {
//            return getTestClass().getOnlyConstructor().newInstance(fParameters);
//        }

//        private Object createTestUsingFieldInjection() throws Exception {
//            List<FrameworkField> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
//            if (annotatedFieldsByParameter.size() != fParameters.length) {
//                throw new Exception("Wrong number of parameters and @Parameter fields." +
//                        " @Parameter fields counted: " + annotatedFieldsByParameter.size() + ", available parameters: " + fParameters.length + ".");
//            }
//            Object testClassInstance = getTestClass().getJavaClass().newInstance();
//            for (FrameworkField each : annotatedFieldsByParameter) {
//                Field field = each.getField();
//                Parameter annotation = field.getAnnotation(Parameter.class);
//                int index = annotation.value();
//                try {
//                    field.set(testClassInstance, fParameters[index]);
//                } catch (IllegalArgumentException iare) {
//                    throw new Exception(getTestClass().getName() + ": Trying to set " + field.getName() +
//                            " with the value " + fParameters[index] +
//                            " that is not the right type (" + fParameters[index].getClass().getSimpleName() + " instead of " +
//                            field.getType().getSimpleName() + ").", iare);
//                }
//            }
//            return testClassInstance;
//        }

    @Override
    protected String getName() {
        return fName;
    }

    @Override
    protected String testName(FrameworkMethod method) {
        return method.getName() + getName();
    }

//        @Override
//        protected void validateConstructor(List<Throwable> errors) {
//            validateOnlyOneConstructor(errors);
//            if (fieldsAreAnnotated()) {
//                validateZeroArgConstructor(errors);
//            }
//        }

//        @Override
//        protected void validateFields(List<Throwable> errors) {
//            super.validateFields(errors);
//            if (fieldsAreAnnotated()) {
//                List<FrameworkField> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
//                int[] usedIndices = new int[annotatedFieldsByParameter.size()];
//                for (FrameworkField each : annotatedFieldsByParameter) {
//                    int index = each.getField().getAnnotation(Parameter.class).value();
//                    if (index < 0 || index > annotatedFieldsByParameter.size() - 1) {
//                        errors.add(
//                                new Exception("Invalid @Parameter value: " + index + ". @Parameter fields counted: " +
//                                        annotatedFieldsByParameter.size() + ". Please use an index between 0 and " +
//                                        (annotatedFieldsByParameter.size() - 1) + ".")
//                        );
//                    } else {
//                        usedIndices[index]++;
//                    }
//                }
//                for (int index = 0; index < usedIndices.length; index++) {
//                    int numberOfUse = usedIndices[index];
//                    if (numberOfUse == 0) {
//                        errors.add(new Exception("@Parameter(" + index + ") is never used."));
//                    } else if (numberOfUse > 1) {
//                        errors.add(new Exception("@Parameter(" + index + ") is used more than once (" + numberOfUse + ")."));
//                    }
//                }
//            }
//        }

    @Override
    protected Statement classBlock(RunNotifier notifier) {
        return childrenInvoker(notifier);
    }

    @Override
    protected Annotation[] getRunnerAnnotations() {
        return new Annotation[0];
    }


}
