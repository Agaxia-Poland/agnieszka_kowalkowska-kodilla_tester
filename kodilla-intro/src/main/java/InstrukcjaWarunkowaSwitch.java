import java.util.Scanner;

public class InstrukcjaWarunkowaSwitch {
    public enum Switch {
        B, /* Black */
        G, /* Green */
        R, /* Red */
        W, /* White */
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write first letter of colour: R - red, W - white, B - black, G - green:");
            String colour = scanner.nextLine().trim().toUpperCase();
            Switch myColour = Switch.R;

            switch(myColour) {
               case R:
                  System.out.println("Red");
                        break;
               case W:
                   System.out.println("White");
                        break;
               case B:
                    System.out.println("Black");
                        break;
               case G:
                    System.out.println("Green");
                        break;
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }

    }

}
