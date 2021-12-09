package clean.code.design_patterns.requirements;

public class Car {
    private String type;
    private String name;
    private int year;
    private int polution;
    private int taxes=-1;
    private double costPerKm;
    private int dimWheels;
    private int range;

    public Car(Builder builder) {
        this.type = builder.type;
        this.year = builder.year;
        this.name = builder.name;
        this.polution = builder.polution;
        this.taxes = builder.taxes;
        this.costPerKm = builder.costPerKm;
        this.dimWheels = builder.dimWheels;
        this.range = builder.range;

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPolution() {
        return polution;
    }

    public int getTaxes() {
        return taxes;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public int getDimWheels() {
        return dimWheels;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Type: " + type + '\n' +
                "Name: " + name + '\n' +
                "Year: " + year + '\n' +
                "Polution: " + polution + '\n' +
                "Taxes: " + taxes + '\n' +
                "CostPerKm: " + costPerKm + '\n' +
                "DimWheels: " + dimWheels + '\n' +
                "Range: " + range;
    }


    public static class Builder {
        private String type;
        private String name=null;
        private int year;
        private int polution=-1;
        private int taxes=-1;
        private double costPerKm=-1.1;
        private int dimWheels=-1;
        private int range=-1;

        public Builder(String type, int year) {
            this.type = type;
            this.year = year;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPolution(int polution) {
            this.polution = polution;
            return this;
        }

        public Builder setTaxes(int taxes) {
            this.taxes = taxes;
            return this;
        }

        public Builder setCostPer100Km(double costPerKm) {
            this.costPerKm = costPerKm;
            return this;
        }

        public Builder setDimWheels(int dimWheels) {
            this.dimWheels = dimWheels;
            return this;
        }

        public Builder setRange(int range) {
            this.range = range;
            return this;
        }

        public Car build() {
            return new Car(this);
        }


    }


}
