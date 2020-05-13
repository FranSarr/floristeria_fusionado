public class Main {

    private static String flowershop_name ="Floristeria Srta. Pepis";
    private static ProductRepository articles = new ProductRepository();

    // Created a new FlowerShop with a list of Products
    private static Flowershop pepisflowers = new Flowershop(flowershop_name,articles);


    public static void main(String[] args) throws Exception {

        pepisflowers.addFlower("gardenia", 23.5, "blanca");
        pepisflowers.addDecor("tiesto",11.3,"plastic");
        pepisflowers.addTree("eucalipto",44.8,1.2);


        // TODO stock
    }

}
