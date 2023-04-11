package Project;

public class MyException2 extends Exception {
    public MyException2 (int j) {
        if (j > 9 || j < 1) {
            System.out.println("Incorrect number. Only from 1 to 9!");
        }
    }
}
