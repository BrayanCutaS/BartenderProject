package com.bt.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bt.modelos.VasosBartender;

@Repository
public interface InterfaceVasosBartender extends CrudRepository<VasosBartender,Integer> {

	
	
}
