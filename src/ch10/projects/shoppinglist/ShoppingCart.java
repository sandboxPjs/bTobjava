package ch10.projects.shoppinglist;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<ItemOrder> itemOrders;
    public ShoppingCart() {
        this.itemOrders = new ArrayList<>();
    }
    public double reportTotalPrice() {
        double sum = 0.0;
        for (int i = 0; i < itemOrders.size(); i++) {
            sum += itemOrders.get(i).calculateCost();
        }
        return sum;
    }

    public String toString() {
        return String.format("Total price: $%.2f", reportTotalPrice());
    }

    // add item order to the shopping cart
    // if shopping cart contains item order then item order increase its quantity
    // if shopping cart doesn't contain item order then item order will be added to the shopping cart
    public void addItemOrder(ItemOrder itemOrder) {
        int itemIndex = itemOrders.indexOf(itemOrder);
        if (itemIndex != -1) {
            ItemOrder old = itemOrders.get(itemIndex);
            old.setQuantity(old.getQuantity() + itemOrder.getQuantity());
        } else {
            itemOrders.add(itemOrder);
        }
    }

    // remove item order from shopping cart
    // method is trying to remove quantity from cart or remove item order if quantity == 0
    public void removeItemOrder(ItemOrder itemOrder) {
        int itemIndex = itemOrders.indexOf(itemOrder);
        if (itemIndex == -1) {
            throw new IllegalArgumentException("ShoppingCart does not contain this item");
        }
        ItemOrder old = itemOrders.get(itemIndex);
        if (old.getQuantity() < itemOrder.getQuantity()) {
            throw new IllegalArgumentException("You are trying to remove too much items from the shopping cart");
        } else if (old.getQuantity() > itemOrder.getQuantity()) {
            old.setQuantity(old.getQuantity() - itemOrder.getQuantity());
        } else {
            itemOrders.remove(itemOrder);
        }
    }

    // search item order by its item name
    public ItemOrder searchItemOrder(String itemName) {
        if (itemName == null) {
            throw new IllegalArgumentException("Item's name is not valid");
        }
        ItemOrder itemOrder = null;
        for (int i = 0; i < itemOrders.size(); i++) {
            if (itemName.equals(itemOrders.get(i).getItem().getName())) {
                itemOrder = itemOrders.get(i);
            }
        }
        return itemOrder;
    }
}
