package ss15_exception;

public class AgeCheckExeption extends Exception {
    public AgeCheckExeption() {
    }
    public AgeCheckExeption(String message) {
        super(message);
    }
}
