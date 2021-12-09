package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car.Builder("ElectricCar", 2020)
                .setName("Tesla")
                .setTaxes(0)
                .setCostPer100Km(2)
                .setPolution(20)
                .setRange(256)
                .build();
        Car car2 = new Car.Builder("DieselCar", 2010)
                .setName("Mercedes")
                .setTaxes(1000)
                .setPolution(90)
                .setRange(1300)
                .build();
        Car car3 = new Car.Builder("GasCar", 2016)
                .setName("Dacia")
                .setTaxes(700)
                .setPolution(70)
                .setDimWheels(14)
                .build();
        System.out.println(car1);
        System.out.println();
        System.out.println(car2);
        System.out.println();
        System.out.println(car3);
        System.out.println();

        displayInfoAboutBenefitsDriver(car1);
        displayInfoAboutBenefitsDriver(car2);
        displayInfoAboutBenefitsDriver(car3);
    }
        public static void displayInfoAboutBenefitsDriver (Car car){
            String type1 = car.getType();
            switch (type1) {
                case "ElectricCar": {
                    ElectricCar electricCar = new ElectricCar();
                    electricCar.displayBenefitsOfThisCar(car);
                    break;
                }
                case "DieselCar": {
                    DieselCar dieselCar = new DieselCar();
                    dieselCar.displayBenefitsOfThisCar(car);
                    break;
                }
                case "GasCar": {
                    GasCar gasCar = new GasCar();
                    gasCar.displayBenefitsOfThisCar(car);
                    break;
                }
            }
        }
    }

