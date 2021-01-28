package css.corp.corejava.store;

public interface StoreServiceProvider {

	double sellProduct(int productID, int qty);

	boolean updateProduct(int productID, int qty, double price);

	boolean purchaseProduct(int productID, int qtyPurchased);

}
