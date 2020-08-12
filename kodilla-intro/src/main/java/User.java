public class User {
    final String name;
    final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User maria = new User("Maria", 30);
        User ewa = new User("Ewa", 57);
        User stefan = new User("Stefan", 4);
        User henryk = new User("Henryk", 32);

        User[] users = {maria, ewa, stefan, henryk};
        printAll(users);

        double avg = average(users);                //zmienna średnia wieku

        System.out.println("Średnia wieku : " + avg);

        printYounger(users, avg);


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

    private static void printAll(User[] users) {
        for (User user : users) {
            System.out.println(user.getName() + " : " + user.getAge());
        }
    }

}