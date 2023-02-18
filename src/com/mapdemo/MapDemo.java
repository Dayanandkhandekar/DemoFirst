package com.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	firtMap();
}

static void firtMap() {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(10,"A");
	map.put(10,"B");
	map.put(20,"C");
	map.put(30,"D");
	
	Map<Integer, String> map1=new HashMap<Integer, String>();
	map1.put(40,"E");
	map1.putAll(map);
	
	
	System.out.println("size of map==="+map.size());
	
	System.out.println("size of map1=="+map1.size());
	
	System.out.println("Before Remove map1==="+map1);
   map1.remove(30);
   System.out.println("After remove map1==="+map1);
   System.out.println("get ==="+map1.get(40));
     Set<Integer> keyset = map1.keySet();
      System.out.println("keyset==="+keyset);
      Collection<String> values = map1.values();
      System.out.println("values=="+values);
         Set<Entry<Integer, String>> entryset = map1.entrySet();
          System.out.println("entryset==="+entryset);  
          
          System.out.println("contains key==="+map1.containsKey(40));
          
          System.out.println("contains value==="+map1.containsValue("B"));
}
}
