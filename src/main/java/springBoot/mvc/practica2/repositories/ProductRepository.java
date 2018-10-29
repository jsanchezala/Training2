package springBoot.mvc.practica2.repositories;

import org.springframework.data.repository.CrudRepository;
import springBoot.mvc.practica2.model.Producto;

import java.util.List;

public interface ProductRepository extends CrudRepository<Producto, String> {

    List<Producto> findAll();

}
