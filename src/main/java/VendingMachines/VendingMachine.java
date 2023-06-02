package VendingMachines;
import java.util.ArrayList;
import java.util.List;

import Domen.Product;

public class VendingMachine {
//    int productIdByVendingId;
    private int volume;
    private List<Product> products;
    /**
     * Create a Vending Machine
     *
     * @param volume            amount of products which VM can contain
     * List<Product> products   list which includes products in VM
     * @throws Exception        if the price < 0
     */
    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    public String buyProduct(Product prod, double money) {
        double price = prod.getPrice();
        if (price <= money) {
            double change = money - price;
            this.products.remove(prod);
            return "You bought a " + prod.getProductName() + ". Congratulate you! Your change: " + change;
        } else {
            return "There is not enough money to buy this product";
        }
    }

    public String getStringProducts() {
        String productsAll = "";
        for (Product prod : this.products) {
            productsAll += prod.toString() + "\n";
        }
        return productsAll;
    }


    public boolean contains(int checkProductId) {
        for(Product item : this.products) {
            if (item.getProductId() == checkProductId) {
                return true;
            }
        }
        return false;
    }
}