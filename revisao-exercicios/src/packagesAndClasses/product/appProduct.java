package packagesAndClasses.product;

public class appProduct {

    public static void main(String[] args) {

        Product apple = new Product();
        apple.productId = 1;
        apple.productName = "Apple";
        apple.price = 5.99;

        Inventory inventoryApple = new Inventory();
        inventoryApple.product = apple;
        inventoryApple.quantity = 15;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 1;
        warehouse.warehouseName = "Fruits";
        warehouse.inventoryList.add(inventoryApple);

    }

}
