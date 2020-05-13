public class Tree extends Product{

    private Double height;

    public Tree(String name, double price, Double height) throws Exception {
        super(name, price);
        this.height = height;
    }
}
