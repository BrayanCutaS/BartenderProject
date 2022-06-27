package com.bt.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bt.modelos.VasosBartender;

@Repository
public interface InterfaceVasosBartender extends JpaRepository<VasosBartender,Integer> {

	
	
}
