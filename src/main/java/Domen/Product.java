package Domen;

public class Product {

    private static int count = 0;
    private int productId = 0;
    private String productName;//for displaying to customer
    private String productCategory;
    private double price;
    /**
     * Create a product for VM
     *
     *
     * @param productName     name of product
     * @param productCategory category of product
     * @param price           value of price of this product
     * @throws Exception      if the price < 0
     */
    public Product(String productName, String productCategory, double price) throws Exception{
        productId = ++count;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }


    // public void setProductId(int productId) {
    //     this.productId = productId;
    // }
    public String getProductName() {
        return productName;
    }


    // public void setProductName(String productName) {
    //     this.productName = productName;
    // }
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", price));
        }
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString()
    {
        return "Product{" + "ProductId: " + productId +
                ", name: '" + productName + '\'' +
                ", category: '" + productCategory + '\'' +
                ", cost: " + price +
                '}';
    }
}