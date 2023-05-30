package Domen;

public class HotDrink extends Product{
    private double temperature;

    /**
     * Create a hot drink(extends product) for VM
     *
     * @param productId       id of product
     * @param productName     name of product
     * @param productCategory category of product
     * @param price           value of price of this product
     * @param temperature     temperature of hot drink
     * @throws Exception      if the price < 0
     */
    public HotDrink(int productId, String productName, String productCategory, double price, double temperature) throws Exception {
        super(productId, productName, productCategory, price);
        this.temperature = temperature;
    }

    public double getTemperature() { return temperature; }

    public void setTemperature(double temperature) { this.temperature = temperature; }

    @Override
    public String toString()
    {
        return "Product{" +
                "name: '" + super.getProductName() + '\'' +
                ", category: '" + super.getProductCategory() + '\'' +
                ", cost: " + super.getPrice() +
                ", temperature: " + temperature +
                '}';
    }
}
