package be.pxl.ja.robbery;

public class Product implements Comparable<Product> {
    private String name;
    private double weight;
    private double price;

    public Product() {

    }

    public Product(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + ", " + weight + "kg, €" + price;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(o.price, this.price);
    }
}
