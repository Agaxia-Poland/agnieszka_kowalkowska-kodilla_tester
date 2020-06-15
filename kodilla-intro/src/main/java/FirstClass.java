public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020, "Asus", true);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year + " " + notebook.name + " " + notebook.silent);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2019, "Dell", true);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year + " " + heavyNotebook.name + " " + heavyNotebook.silent);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1600, 500, 2016, "Acer", false);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year + " " + oldNotebook.name + " " + oldNotebook.silent);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
                }
    }
