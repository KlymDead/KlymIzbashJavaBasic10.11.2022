public class contacts {
    private final String email;
    private final String number;

    public contacts(String email, String number) {
        this.email = email;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "contacts{" +
                "email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
