package week3.exceptionexample;

public class MyException extends Exception {
    public MyException() {
        super("Default Message...");
    }

    public MyException(String message) {
        super(message);
    }
}
