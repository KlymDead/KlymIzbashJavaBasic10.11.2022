public class privateOnly extends privateFinal {
    public String surname;
    public int weight;
    public int pressure;
    public int steps;
    private int age;

    public privateOnly(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String number, String surname, int weight, int pressure, int steps) {
        super(name, dayOfBirth, monthOfBirth, yearOfBirth, email, number);
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2020 - yearOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "fitnessTracker{" +
                "name='" + getName() + '\'' +
                ", dayOfBirth=" + getDayOfBirth() +
                ", monthOfBirth=" + getMonthOfBirth() +
                ", yearOfBirth=" + getYearOfBirth() +
                ", email='" + getEmail() + '\'' +
                ", number='" + getNumber() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", weight=" + getWeight() +
                ", pressure=" + getPressure() +
                ", steps=" + getSteps() +
                ", age=" + getAge() +
                '}';
    }
}
