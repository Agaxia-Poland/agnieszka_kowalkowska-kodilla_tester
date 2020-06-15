public class Grades {

    private int[] grades; //czemu tu jest zdefiniowana prywatna zmienna tabela grades, a w wierszu 7 jest to publiczna zmienna? określamy w publicznej klasie Grades co jest prywatne, czyli nie wyświetlane?
    private int size;
    private int values; //to dodałam, choć w zadaniu w kursie tego nie było. IntelliJ to wskazał

    public Grades(int values) {
        this.grades = new int[10];
        this.size = 10;
        this.values = values;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.values = value; //IntelliJ wyrzucił mi błąd. Tak było zapisane w zadaniu w kursie: this.value[this.size] = value; Wskazał, że nie powinny być nawiasy [], bo oczekiwana tabela. Nie wiem jak to zmienić
        this.size++;
    }

    public static void main(String[] args) {
        int[] gradesFromTest = new int[10];

        gradesFromTest[0] = 54;
        gradesFromTest[1] = 86;
        gradesFromTest[2] = 76;
        gradesFromTest[3] = 90;
        gradesFromTest[4] = 32;
        gradesFromTest[5] = 45;
        gradesFromTest[6] = 75;
        gradesFromTest[7] = 98;
        gradesFromTest[8] = 55;
        gradesFromTest[9] = 22;

        String arrayTitle = "Grades from tests are here:"; //tytuł tabelki
        System.out.println(arrayTitle);

        int firstNumber = 54; //jak wyświetlić wszystkie wiersze tabeli? coś kombinowałam, ale nie idzie
        int secondNumber = 86;
        int thirdNumber = 90;
        int fourthNumber = 32;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        sumAndDisplay(firstNumber, secondNumber, thirdNumber, fourthNumber);

        int marksFromTest = gradesFromTest[9]; //zwracanie ostatnio dodanej oceny
        System.out.println(marksFromTest);
    }

        private static void sumAndDisplay(int firstNumber, int secondNumber, int a, int b) {
        int result = a + b;

        System.out.println(result);

        }

        private int tests(int[] gradesFromTest) {
            int result = 0;
            for (int i = 0; i < gradesFromTest.length; i++) {
                result = result + gradesFromTest[i];
            }return result;
        }
//zwracanie  średniej z ocen - nie mam pojęcia jak to zrobić


}
