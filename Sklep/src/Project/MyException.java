package Project;

public class MyException extends Exception {
    public MyException(int i) {
        if (i > 7 || i < 1) {
            System.out.println("Incorrect number. Only from 1 to 7!");
        }
    }
}
