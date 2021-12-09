package clean.code.design_patterns.requirements;

public abstract class GetBenefitsForDriver {

    void displayBenefitsOfThisCar(Car car) {
        System.out.println("Advantages of a " + car.getType() + " car: ");
        System.out.println(confort() + '\n' + publicHealth() + '\n' + mobility() + '\n' + "-> "
                + howMuchTheCarPolluteYourLife() + '\n');
    }

    String confort() {
        return "A car is more comfortable than a bus ";
    }

    String publicHealth() {
        return "You can get coronavirus harder in the car than on the bus ";
    }

    String mobility() {
        return "You can go by car anytime and anywhere, without depending on the bus schedule";
    }

    abstract String howMuchTheCarPolluteYourLife();
}
