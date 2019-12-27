package exceptions;

public class FinallyExample {

    public static void main(String[] args) {

        int ar1[] = {4, 7, 8, 9, 6, 4, 7, 10, 15, 78, 9};
        int ar2[] = {4, 2, 3, 0, 5, 0};

        System.out.println(getDivisionSum(ar1, ar2));

    }

    private static int getDivisionSum(int ar1[], int ar2[]) {
        try {
            int sum = 0;
            for (int i = 0; i < ar1.length; i++) {
                try {
                    sum += ar1[i] / ar2[i];
                } catch (ArithmeticException ex) {
                    return 0;
                }
            }

            return sum;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Неверный индекс: " + ex.getMessage());
            return -1;
        } finally {
            System.out.println("Конец программы");
        }
    }
}

