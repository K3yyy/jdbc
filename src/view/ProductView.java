package view;

import model.entity.Product;

import java.util.List;

public class ProductView {
    public void displayProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.getId() + " | " + product.getName() + " | " +
                    product.getUnitPrice() + " | " + product.getQuantity() +
                    " | " + product.getImportedDate());
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
