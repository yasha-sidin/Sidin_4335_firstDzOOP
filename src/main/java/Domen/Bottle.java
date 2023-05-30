package Domen;

public class Bottle extends Product {
    private int volume;

    /**
     * Create a bottle(extends product) for VM
     *
     * @param productId       id of product
     * @param productName     name of product
     * @param productCategory category of product
     * @param price           value of price of this product
     * @param volume          volume of bottle
     * @throws Exception      if the price < 0
     */
    public Bottle(int productId, String productName, String productCategory, double price, int volume) throws Exception {
        super(productId, productName, productCategory, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name: '" + super.getProductName() + '\'' +
                ", category: '" + super.getProductCategory() + '\'' +
                ", cost: " + super.getPrice() +
                ", volume: " + volume +
                '}';
    }
}