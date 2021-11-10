public class Items {
    private int itemCode;
    private String description;
    private int qty;
    private double price;
    private double totalPrice;

    public Items(int itemCode, String description, int qty, double price, double totalPrice) {
        this.itemCode = itemCode;
        this.description = description;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    @Override
    public String toString() {
        return "Product{" +
                "itemCode=" + itemCode +
                ", description='" + description + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
