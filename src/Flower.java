public class Flower extends Product {

    private String colour;

    public Flower(String name, double price, String colour) throws Exception {
        super(name, price);
        this.colour = colour;
    }
}
