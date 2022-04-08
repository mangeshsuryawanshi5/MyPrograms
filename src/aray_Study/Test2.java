package aray_Study;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		
		char grade[]= new char[8];
		
		
		grade[0]='B';
		grade[1]='D';
		grade[2]='F';
		grade[3]='A';
		grade[4]='E';
		grade[5]='C';
	
			
		Arrays.sort(grade);
		
		System.out.println("======After Sorting========");
		
		for(int i=0;i<=grade.length-1;i++) 
		{
			System.out.println(grade[i]);
		}
		
		System.out.println("====After Descending====");
		
		for(int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}
	}

}
