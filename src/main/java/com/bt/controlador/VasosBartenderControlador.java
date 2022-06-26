package com.bt.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.modelos.VasosBartender;
import com.bt.repositorio.InterfaceVasosBartender;

@RestController
@RequestMapping("/Array")
public class VasosBartenderControlador {

	@Autowired
	private InterfaceVasosBartender interfaceArrays;
	
	@GetMapping
	public List<VasosBartender> vasos(){
		
		return (List<VasosBartender>) interfaceArrays.findAll();
	}
	
}
