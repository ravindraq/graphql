package com.springboot.demo;

import java.util.List;

public interface  CakeRepository {
	public void createCake(Cake cake);
	public Cake getCake(String cakeName);
	public List<Cake> getAllCake();

}
