import kz.cf.j5lib.TemperatureUtils;

import java.util.Scanner;

public class CarTest {

    public static void main(String[] args) {

        int ar[] = new int[10];
        ar[0] = 0;
        ar[1] = 1;
        int i = 2;
        while (i < ar.length) {
            ar[i] = ar[i - 1] + ar[i - 2];
            i++;
        }

        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j]);
            if (j < ar.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        Car car1 = new Car(4, 60, 0.2);

//        car1.setMetric(false);
//        System.out.println(car1.getDistance());
//        car1.setMetric(true);

        car1.printProperties();

        double v = TemperatureUtils.toCelsius(54);

    }
}
