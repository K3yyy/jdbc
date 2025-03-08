package model.entity;

import java.util.Date;

public class Product {
    private int id;
    private String name;
    private double unitPrice;
    private int quantity;
    private Date importedDate;

    public Product(int id, String name, double unitPrice, int quantity, Date importedDate) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.importedDate = importedDate;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }
    public Date getImportedDate() { return importedDate; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setImportedDate(Date importedDate) { this.importedDate = importedDate; }
}
