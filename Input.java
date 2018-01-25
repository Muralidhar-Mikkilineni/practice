package sample;

import java.util.Scanner;

public class Input {
	static String name;
	public void input(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cuisine_name:");
        name=sc.next();
	}

}
