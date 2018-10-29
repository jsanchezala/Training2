package springBoot.mvc.practica2.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springBoot.mvc.practica2.model.Producto;
import springBoot.mvc.practica2.repositories.ProductRepository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

@Component
public class DatabaseLoader {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    private void initDatabase(){

        productRepository.save(
                new Producto("001ABC","Coca-cola","Bebida", new BigDecimal(51.6))
        );

        productRepository.save(
                new Producto("123123","Fanta","Bebida", new BigDecimal(45.3))
        );

        List<Producto> productList = productRepository.findAll();
        productList.stream().forEach(product -> System.out.println("Code: " + product.getCodigo()));

    }

}
