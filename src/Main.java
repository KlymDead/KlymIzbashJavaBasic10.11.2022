public class Main {
    public static void main(String[] args) {
    new fitnessTracker("Dave", 30, 06,1997, "hayman@gmail.com", "+380636459878", "Bebe",
         70, 120, 10000).printAccountInfo();
    new fitnessTracker("Victor", 10, 07,1993, "victorthekraker@gmail.com", "+380936459321", "Huev",
                80, 110, 11000).printAccountInfo();
    new fitnessTracker("Dany", 22, 06,1990, "dannychleny@gmail.com", "+380676459823", "Mishkov",
                50, 117, 3000).printAccountInfo();

    fitnessTracker account1 = new fitnessTracker("Bob", 1, 01,1991, "bobbyfloppy@gmail.com", "+380558765432", "Hoppy",
            60, 111, 7000);
    account1.printAccountInfo();
    account1.setSurname("Salyami");
    account1.setWeight(110);
    account1.setPressure(140);
    account1.setSteps(1000);
    account1.printAccountInfo();

    fitnessTracker account2 = new fitnessTracker("Katyha", 4, 10,1997, "katyhapluha@gmail.com", "+380630062332", "Chotkay",
            50, 140, 20243);
    account2.printAccountInfo();
    account2.setSurname("Ebash");
    account2.setWeight(53);
    account2.setPressure(120);
    account2.setSteps(18987);
    account2.printAccountInfo();
    }

}