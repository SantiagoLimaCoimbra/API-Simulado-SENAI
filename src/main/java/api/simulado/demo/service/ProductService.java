package api.simulado.demo.service;

import api.simulado.demo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private List<Product> products;

    public ProductService(){
        products = new ArrayList<>();
    }

    public Product newProduct(Product product){
        products.add(product);
        return product;
    }

    public List<Product> searchAllProducts(){
        return products;
    }

    public Product searchProduct(Long id) throws Exception {

        Optional<Product> product = products.stream().filter(p -> p.getId() == id).findFirst();

        if (product.isPresent()){
            return product.get();
        } else {
            throw new Exception("Produto não encontrado!");
        }
    }

    public void deleteProduct(Long id) throws Exception {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId().equals(id)) {
                iterator.remove();
                return;
            }
        }
        throw new Exception("Id de Produto não encontrado!");
    }

    public Product editProduct(Long id, Product updatedProduct) throws Exception {
        ListIterator<Product> iterator = products.listIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId().equals(id)) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                return product;
            }
        }
        throw new Exception("Id de Produto não encontrado!");
    }

}
