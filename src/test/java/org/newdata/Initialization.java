package org.newdata;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.serial02.Root2;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Initialization {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File fr = new File("C:\\Users\\lenovo\\eclipse-workspace\\Serialization01\\src\\test\\resources\\example.json");
		ObjectMapper ob = new ObjectMapper();
		
		Image im = new Image("images/0001.jpg", 200, 200);
		Thumbnail tb = new Thumbnail("images/thumbnails/0001.jpg", 32, 32);
		
		NewData nd= new NewData("001", "donut", "cake", im, tb);
		//ArrayList<Object> ar = new ArrayList(Arrays.asList(nd));
		ArrayList<NewData> arrayList =new ArrayList<NewData>();
		arrayList.add(nd);
		
		ob.writeValue(fr, arrayList);
		
		System.out.println("done");
	
		
		
		
		
		
		
	}
 
}
