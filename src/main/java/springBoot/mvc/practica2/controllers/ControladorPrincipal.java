package springBoot.mvc.practica2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import springBoot.mvc.practica2.model.Producto;
import springBoot.mvc.practica2.repositories.ProductRepository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springBoot.mvc.practica2.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class ControladorPrincipal {
    private Integer variable = 0;
    //private HashMap<String,Producto>  listaProductos = new HashMap<>();
    List<Producto> listaProductos = new ArrayList<>();

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String select() {
        return "index";
    }

    @GetMapping("/newProduct")
    public String sendGreeting(Model model) {
        model.addAttribute("producto", new Producto());
        return "crearProducto";
    }

    @GetMapping("/show/{id}")
    public String mostrarProducto(Model model, @PathVariable Integer id) {
        model.addAttribute("Producto", listaProductos.get(id));
        return "mostrarProductoListaProductos";
    }

    @PostMapping("/newProduct")
    public String readGreeting(@ModelAttribute Producto producto) {
        /*model.addAttribute("codigo", producto.getCódigo());
        model.addAttribute("nombre", producto.getNombre());
        model.addAttribute("descripcion", producto.getDescripcion());
        model.addAttribute("precio", producto.getPrecio());*/

        productRepository.save(producto);
        return "mostrarProductoAnadidoCorrecto";
    }

    @RequestMapping(value = "/delete/{producto}")
    public String remove(@PathVariable Producto producto){
        productRepository.delete(producto);
        //listaProductos.remove(id);
        return "redirect:/list";
    }

    @GetMapping(value = "/list")
    public String getList(Model model) {

        //listaProductos = productRepository.findAll();
        model.addAttribute("listaProductos", productRepository.findAll());
        return "listaProductos";
    }


}