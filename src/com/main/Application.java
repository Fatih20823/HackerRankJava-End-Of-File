package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		 try (Scanner scan = new Scanner(System.in)) {
			int count = 1;
			
	        do {
	            String ns = scan.nextLine();
	            System.out.println(count + " " + ns);
	            count++;	        
	        }while(scan.hasNext());
	        
		}
	}
}
