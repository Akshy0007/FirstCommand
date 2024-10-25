package org.deserialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.serial02.Batter;
import org.serial02.Batters;
import org.serial02.Item;
import org.serial02.Items;
import org.serial02.Root2;
import org.serial02.Topping;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example8 {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
        ObjectMapper mapper = new ObjectMapper();
        FileReader fr = new FileReader("C:\\Users\\lenovo\\eclipse-workspace\\Serialization01\\src\\test\\resources\\example.json");
Items readValue = mapper.readValue(fr, Items.class);
        //        Item items = readValue.getItems();
//        List<Root2> item = items.getItem();
//        String id = item.get(0).getId();
//        Batters batter = item.get(0).getBatter();
//        List<Batter> bt = batter.getBatter();
//        Batter bat2 = bt.get(1);
//        String id1 = bat2.getType();
//       
      
     
    	 Item items = readValue.getItems();
         List<Root2> item = items.getItem();
         Root2 rot = item.get(0);
         List<Topping> topping = rot.getTopping();
        Topping topping2 = topping.get(4);

String type = topping2.getType();
         System.out.println(type + " success");
		
	
          
		
	

	}
}

	
	


		
		
		
		
		