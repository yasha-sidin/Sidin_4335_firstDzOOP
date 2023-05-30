import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Чипсы", 59);
        item1.setPrice(98);
        Product item2 = new Bottle(2, "Cola", "Water", 70, 500);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59));
        iMachine.addProduct(new Bottle(4, "Water", "Water", 170, 1500));
        iMachine.addProduct(new HotDrink(5, "Cofe", "Cofe", 105, 70));
        iMachine.addProduct(new HotDrink(6, "Tea", "Cofe", 60, 80));

        for(Product prod: iMachine.getProducts())
        {
            System.out.println(prod.toString());
        }

//        MainFrame myFrame = new MainFrame();
//        myFrame.initialize(iMachine);
    }
}