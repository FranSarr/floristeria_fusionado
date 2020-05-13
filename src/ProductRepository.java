import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static List<Product> articles=new ArrayList<>();


    public ProductRepository(){

    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(articles);
    }


    public void addProduct(Product article) throws Exception{
        if(article==null) throw new Exception();
        articles.add(article);
    }


}
