package com.Logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter you class info");
		boolean Enteryouclassinfo = sc.nextBoolean();
		
		System.out.println("Are you coming classes daily...?");
		boolean Areyoucomingclassesdaily = sc.nextBoolean();
		
		System.out.println("Are you coming every mock classes");
		boolean Areyoucomingeverymockclasses = sc.nextBoolean();
		
		if(Enteryouclassinfo && Areyoucomingclassesdaily && Areyoucomingeverymockclasses) {
		System.out.println("Congrtulations !!");
		System.out.println("Your parents Dreams come true !!");
		}else {
			System.out.println(" are you cheating your parents directly without mask !!");
		}
	}

}
