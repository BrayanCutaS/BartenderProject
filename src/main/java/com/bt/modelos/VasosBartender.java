package com.bt.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="arrays", catalog="bartender",schema="")
public class VasosBartender {

	@Id
	@Column
	private Integer id;
	
	@Column(name="input_array")
	private String inputArray;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInputArray() {
		return inputArray;
	}

	public void setInputArray(String inputArray) {
		this.inputArray = inputArray;
	}
	
	
}
