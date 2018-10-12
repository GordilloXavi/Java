package trash;

import java.util.*;

import javax.swing.*;

public class Dinglemouse {
	
	public static void main(String[] e){
		
		System.out.println(new Dinglemouse().whatTimeIsIt(360));
		
		
	}

	  public static String whatTimeIsIt(final double angle) {

	  int hours = (int)(angle / 30);
	  
	  System.out.println(hours);
	  
	  int minutes = (int)((angle-hours*30)/0.5);
	  
	  String h =(hours>= 10)? ""+hours : "0"+hours;
	  
	  String m =(minutes>=10)? ""+minutes : "0"+minutes;
	  
	  
	  
	  String result = h+":"+m ;
	  
	  

	  return result;
	  }

	}