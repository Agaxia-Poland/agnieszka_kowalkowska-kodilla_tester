public class LeapYear {

    private static boolean isLeap(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                   return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
                System.out.println("Czy rok 2004 jest przestępny? " + isLeap(2004));
                System.out.println("Czy rok 2000 jest przestępny? " + isLeap(2000));
                System.out.println("Czy rok 2100 jest przestępny? " + isLeap(2100));
                System.out.println("Czy rok 2400 jest przestępny? " + isLeap(2400));
                System.out.println("Czy rok 2015 jest przestępny? " + isLeap(2015));

        }
}