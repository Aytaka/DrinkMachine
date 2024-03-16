import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink coffe = new HotDrink("Coffe", 50, 150, 90);
        HotDrink latte = new HotDrink("Latte", 70, 150, 90);
        HotDrink cappuccino = new HotDrink("cappuccino", 60, 150, 80);
        HotDrink espresso = new HotDrink("espresso", 55, 100, 85);

        ArrayList<HotDrink> drinks = new ArrayList<>(List.of(coffe, latte, cappuccino, espresso));

        HotDrinkMachine avtomat = new HotDrinkMachine();
        avtomat.addDrink(drinks);
        System.out.println(avtomat.getProduct("Latte"));
        System.out.println(avtomat.getProduct("espresso",  100, 85));
    }
}
