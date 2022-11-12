package fitTrackerBasik;

public class account {
        private final String name;
        private final int dayOfBirth;
        private final int monthOfBirth;
        private final int yearOfBirth;
        private final String email;
        private final String number;
        public String surname;
        public int weight;
        public int pressure;
        public int steps;
        private int age;

        public account(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String number, String surname, int weight, int pressure, int steps) {
            this.name = name;
            this.dayOfBirth = dayOfBirth;
            this.monthOfBirth = monthOfBirth;
            this.yearOfBirth = yearOfBirth;
            this.email = email;
            this.number = number;
            this.surname = surname;
            this.weight = weight;
            this.pressure = pressure;
            this.steps = steps;
            this.age = 2020 - yearOfBirth;
        }

        public String getName() {
            return name;
        }

        public int getDayOfBirth() {
            return dayOfBirth;
        }

        public int getMonthOfBirth() {
            return monthOfBirth;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public String getEmail() {
            return email;
        }

        public String getNumber() {
            return number;
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



        public void printAccountInfo() {
            System.out.println(this);
        }
        @Override
        public String toString() {
            return "fitnessTracker{" +
                    "name='" + name +
                    ", dayOfBirth=" + dayOfBirth +
                    ", monthOfBirth=" + monthOfBirth +
                    ", yearOfBirth=" + yearOfBirth +
                    ", email='" + email +
                    ", number='" + number +
                    ", surname='" + surname +
                    ", weight=" + weight +
                    ", pressure=" + pressure +
                    ", steps=" + steps +
                    ", age=" + age +
                    '}';
        }
    }

