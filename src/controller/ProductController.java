package controller;

import model.dao.ProductDAO;
import model.entity.Product;
import view.ProductView;

import java.util.Date;
import java.util.List;

public class ProductController {
    private ProductDAO productDAO;
    private ProductView productView;

    public ProductController(ProductDAO productDAO, ProductView productView) {
        this.productDAO = productDAO;
        this.productView = productView;
    }

    public void addProduct(String name, double unitPrice, int quantity) {
        Product product = new Product(0, name, unitPrice, quantity, new Date());
        productDAO.addProduct(product);
        productView.displayMessage("Product added successfully!");
    }

    public void displayAllProducts() {
        List<Product> products = productDAO.getAllProducts();
        productView.displayProducts(products);
    }
}
