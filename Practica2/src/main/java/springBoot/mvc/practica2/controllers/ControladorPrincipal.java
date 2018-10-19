package springBoot.mvc.practica2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springBoot.mvc.practica2.model.Producto;

import java.util.HashMap;

@Controller
public class ControladorPrincipal {
	HashMap<Integer, Producto> listaProductos = new HashMap<>();
	
	@GetMapping(value = "/")
	public String principal2(Model model) {
		model.addAttribute("Welcome", "Welcome to the shop");
		return "paginaPrincipal";
	}
	
	
	@GetMapping(value = "/list")
	public String getList(Model model) {
		Producto producto1 = new Producto("1232", "casta", "cosas", 23);
		listaProductos.put(1, producto1);
		model.addAttribute("listaProductos", listaProductos);
		return "listaProductos";
	}
	
	@GetMapping(value = "/newProduct")
	public String crearProducto(Model model) {
		model.addAttribute("listaProductos", listaProductos);
		return "nuevoProducto";
	}
}
