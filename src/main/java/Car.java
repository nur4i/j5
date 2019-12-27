
public class Car {

    private final double GALLON_COEF = 3.785;

    int passengers;
    private int gasTankVolume;
    double fuelConsumption;

    String brand;
    String model;
    private boolean metric = true;
    double consumptionCoef = 1.0;

    Car(int passengers, int volume, double fuelConsumption) {
        gasTankVolume = volume;
        this.passengers = passengers;
        this.fuelConsumption = fuelConsumption;
    }

    void setGasTankVolume(int volume) {
        if (volume < 1) {
            gasTankVolume = 1;
        } else {
            gasTankVolume = volume;
        }
    }

    int getGasTankVolume() {
        return gasTankVolume;
    }

    void setMetric(boolean b) {
        if (b == false && metric == true) {
            fuelConsumption = fuelConsumption / GALLON_COEF;
        } else {

        }

        metric = b;
    }

    boolean getMetric() {
        return metric;
    }

    void printProperties() {
        calculateConsumptionCoefficient();

        System.out.println("Вместимость салона: " + passengers);
        if (metric) {
            System.out.println("Объем бака: " + gasTankVolume + " литров");
        } else {
            System.out.println("Объем бака: " + gasTankVolume / 3.785 + " галлонов");
        }

        if (metric) {
            System.out.println("Расход топлива: " + fuelConsumption * consumptionCoef + " литров на киллометр");
        } else {
            double consumption = fuelConsumption * 0.264172 / 0.621371;
            System.out.println("Расход топлива: " + consumption * consumptionCoef + " галлонов на милю");
        }

        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
    }

    double getDistance() {
        calculateConsumptionCoefficient();
        return gasTankVolume / (fuelConsumption * consumptionCoef);
    }

    double getFuelConsumption() {
        calculateConsumptionCoefficient();
        return fuelConsumption * consumptionCoef * 100;
    }

    String getCarName() {
        return brand + " " + model;
    }

    void calculateConsumptionCoefficient() {
        if (passengers > 1) {
            consumptionCoef = 1.0 + (passengers - 1) * 0.1;
        } else {
            consumptionCoef = 1.0;
        }
    }

}
