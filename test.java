public class test {
    
}
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main {
  public static int arr[] = new int [1000];
  public Main(){
  	Arrays.fill(arr, 0);
  }
  public static void recur(String s, String t) {
  	if(t.length() == s.length()){
  		System.out.println(t);
  		return;
  	}
 
  	//arr = {0,0,0}
  	//t = ""
 
  	/*run1:=  i=0, 
  			  t= "a"; arr = {1,0,0}
  				run2:  i=0 as arr[0]==1 then continue
  				       i=1 => 
  				    	t="ab"; arr = {1,1,0}
  				          run3: i=0 as arr[0]==1 then continue
  				                i=1 as arr[1]==1 then continue
  				                i=2:
  				                t="abc" ; arr = {1,1,1}
  				        		  run4 := print and return
  				        		t = "ab" ; arr= {1,1,1}
  				        		
  				        		//complete
  				        t="a"; arr = {1,1,1}
  				       i=2 => 
  				          
  				          
  				          
  	*/		  
    for(int i=0;i<s.length();i++){
    	if(arr[i]==1){
    		continue;
    	}
    	arr[i]=1;
    	t+=s.charAt(i);
    	recur(s,t);
    	t = t.substring(0, t.length() - 1);
    	arr[i]=0;
    }
  }
}
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abc"; 
		String t = "";
 
		Main.recur(s,t);
 
	// 	for(int i=0;i<3;i++){
	// 		t+=s.charAt(i);
	// 		for(int j=0;j<3;j++){
	// 			t+=s.charAt(j);
	// 			for(int k=0;k<3;k++){
	// 				t+=s.charAt(k);
	// 				System.out.println(t);
	// 				t = t.substring(0, t.length() - 1);
	// 			}
	// 			t = t.substring(0, t.length() - 1);
	// 		}
	// 		t = t.substring(0, t.length() - 1);
	// 	}
	 }
}

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main {
  public static void recur(String s, String t, int i) {
  	if(i==s.length()) {
  		System.out.println(t);
  		return;
  	}
 
  	//picked
  	recur(s,t+s.charAt(i), i+1);
 
  	//skip
  	recur(s,t,i+1);
  }
}
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abc"; //print all the subsequence 
		String t = "";
 
 
		Main.recur(s,t,0);
 
		/*
		abc => t=""
			picked a : t= "a"
			           picked b := t= "ab"
			                       picked c := t="abc"
			                       skipped c:= t= "ab"
			           skipped b := t= "a"
			                        picked c := t="ac"
			                        skipped c:= t= "a"
			skipped a : t= ""
			           picked b := t= "b"
			                       picked c := t="bc"
			                       skipped c:= t= "b"
			           skipped b := t= ""
			                        picked c := t="c"
			                        skipped c:= t= ""                         
 
		*/	
	 }
}