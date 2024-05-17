import java.util.*;

class Demo implements Comparable{

	String str;

   	Demo(String str){

     		this.str=str;
    	}
   
       	public int compareTo(Object obj){

	       	return str.compareTo(obj.toString());
       	}

	public String toString(){
	
		return str;
	}
    
}
class TreeSetDemo {
    
   	 public static void main(String []args){
      
		 TreeSet ts=new TreeSet();
	       	 ts.add(new Demo("Shree"));  
		 ts.add(new Demo("Nishant"));
		 ts.add(new Demo("Aditya"));
		 ts.add(new Demo("Bhavesh"));
		 System.out.println(ts);
	 }
}
