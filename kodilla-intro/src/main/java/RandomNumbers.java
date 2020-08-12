import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

    private List<Integer> drawnNumbers = new ArrayList();

    private static User[] init(int size) {   //private static User[] init() - inicjującą tablicę userów (to co jest w liniach 13-18 de facto)
        Random random = new Random();
        User[] users = new User[size];
        for (int i = 0; i < size; i++) {
            users[i] = new User("user" + i, random.nextInt(100));  // losujemy wiek
        }
        return users;
    }

    //private static double average(User[] users) zwracająca średnią wieku wszystkich użytkowników

    private static double average(User[] users) {
        double sum = 0;
        for (User user : users) {
            sum = sum + user.getAge();
        }
        return sum / users.length;
    }

    //private static void printYoungerThan(User[] users, double average) - drukującą użytkowników, których wiek jest poniżej podanej jako parametr średniej wieku


    private static void printYoungerThan(User[] users, double average) {
        for (User user : users) {
            if (user.getAge() < average) {
                System.out.println(user.getName());
            }
        }
    }


    //Metoda main powinna wyglądać tak:
    //private static void main(String[] args) { User[] users = init(); double average = average(users); print(users, average);

    public static void main(String[] args) {

        User[] users = new User[0];
        double average = average(users);

        print(users, average);
        printYoungerThan(users, average);

    }

    private static void print(User[] users, double average) {
        for (User user : users) {
            System.out.println(user.getName() + " : " + user.getAge());
        }
    }

    //metoda losująca liczby z zakresu 0-30, tak długo, aż ich suma przekroczy 5000

    public User[] process() {
        Random random = new Random();
        int size = 0;
        User[] users = new User[size];
        for (int i = 0; i < size; i++) {
            users[i] = new User("user" + i, random.nextInt(100));  // losujemy wiek
        }
        return users;
    }
}


//            System.out.println(randomNumbers.getMaxNumber());
//            System.out.println(randomNumbers.getMinNumber());

//dwie metody zwracające największą i najmniejszą wylosowaną wartość

//    public int getMaxNumber() {
//        int max = drawnNumbers.get(0);
//        for (int i = 0 ; i < drawnNumbers.size(); i++) {
//            if (drawnNumbers.get(i) > max) {
//                max = drawnNumbers.get(i);
//            }
//        }
//        return max;
//    }
//    public int getMinNumber() {
//        int min = drawnNumbers.get(0);
//        for (int i = 0; i < drawnNumbers.size(); i++) {
//            if (drawnNumbers.get(i) < min) {
//                min = drawnNumbers.get(i);
//            }
//        }
//        return min;
//    }





