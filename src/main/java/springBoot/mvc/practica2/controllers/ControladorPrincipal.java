package springBoot.mvc.practica2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import springBoot.mvc.practica2.model.Producto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@Controller
public class ControladorPrincipal {
    private Integer variable = 0;
    private HashMap<Integer,Producto>  listaProductos = new HashMap<>();

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
        return "mostrarProducto2";
    }

    @PostMapping("/newProduct")
    public String readGreeting(@ModelAttribute Producto producto) {
        /*model.addAttribute("codigo", producto.getCódigo());
        model.addAttribute("nombre", producto.getNombre());
        model.addAttribute("descripcion", producto.getDescripcion());
        model.addAttribute("precio", producto.getPrecio());*/
        variable++;
        listaProductos.put(variable,producto);
        return "mostrarProducto";
    }

    @RequestMapping(value = "/delete/{id}")
    public String remove(@PathVariable Integer id){
        listaProductos.remove(id);
        return "redirect:/list";
    }

    @GetMapping(value = "/list")
    public String getList(Model model) {
        model.addAttribute("listaProductos", listaProductos);
        return "listaProductos";
    }


}