package com.bt.modelos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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
	
	public VasosBartender () {
		
	}

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
	
	
	public static boolean checkPrime(int n)
	{
		if(n <= 1)
			return false;
		
		for(int i=2; i<= n/2; i++)
		{
			if((n % i) == 0)
				return false;
		}
		
		return true;
	}
	
	public static int[] fillArray(int count) {
	    int[] arr = new int[count];
	    int n = 0;
	    for (int i = 1; n < arr.length; i++) {
	        if (checkPrime(i)) {
	            arr[n] = i;
	            n++;
	        }
	    }
	    return arr;
	}
	
	
	public List<Integer> stringToListInt(){
		List<String> rtaS = new ArrayList<String>(Arrays.asList(inputArray.split(",")));
		List<Integer> rtaI = new ArrayList<Integer>();
		
		for(String s : rtaS) rtaI.add(Integer.valueOf(s));
		
		return rtaI;
	}
	
	public String respuesta(Integer q) {
		String rta="";
		int[] primes = this.fillArray(q);
		boolean fIt = true;
		
		
		List<Integer> a = this.stringToListInt();
		int qActual = q;
		
		for (int i=0; i<qActual ; i++) {
			//fIt=true;
			
			for(int j=a.size()-1; j>=0; j--) {

				if ((a.get(j)%primes[i])== 0) {
					
					if(fIt==true) {
						rta = a.get(j)+"";
					}else {
						rta = rta+ ","+ a.get(j);	
					}
					a.remove(j);
				}
				fIt=false;
			}
			
			if (i== q-1) {
				
				for(int k =0 ; k<a.size(); k++) {
					rta = rta +"," +a.get(k) ;
				}
			}
			
		}
		
		return rta;
	}
}
