import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("Lays", "Чипсы", 59);
        item1.setPrice(98);
        Product item2 = new Bottle( "Cola", "Water", 70, 500);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product("Масло", "Масло", 59));
        iMachine.addProduct(new Bottle("Water", "Water", 170, 1500));
        iMachine.addProduct(new HotDrink("Cofe", "Cofe", 105, 70));
        iMachine.addProduct(new HotDrink("Tea", "Cofe", 60, 80));

        MainFrame myFrame = new MainFrame();
        myFrame.initialize(iMachine);
    }
}