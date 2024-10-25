package org.samplejson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Root {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f = new File("C:\\Users\\lenovo\\eclipse-workspace\\Serialization01\\src\\test\\resources\\sample.json");
		ObjectMapper ob = new ObjectMapper();
		
		List<Comp> company =new ArrayList<Comp>();
		company.add(new Comp ("akshy"));
		company.add(new Comp ("coimbatore"));
		company.add(new Comp (1090647));
		company.add(new Comp(90000.00));
		//Comp cm =  new Comp(company);
		
		
		
		List<Addr> adds = new ArrayList<Addr>();
		
		adds.add(new Addr (641105));
		adds.add(new Addr (9791640019l));
		adds.add(new Addr ("active"));
		adds.add(new Addr ("tester"));
		
		comapny cm = new comapny("aqkshy", "india", 1090467, 10890.98);
		
		ob.writeValue(f, cm);
//		Comp cp = new Comp(company);
//		cp.equals(cm);
//		ob.writeValue(f, cm);
		
//		comapny cm= new comapny("kumar", "china", 109078, 9008.98);
//		ob.writeValue(f, cm);
		
		
		
		
				
				
				
				
		
		
		
		
		
		
		
		
	}

}
