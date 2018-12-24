public class MyCalculator {

    public void power(int n, int p) throws MyException {
        int result = 1;
        if (n != 0 && p == 0) {
            System.out.println("1");        // потому что любое число в степени 0 равняется 1
        } else if (n == 0 && p == 0) {
            throw new MyException("n and p should not be zero");
        } else if (n < 0 || p < 0) {
            throw new MyException("n or p should not be negative");
        } else {
            for (int i = 0; i < p; i++) {
                result *= n;
            }
            System.out.println(result);
        }
    }
}
