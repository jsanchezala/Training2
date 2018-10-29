package springBoot.mvc.practica2.repositories;

import org.springframework.data.repository.CrudRepository;
import springBoot.mvc.practica2.model.Producto;

import java.util.HashMap;
import java.util.List;

public interface ProductRepository extends CrudRepository<Producto, String> {

    //HashMap<String, Producto> findAll();
    List<Producto> findAll();
    Producto findByDescripcion(String descripcion);
    Producto findByCodigo(String code);

}
