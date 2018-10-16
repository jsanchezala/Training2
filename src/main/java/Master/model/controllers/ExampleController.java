package Master.model.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import Master.model.model.ExampleObject;
import Master.model.model.Producto;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

@Controller
public class ExampleController {

    HashMap<Integer,Producto>  listaProductos = new HashMap<>();

    @GetMapping("/list")
    public String list(Model model){

        Producto producto = new Producto("H33", "Botas", "Botas Futbol", 3);
        listaProductos.put(1,producto);

        model.addAttribute("listaProductos", listaProductos);
        return "list";
    }

    @GetMapping("/text")
    public String text(Model model){
        ExampleObject exampleObject =
                new ExampleObject("Lionel","Messi");
        model.addAttribute("greetings", "Hi guys!");
        model.addAttribute("obj", exampleObject);
        return "text";
    }

    @GetMapping("/conditional")
    public String conditional(Model model){
        model.addAttribute("hidden", "false");
        return "conditional";
    }

    @GetMapping("/iteration")
    public String iteration(Model model){
        List<String> greetings = Arrays.asList("Hi!","Hello!","What's up!");
        model.addAttribute("greetings", greetings);
        return "iteration";
    }

}