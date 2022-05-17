package com.springboot.demo;

import java.util.List;


public interface CakeService {
	public void createCake(Cake cake);
	public Cake getCake(String cakeName);
	public List<Cake> listCake();
	
	

}
