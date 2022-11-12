public class account {
    private final String name;

    private date birthDate;
    private contacts contactsInfo;
    private fitInfo fit;
    public String surname;
    private int age;

    public account(String name, String surname, date birthDate, contacts contactsInfo, fitInfo fit) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.contactsInfo = contactsInfo;
        this.fit = fit;
        this.age = 2020 - birthDate.getYearOfBirth();
    }

    public String getName() {
        return name;
    }

    public date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(date birthDate) {
        this.birthDate = birthDate;
    }

    public contacts getContactsInfo() {
        return contactsInfo;
    }

    public void setContactsInfo(contacts contactsInfo) {
        this.contactsInfo = contactsInfo;
    }

    public fitInfo getFit() {
        return fit;
    }

    public void setFit(fitInfo fit) {
        this.fit = fit;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "account{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", contactsInfo=" + contactsInfo +
                ", fit=" + fit +
                ", age=" + age +
                '}';
    }
}