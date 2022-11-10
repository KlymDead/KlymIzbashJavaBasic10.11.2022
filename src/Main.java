public class Main {
    public static void main(String[] args) {
        fitnessTracker account1 = new fitnessTracker("Dave", 1995, "davej@gmail.com","+380645678944", "Sunchez", "67"
                , " 197/4", "4000");
        fitnessTracker account2 = new fitnessTracker("John", 1997, "johnybigpenis@gmail.com","+380645643534", "Doo", "90"
                , " 197/4", "8000");
        fitnessTracker account3 = new fitnessTracker("Vitek", 1990, "kaif228@gmail.com","+382345678944", "Krutpy", "77"
                , " 197/3", "11000");
        String firstAccount = account1.personalAccountInfo();
        System.out.println(firstAccount);
        String secondAccount = account2.personalAccountInfo();
        System.out.println(secondAccount);
        String thirdAccount = account3.personalAccountInfo();
        System.out.println(thirdAccount);




    }
}