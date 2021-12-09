package code._4_student_effort._challenge._6_builder;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicence;
    private boolean isMaried;

    public Person(Builder builder){
        this.name=builder.name;
        this.job=builder.job;
        this.university=builder.university;
        this.drivingLicence=builder.drivingLicence;
        this.isMaried=builder.isMaried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicence='" + drivingLicence + '\'' +
                ", isMaried=" + isMaried +
                '}';
    }

    public class Builder{
        private String name;
        private String job;
        private String university;
        private String drivingLicence;
        private boolean isMaried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder job ( String job){
            this.job=job;
            return this;
        }
        public Builder university ( String university){
            this.university=university;
            return this;
        }
        public Builder drivingLicence ( String drivingLicence){
            this.drivingLicence=drivingLicence;
            return this;
        }
        public Builder isMaried ( boolean isMaried){
            this.isMaried=isMaried;
            return this;
        }
        public Person build(){ return new Person(this);}

    }
}
