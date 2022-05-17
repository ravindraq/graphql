package com.springboot.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CakeRestUI {
	@PostMapping
	void createCake(@RequestBody Cake cake);
	@GetMapping("/{name}")
	public Cake getCake(@PathVariable String name);
	@GetMapping
	public List<Cake>listCakes();
	

}
