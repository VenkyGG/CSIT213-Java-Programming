package Lectures.Lec5;

public class Product {
    private String code;
    private String name;
    private String category;
    private double price;

    public Product(String code, String name, String category, double price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCode() { return code; }

    public String getCategory() { return category; }

    public String toString() {
        return String.format("%s %s %s %.2f", code, name, category, price);
    }
}