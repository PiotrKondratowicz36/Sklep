package Project;

public class MyException3 extends Exception {
    public MyException3 (int k) {
        if (k > 2 || k < 1) {
            System.out.println("Incorrect number. Only from 1 to 2");
        }
    }
}
