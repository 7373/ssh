package com.test;

import java.util.HashMap;
import java.util.Map;

//import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;
 
public class Test3 {
	public static void main(String args[]){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "qwieoo");
		map.put(2, "jfieoj");
		map.put(3, "sjfoo");
		for(Integer key:map.keySet()){
			System.out.println("key="+key);
		}
		for(String value:map.values()){
			System.out.println("value="+value);	
		}
		for(Map.Entry<Integer, String>entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
	}
}
