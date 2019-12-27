package exceptions;

public class LoopExceptionExample {

    public static void main(String[] args) {

        int ar1[] = {4, 7, 8, 9, 6, 4, 7, 10, 15, 78, 9};
        int ar2[] = {4, 2, 3, 0, 5, 0};

        try {
            for (int i = 0; i < ar1.length; i++) {
                try {
                    System.out.println(ar1[i] / ar2[i]);
                } catch (ArithmeticException ex) {
                    System.out.println("Деление на 0 на " + i + " индексе");
                }

            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Неверный индекс: " + ex.getMessage());
        }

        System.out.println("Конец программы");

    }
}
