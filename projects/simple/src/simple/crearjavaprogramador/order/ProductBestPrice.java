package simple.crearjavaprogramador.order;

import java.util.Comparator;
import simple.crearjavaprogramador.entities.Product;

public class ProductBestPrice implements Comparator<Product> {

    @Override
    public int compare(Product t, Product t1) {
        int solution = 0;
        if( t.getAmount() < t1.getAmount() ){
            solution = -1;
        }else if( t.getAmount() > t1.getAmount() ){
            solution = 1;
        }
        return solution;
    }
    
}
