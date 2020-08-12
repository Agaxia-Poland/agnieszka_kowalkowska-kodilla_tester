import java.util.Random;

public class User {
    final String name;
    final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }





    private static double average(User[] users) { // liczymy średnią wieku uzytkownikow
        double sum = 0;
        for (User user : users) {
            sum = sum + user.getAge();
        }
        return sum / users.length;
    }

    private static void printYounger(User[] users, double avg) {
        for (User user : users) {
            if (user.getAge() < avg) {
                System.out.println(user.getName());
            }
        }
    }

    public int getAge() {   //gettery:wiek i imię
        return age;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {

        User[] users = init(4);
        printAll(users);

        double avg = average(users);                //zmienna średnia wieku

        System.out.println("Średnia wieku : " + avg);

        printYounger(users, avg);


    }

    private static User[] init(int size) {   //private static User[] init() - inicjującą tablicę userów (to co jest w liniach 13-18 de facto)
        Random random = new Random();
        User[] users = new User[size];
        for (int i = 0; i < size; i++) {
            users[i] = new User("user" + i, random.nextInt(100));  // losujemy wiek
        }
        return users;
    }

    private static void printAll(User[] users) {
        for (User user : users) {
            System.out.println(user.getName() + " : " + user.getAge());
        }
    }
}