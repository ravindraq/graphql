package com.springboot.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
@Component
public class CakeRepo implements CakeRepository{
	 private Map<String, Cake> cakeStore= new HashMap<String, Cake>();

	public void createCake(Cake cake) {
		cakeStore.put(cake.getName(), cake);
		
	}

	public Cake getCake(String cakeName) {
		// TODO Auto-generated method stub
		return cakeStore.get(cakeName);
	}

	public List<Cake> getAllCake() {
		// TODO Auto-generated method stub
		return cakeStore.values().stream().collect(Collectors.toList());
	}

}
