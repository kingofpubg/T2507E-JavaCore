public class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Size: " + size;
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.85; // giảm 15%
    }
}