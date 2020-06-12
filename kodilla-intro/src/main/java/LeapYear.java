public class LeapYear {
        int year;

        private static boolean isLeap(int year) {

                if (year % 4) {
                        System.out.println("Rok jest przestępny");
                } else if (year % 100) {
                        System.out.println("Rok jest przestępny");
                } else if (year % 400) {
                        System.out.println("Rok jest przestępny");

                } else if (year % 4 && year%100) {
                        //rok podzielny przez 4 i niepodzielny przez 100 jest przestępny
                        System.out.println("Rok jest przestępny");
                } else {
                        System.out.println("Rok nie jest przestępny");
                }
        }
}