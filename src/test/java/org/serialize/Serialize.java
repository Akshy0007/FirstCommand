package org.serialize;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.List;

public class Serialize {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File fr = new File("C:\\Users\\lenovo\\eclipse-workspace\\Serialization01\\src\\test\\resources\\serial.json");
		ObjectMapper objectMapper = new ObjectMapper();
		List<Batter> batterList = new ArrayList<Batter>();
		//batterList.get("id");
		batterList.add(new Batter("1001", "Regular"));
		batterList.add(new Batter("1002", "Chocolate"));

		Batters batters = new Batters(batterList);
		
//		List<Batter> batterList1 = new ArrayList<Batter>();
//		batterList1.add(new Batter("2001", "Regular"));
//		batterList1.add(new Batter("2002", "Chocolate"));
//
//		Batters batters1 = new Batters(batterList);
		
		

		List<Topping> toppingList = new ArrayList<Topping>();
		toppingList.add(new Topping("5001", "None"));
		toppingList.add(new Topping("5002", "Glazed"));

		Donut donut = new Donut("0001", "donut", "Cake", 0.55, batters, toppingList);

		List<Donut> toppingList1 = new ArrayList<Donut>();
		toppingList1.add(new Donut("0001", "donut", "Cake", 0.55, batters, toppingList));
		toppingList1.add(new Donut("0002", "donut", "Cake", 0.55, batters, toppingList));

		
		objectMapper.writeValue(fr, toppingList1);

	}

}
