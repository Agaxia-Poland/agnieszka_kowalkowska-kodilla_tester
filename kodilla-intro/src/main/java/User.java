public class User {
    String user; //2 atrybuty: imię i wiek
    String age;

    public User(String peter, int i) {

    }

    private static String user() { //dwie metody (gettery), które zwrócą (return) wartość pól z imieniem i wiekiem
        String user = "Andrew, Peter, Mary, Ann";

        return user;
    }

    private static String age() {
        String age = "12, 22, 32, 42";

        return age;

    }


    public class Users {
        String users;

        public Users(String users) { //konstruktor wyświetlający obiekty
            this.users = users;
            
            User andrew = new User("Andrew", 12);
            User peter = new User("Peter", 22);
            User mary = new User("Mary", 32);
            User ann = new User("Ann", 42);

            User[] users = new String[] {"Andrew", "Peter", "Mary", "Ann"}; //utworzona tablica
            for (int i = 0; i < users.length; i++) {  //wyświetlenie wszystkich elementów tablicy
                System.out.println(users[i]);
            }
            int age = 0; //suma i średnia wieku użytkowników
            for (int i = 0; i < users.length; i++) {
                age = user + age[i];
            }
        }
    }

    public static void main(String[] args) {
        boolean user;
        System.out.println(user);
    }

}