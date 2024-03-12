package Udemy;

public class Atvd_B {
    public static void main(String[] args) {
        atvd();
    }

    public static void atvd() {

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double maeasure = 53.234567;

        System.out.println("Products: \n");
        System.out.printf("%s, which price is %.2f\n", product1, price1);
        System.out.printf("%s, which price is %f \n\n", product2, price2);
        System.out.printf("Record %d years old, code %d and gender %s\n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f\n", maeasure);
        System.out.printf("Rouded (Three decimal places): %.3f\n", maeasure);
        System.out.printf("US decimal point: %s", maeasure);

    }
}
