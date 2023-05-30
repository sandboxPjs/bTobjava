package ch10.projects.shoppinglist;

public class ItemOrder {
    private Item item;
    private int quantity;
    private Discount discount;
    public ItemOrder(Item item, int quantity, Discount discount) {
        this.item = item;
        this.quantity = quantity;
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Item getItem() {
        return item;
    }

    public double calculateCost() {
        if (discount != null) {
            double bulkPrice = quantity / discount.getAmount() * discount.getPrice();
            double singlePrice =  quantity % discount.getAmount() * item.getPrice();
            return bulkPrice + singlePrice;
        } else {
            return quantity * item.getPrice();
        }
    }

    public boolean equals(Object o) {
        if (o instanceof ItemOrder) {
            ItemOrder itemOrder = (ItemOrder) o;
            return item.getName().equals(itemOrder.item.getName());
        } else {
            return false;
        }
    }
}
