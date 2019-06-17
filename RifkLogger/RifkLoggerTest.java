public class RifkLoggerTest implements RifkLogger {
    public static void main(String[] args) {
        RifkLogger.log_begin_method();
        sampleMethodCallingBeginningMethod();
    }

    public static Integer sampleMethodCallingBeginningMethod() {
        RifkLogger.log_begin_method();
        return 5;
    }
}