import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink coffe = new HotDrink("Raf", 200, 200, 90);
        HotDrink latte = new HotDrink("Espresso", 150, 100, 80);
        HotDrink cappuccino = new HotDrink("Cappuccino", 180, 200, 83);
        HotDrink espresso = new HotDrink("Latte", 205, 200, 85);

        ArrayList<HotDrink> drinks = new ArrayList<>(List.of(coffe, latte, cappuccino, espresso));

        HotDrinkMachine avtomat = new HotDrinkMachine();
        avtomat.addDrink(drinks);
        System.out.println(avtomat.getProduct("Latte"));
        System.out.println(avtomat.getProduct("Espresso",  100, 80));
    }
}
