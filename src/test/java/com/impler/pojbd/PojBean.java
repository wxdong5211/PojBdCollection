package com.impler.pojbd;

/**
 * PojBean
 */
public class PojBean {

    private String clazz;
    private String method;
    private String input;
    private String output;
    private int timeout;

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "PojBean{" +
                "clazz='" + clazz + '\'' +
                ", method='" + method + '\'' +
                ", input='" + input + '\'' +
                ", output='" + output + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}
