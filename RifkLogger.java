package io.github.aishrath.loggingutils;

public interface RifkLogger {
    static void log_begin_method() {
        System.out.println("Beginning method: " + getCallingMethodName());
    }

    static void log_end_method() {
        System.out.println("Ending method: " + getCallingMethodName());
    }

    static String getCallingMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTraceElements[3];
        return stackTraceElement.getMethodName();
    }
}