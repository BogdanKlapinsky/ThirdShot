import java.util.Objects;

public class Product {

    private String name;

    private double price;

    private String currency;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Product(String name, double price, String currency ) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getCurrency());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getPrice() == product.getPrice() &&
                getName().equals(product.getName()) &&
                getCurrency().equals(product.getCurrency());
    }

    public String toString() {
        return this.name + "   " + this.price + " " + this.currency;
    }
}

