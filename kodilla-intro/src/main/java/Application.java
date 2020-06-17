public class Application {
    public static void main(String[] args) {

        ApplicationTwo name = new ApplicationTwo("Adam", 40.5, 178);


        if (name != null) {
            if (name.age > 30 && name.height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}