// psvm                 -> public static void main(String[] args) {}
// sout                 -> System.out.println();
// CTRL + SHIFT + F10   -> run
// CTRL + D             -> duplikowanie linii kursora
// ALT + Enter          -> auto-podpowiedź
public class Main {
    // metoda od której startujemy!
    public static void main(String[] args) {
        System.out.println("Startujemy!");
        // utworzenie obiektu klasy
        User userOne = new User(1,"Michal", "mk@mk.pl");
        User userTwo = new User(2, "Adam", "ad@ad.pl");
        User userThree = new User(3, "Anna", "anna@anna.pl");
        User userFour = new User(3, "Anna", "anna@anna.pl");
        System.out.println(userOne);
        System.out.println(userTwo);
        System.out.println(userThree);
//        userOne.setName("Adam");
//        System.out.println(userOne.getName());
//        System.out.println(userOne.getEmail());
//        System.out.println(userOne.getRegistrationDateTime());
        System.out.println(userOne.equals(userTwo));
        System.out.println(userThree.equals(userFour));
        User userFive = userOne;
        System.out.println(userOne.equals(userFive));
        userFive.setName("UPDATE!!!");
        System.out.println(userOne);
        System.out.println(userFive);
        //
        UserService userService = new UserService();
        userService.getAllUsers();
        userService.registerUser("X","X");
    }
}
