package basics;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
public class VectorDemo {
public static void main(String[] args) {
	Vector<Integer>li=new Vector<Integer>(); 
	li.add(2);
	li.add(9);
	li.add(5);
	li.add(3);
	System.out.println(li);
	TreeSet<String> set=new TreeSet<String>();  
	set.add("Ravi");  
	set.add("Vijay");  
	set.add("Ravi");  
	set.add("Ajay"); 
	System.out.println(set);
	Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul"); 
	  System.out.println(hm);
	  HashMap<Integer,String> map=new HashMap<Integer,String>();          
      map.put(100,"Amit");    
      map.put(101,"Vijay");    
      map.put(102,"Rahul");  
      map.put(103, "Gaurav");  
    System.out.println(map);  
  
    map.remove(100);  
    System.out.println(map);  
    TreeMap<Integer,String> map1=new TreeMap<Integer,String>();    
    map1.put(100,"Amit");    
    map1.put(102,"Ravi");    
    map1.put(101,"Vijay");    
    map1.put(103,"Rahi"); 
    System.out.println(map1); 
    
   ConcurrentHashMap<String, Integer>  mymap = new ConcurrentHashMap<String,  Integer>(); 
   mymap.put("AAA", 10);   
   mymap.put("BBB", 15);   
   mymap.put("CCC", 25);   
   mymap.put("DDD", 255);   
   mymap.put("EEE",30); 
   System.out.println(mymap);
     
   ConcurrentSkipListMap<Integer,String>slm=new ConcurrentSkipListMap<Integer,String>();
   slm.put(1,"A");
   slm.put(2,"B");
   slm.put(3,"C");
   slm.put(4,"D");
   slm.put(5,"E");
   System.out.println(slm);
   System.out.println(slm.pollLastEntry());
         
   CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<String>();
   set1.add("GeeksforGeeks");
   System.out.println(set1);
}
}
