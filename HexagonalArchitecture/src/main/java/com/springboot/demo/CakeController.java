package com.springboot.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Component

@RestController
@RequestMapping("/cake")
public class CakeController implements CakeRestUI{
    @Autowired
	CakeService cs;
	public void createCake(Cake cake) {
		cs.createCake(cake);
	}
	
	@Override
	public Cake getCake(String cakeName) {
		return cs.getCake(cakeName);
	}
	@Override
	public List<Cake> listCakes() {
		return cs.listCake();
	}
	
	

}
