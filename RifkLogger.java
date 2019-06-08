package io.github.aishrath.loggingutils;

public interface RifkLogger {
    static void log_begin_method() {
        System.out.println("Beginning method: " + getCallingMethodName());
    }

    static void log_end_method() {
        System.out.println("Ending method: " + getCallingMethodName());
    }

    static void print_msg(String s) throws Exception {
        if (s == null) throw new Exception("NullMessageException");
        System.out.println("Message from: " + getCallingMethodName() + ":" + s);
    }

    static String getCallingMethodName() {
        return getStackTraceElement(3).getMethodName();
    }

    static String getParentMethodName() {
        return getStackTraceElement(2).getMethodName();
    }

    static StackTraceElement getStackTraceElement(int methodLevel) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTraceElements[methodLevel];
        return stackTraceElement;
    }
}
