package com.Hafta2Odevi.Soru4.Sigorta.Main;

import java.util.Scanner;

import com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri.AccountManager;

public class Application {

	public static void main(String[] args) {

		Scanner klavyeGirisi = new Scanner(System.in);
		
		System.out.println("Enter your Email: ");
		String emaill = klavyeGirisi.next();
		System.out.println("Enter your Password:");
		String sifree = klavyeGirisi.next();
	
		 AccountManager.login(emaill,sifree);
		 
	}

}
