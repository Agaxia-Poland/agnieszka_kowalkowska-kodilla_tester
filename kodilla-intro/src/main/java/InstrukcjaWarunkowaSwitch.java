public class InstrukcjaWarunkowaSwitch {
    public enum Switch {
        B, /* Black */
        G /* Green */,
        R, /* Red */
        W /* White */
        }

    public static void main(String[] args) {

        Switch myColour = Switch.B;

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
        }

    }
}
