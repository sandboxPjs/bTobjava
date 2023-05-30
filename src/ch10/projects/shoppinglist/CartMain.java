package ch10.projects.shoppinglist;

import java.sql.SQLOutput;

public class CartMain {
    public static void main(String[] args) {
        int testNumber = 1;
        // add item to shopping cart and print total
        System.out.println("-------------------------------------------------------");
        System.out.println("Test №" + testNumber);
        System.out.println("-------------------------------------------------------");
        Item item1 = new Item("hat", 5);
        Discount discountItem1 = new Discount(2, 3);
        ItemOrder itemOrder1 = new ItemOrder(item1, 3, discountItem1);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItemOrder(itemOrder1);
        System.out.println(shoppingCart);
        testNumber++;
        // add item to shopping cart without discount and print total
        System.out.println("-------------------------------------------------------");
        System.out.println("Test №" + testNumber);
        System.out.println("-------------------------------------------------------");
        Item item2 = new Item("meat", 10);
        ItemOrder itemOrder2 = new ItemOrder(item2, 3, null);
        shoppingCart.addItemOrder(itemOrder2);
        System.out.println(shoppingCart);
        testNumber++;
        // add item with the same name and print total
        System.out.println("-------------------------------------------------------");
        System.out.println("Test №" + testNumber);
        System.out.println("-------------------------------------------------------");
        Item item3 = new Item("hat", 5);
        Discount discountItem3 = new Discount(2, 3);
        ItemOrder itemOrder3 = new ItemOrder(item3, 1, discountItem3);
        shoppingCart.addItemOrder(itemOrder3);
        System.out.println(shoppingCart);
        testNumber++;
        // search item order by it's item name and print it's quantity
        System.out.println("-------------------------------------------------------");
        System.out.println("Test №" + testNumber);
        System.out.println("-------------------------------------------------------");
        ItemOrder result = shoppingCart.searchItemOrder("meat");
        if (result != null) {
            System.out.printf("Item name: %s,\nQuantity: %d\n", result.getItem().getName(), result.getQuantity());
        } else {
            System.out.println("Item order with a given name wasn't found");
        }
        testNumber++;
        // remove item order doesn't exist in a shopping cart
        // throw exception
        System.out.println("-------------------------------------------------------");
        System.out.println("Test №" + testNumber);
        System.out.println("-------------------------------------------------------");
//        Item item4 = new Item("big hat", 6);
//        ItemOrder itemOrder4 = new ItemOrder(item4, 1, null);
//        shoppingCart.removeItemOrder(itemOrder4);
        testNumber++;
        // remove item order with quantity < the quantity in the shopping cart
        System.out.println("-------------------------------------------------------");
        System.out.println("Test №" + testNumber);
        System.out.println("-------------------------------------------------------");
        Item item5 = new Item("meat", 10);
        ItemOrder itemOrder5 = new ItemOrder(item5, 1, null);
        shoppingCart.removeItemOrder(itemOrder5);
        System.out.println(shoppingCart);
        testNumber++;
        // remove item order with quantity > the quantity in the shopping cart
        // throw exception
        System.out.println("-------------------------------------------------------");
        System.out.println("Test №" + testNumber);
        System.out.println("-------------------------------------------------------");
//        Item item6 = new Item("meat", 10);
//        ItemOrder itemOrder6 = new ItemOrder(item5, 3, null);
//        shoppingCart.removeItemOrder(itemOrder6);
        System.out.println(shoppingCart);
        testNumber++;
        // remove item order with quantity = the quantity in the shopping cart
        System.out.println("-------------------------------------------------------");
        System.out.println("Test №" + testNumber);
        System.out.println("-------------------------------------------------------");
        Item item7 = new Item("meat", 10);
        ItemOrder itemOrder7 = new ItemOrder(item7, 2, null);
        shoppingCart.removeItemOrder(itemOrder7);
        System.out.println(shoppingCart);
        ItemOrder result2 = shoppingCart.searchItemOrder("meat");
        if (result2 != null) {
            System.out.printf("Item name: %s,\nQuantity: %d\n", result2.getItem().getName(), result2.getQuantity());
        } else {
            System.out.println("Item order with a given name wasn't found");
        }
    }
}
