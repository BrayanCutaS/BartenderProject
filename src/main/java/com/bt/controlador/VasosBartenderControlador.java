package com.bt.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.modelos.VasosBartender;
import com.bt.service.VasosBartenderService;

@RestController
@RequestMapping("/Array")
public class VasosBartenderControlador {

	@Autowired
	private VasosBartenderService vasosService;
	
	@GetMapping
	public ResponseEntity<List<VasosBartender>> vasos(){
		
		return new ResponseEntity<>(vasosService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VasosBartender> findById(@PathVariable Integer id){
		return new ResponseEntity<>(vasosService.get(id), HttpStatus.OK);
	}
	
	@GetMapping("/{id}/{Q}")
	public ResponseEntity<String> findQ(@PathVariable Integer id, @PathVariable Integer Q){
		String rta =vasosService.get(id).respuesta(Q);
		
		return new ResponseEntity<>(rta, HttpStatus.OK);
		
	}
	
}
