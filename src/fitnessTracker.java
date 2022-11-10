public class fitnessTracker {
    private final String name;
    private final int birthday;
    private final String email;
    private final String number;
    public String surname;
    public String weight;
    public String pressure;
    public String steps;
    private int age = 0;
    private int year = 2020;

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }


    public fitnessTracker(String name, int birthday, String email, String number, String surname, String weight, String pressure, String steps) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.number = number;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        if (birthday < year) {
            age = year - birthday;

        } else {
            System.out.println("To Young");
        }
    }
    public String personalAccountInfo() {
        return "fitnessTracker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +'\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", weight='" + weight + '\'' +
                ", pressure='" + pressure + '\'' +
                ", steps='" + steps + '\'' +
                '}';
    }
}