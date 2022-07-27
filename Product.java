package com.example.department;

public class Product {
    private String name;
    private String Description;
    private int amount;
    ProductType type;
    public Product(String name, String description, int amount, ProductType type) {
        this.name = name;
        Description = description;
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }
}
