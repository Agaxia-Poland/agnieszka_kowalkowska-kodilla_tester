public class User {
    String user; //2 atrybuty: imię i wiek
    int age;

    private static String user() { //dwie metody (gettery), które zwrócą (return) wartość pól z imieniem i wiekiem
        String user = "Andrew"; "Peter"; "Mary"; "Ann";

        return user;
    }

    private static int age() {
        int age = 12, 22, 32, 42;

        return age;
    }
}


    public static void main(String[] args) {

        private String[] users; //utworzenie tablicy
        private int size;

        public User() { //konstruktor wyświetlający obiekty
            User andrew = new User("Andrew", 12);
            User peter = new User("Peter", 22);
            User mary = new User("Mary", 32);
            User ann = new User("Ann", 42);

            User[] users = {andrew, peter, mary, ann}; //utworzona tablica
            for (int i = 0; i < users.length; i++) {  //wyświetlenie wszystkich elementów tablicy
                System.out.println(users[i]);
            }
            int age = 0; //suma i średnia wieku użytkowników
            for (int i = 0; i < users.length; i++) {
                age = age + users[i];
            }
        }
    }
}