package test;
import java.util.*;

public class Input {
	public static void main(String[] args){
		String s;
		 Scanner in = new Scanner(System.in);
		System. out. print("Enter a string");
		s = in. nextLine();	
		for ( int i=1;i<=s.length();i++) {
		s= s.replace("\\s","");
		continue;}
		System.out.println(s);
		System.out.println("Length is:::"+s.length());
			
	}
}