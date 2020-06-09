public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "Anna";
        names[1] = "Adam";
        names[2] = "Kasia";
        names[3] = "Piotr";
        names[4] = "Mikołaj";

        String name = names[3];
        System.out.println(name);

        int numberOfElements = names.length;
        String array = "Moja tablica zawiera 5 elementów";
        System.out.println(array);


    }
}
