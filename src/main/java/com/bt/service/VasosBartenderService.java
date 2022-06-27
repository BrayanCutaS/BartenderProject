package com.bt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.modelos.VasosBartender;
import com.bt.repositorio.InterfaceVasosBartender;

@Service
public class VasosBartenderService {
	
	@Autowired
	private InterfaceVasosBartender repository;
	
	public List <VasosBartender> findAll(){
		return repository.findAll();
	}
	
	
	public VasosBartender get (Integer id) {
		return repository.findById(id).get();
	}

	

}
