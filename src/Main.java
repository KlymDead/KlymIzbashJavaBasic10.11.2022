public class Main {
    public static void main(String[] args){
    account user = new account("Bob", "loshov",
            new date(10,8,1997),
            new contacts("bob@gmail.com", "+380636956784"),
            new fitInfo(70,140, 3123));
    System.out.println(user);

        account user2 = new account("John", "Salami",
                new date(4,7,1995),
                new contacts("john@gmail.com", "+380636236784"),
                new fitInfo(80,120, 10123));
        System.out.println(user2);

        account user3 = new account("Anna", "Vernaya",
                new date(9,2,1994),
                new contacts("anna@gmail.com", "+380636956743"),
                new fitInfo(50,110, 13123));
        System.out.println(user3);

        account user4 = new account("Torvald", "Great",
                new date(18,5,1990),
                new contacts("viking@gmail.com", "+380636956090"),
                new fitInfo(90,100, 17123));
        System.out.println(user4);
        user4.setFit(new fitInfo(80,120,890));
        System.out.println(user4);

        account user5 = new account("Loki", "Asgard",
                new date(6,6,666),
                new contacts("badboy@gmail.com", "+387594303123"),
                new fitInfo(70,200, 15123));
        System.out.println(user5);
        user5.setFit(new fitInfo(40,70,111890));
        System.out.println(user5);
    }


}
