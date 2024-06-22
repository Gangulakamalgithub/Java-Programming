package Opps.InventoryTracking;

public class MainItems {
    public static void main(String[] args) {
        InventoryItems inventoryItem1;
        inventoryItem1 = new InventoryItems();

        System.out.println("Id: " + inventoryItem1.id);
        System.out.println("Name: " + inventoryItem1.name);
        System.out.println("Category: " + inventoryItem1.category);
        System.out.println("Quantity: " + inventoryItem1.quantity);
        System.out.println("Price: " + inventoryItem1.price);

        inventoryItem1.id = 100;
        inventoryItem1.name = "NoteBook";
        inventoryItem1.category = "Office Supply" ;
        inventoryItem1.quantity  = 50 ;
        inventoryItem1.price = 2.50;

        System.out.println("Id: " + inventoryItem1.id);
        System.out.println("Name: " + inventoryItem1.name);
        System.out.println("Category: " + inventoryItem1.category);
        System.out.println("Quantity: " + inventoryItem1.quantity);
        System.out.println("Price: " + inventoryItem1.price);

        InventoryItems inventoryItem2;
        inventoryItem2 = new InventoryItems();


        inventoryItem2.id = 101;
        inventoryItem2.name = "Laptops";
        inventoryItem2.category = "Electronics" ;
        inventoryItem2.quantity  = 20 ;
        inventoryItem2.price = 800.00;

        System.out.println("Id: " + inventoryItem2.id);
        System.out.println("Name: " + inventoryItem2.name);
        System.out.println("Category: " + inventoryItem2.category);
        System.out.println("Quantity: " + inventoryItem2.quantity);
        System.out.println("Price: " + inventoryItem2.price);



    }
}
