public class Notebook {
    int weight;
    int price;
    int year;
    String name;
    boolean silent;

    public Notebook(int weight, int price, int year, String name, boolean silent) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.name = name;
        this.silent = silent;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
         if (this.weight < 1200){
             System.out.println("This notebook is light.");
         } else if (this.weight >= 1200 && this.weight <= 2000){
             System.out.println("This notebook is not too heavy.");
         } else if (this.weight > 2000){
             System.out.println("This notebook is heavy.");
         }
        }
    public void checkYearAndPrice() {
        if (this.year >= 2020 && this.price <=1000){
            System.out.println("This notebook is new, with good price.");
        } else if (this.year < 2020 && this.year > 2016 && this.price <= 1500){
            System.out.println("This notebook is quite new and expensive.");
        } else if (this.year <= 2016 && this.price < 600){
            System.out.println("This notebook is old and cheap.");
        }
    }
}