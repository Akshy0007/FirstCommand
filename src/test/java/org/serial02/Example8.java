package org.serial02;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example8 {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File fr= new File("C:\\Users\\lenovo\\eclipse-workspace\\Serialization01\\src\\test\\resources\\example.json");
		ObjectMapper ob=new ObjectMapper();
		
		List<Batter> batter= new ArrayList<Batter>();
		batter.add(new Batter("1001","Akshy"));
		batter.add(new Batter("1002","kumar"));
		batter.add(new Batter("1003","abi"));
		batter.add(new Batter("1004","veni"));
		batter.add(new Batter("1005","gokul"));
		Batters bat=new Batters(batter);
		
//		List<Batter> batter1= new ArrayList<Batter>();
//		batter1.add(new Batter("1001","Akshy"));
//		batter1.add(new Batter("1002","kumar"));
//		batter1.add(new Batter("1003","abi"));
//		batter1.add(new Batter("1004","veni"));
//		batter1.add(new Batter("1005","gokul"));
//		Batters bat1=new Batters(batter1);
//		
//		List<Batter> batters = Arrays.asList(
//                new Batter("1001", "Regular"),
//                new Batter("1002", "Chocolate")
//            );
		
		
		
		List<Topping> topping=new ArrayList<Topping>();
		
		topping.add(new Topping("2001","cherry"));
		topping.add(new Topping("2001","apple"));
		topping.add(new Topping("2001","orange"));
		topping.add(new Topping("2001","strawberry"));
		topping.add(new Topping("2001","cucumber"));
		
		
		//Root2 root = new Root2(id, type, name, ppu, batter, topping)
		Root2 root= new Root2("001", "regular", "jack", 0.78, bat, topping);
		ArrayList<Root2> arrayList =new ArrayList<Root2>();
		arrayList.add(root);
        Item it=new Item(arrayList);
	Items it1=new Items(it);
//		ArrayList<Items> array =new ArrayList<Items>();
//		array.add(it1);
		ob.writeValue(fr, it1);
		
		
}
}

		
		
		
		
		