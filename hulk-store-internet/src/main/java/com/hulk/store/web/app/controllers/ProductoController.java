package com.hulk.store.web.app.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hulk.store.web.app.models.entity.Producto;
import com.hulk.store.web.app.models.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@GetMapping({ "/listar" })
	public String listar(Map<String, Object> model) {
		model.put("productos", productoService.findAll());
		return "producto/listado";
	}

	@RequestMapping(value = "/crear")
	public String crear(Map<String, Object> model) {
		Producto producto = new Producto();
		model.put("producto", producto);
		return "producto/registro";
	}

	@PostMapping("registrar")
	public String guardar(Producto producto, Model model, @RequestParam("file") MultipartFile foto, RedirectAttributes flash) {
		

		if (!foto.isEmpty()) {
			Path directorioRecursos = Paths.get("src//main//resources//static//uploads");
			String rootPath = directorioRecursos.toFile().getAbsolutePath();
			try {
				byte[] bytes = foto.getBytes();
				Path rutaCompleta = Paths.get(rootPath + "//" + foto.getOriginalFilename());
				Files.write(rutaCompleta, bytes);
				producto.setImagen(foto.getOriginalFilename());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		productoService.save(producto);
		flash.addFlashAttribute("success", "Producto guardado con éxito.");
		return "redirect:listar";

	}

}
