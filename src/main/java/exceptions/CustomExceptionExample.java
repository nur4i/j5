package exceptions;

public class CustomExceptionExample {

    public static void main(String[] args) {

        try {
            testMethod(4);
        } catch (MyException ex) {
            ex.printStackTrace();
//            System.out.println("Ошибка из за цифры " + ex.getNumber());
        }

    }

    public static void testMethod(int a) throws MyException {
        if (a % 2 == 0) {
            throw new MyException(a);
        } else {
            System.out.println("Нечетное число");
        }
    }
}
