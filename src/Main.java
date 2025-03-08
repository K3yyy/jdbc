import controller.ProductController;
import model.dao.ProductDAO;
import model.dao.ProductDAOImpl;
import view.ProductView;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres", "postgres", "143"
            );

            ProductDAO productDAO = new ProductDAOImpl(connection);
            ProductView productView = new ProductView();
            ProductController productController = new ProductController(productDAO, productView);

            // Add a product
            productController.addProduct("iPhone", 3000, 300);
            // Delete a product by ID
            productController.deleteProduct(1);

            // Display all products
            productController.displayAllProducts();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
