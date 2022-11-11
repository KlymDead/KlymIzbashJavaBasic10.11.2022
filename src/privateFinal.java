public class privateFinal {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String number;

    public privateFinal (String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String number){
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.number = number;

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
}

