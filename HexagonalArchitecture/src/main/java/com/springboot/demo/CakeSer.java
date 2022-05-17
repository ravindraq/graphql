package com.springboot.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CakeSer implements CakeService {
	@Autowired
	CakeRepository cr;

	@Override
	public void createCake(Cake cake) {
		cr.createCake(cake);
		
	}

	@Override
	public Cake getCake(String cakeName) {
		 return cr.getCake(cakeName);
	}

	@Override
	public List<Cake> listCake() {
		return cr.getAllCake();
	}

}
