package com.hulk.store.web.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hulk.store.web.app.models.service.IProductoService;

@Controller
public class IndexController {

	@Autowired
	private IProductoService productoService;

	
	@GetMapping({"/index", "/", "home" })
	public String index(Map<String, Object> model) {
		model.put("productos", productoService.findAll());
		return "index";
	}
	
}
