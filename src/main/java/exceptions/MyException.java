package exceptions;

public class MyException extends Exception {

    public MyException(int number) {
        super("Ошибка из за цифры " + number);
    }

}
