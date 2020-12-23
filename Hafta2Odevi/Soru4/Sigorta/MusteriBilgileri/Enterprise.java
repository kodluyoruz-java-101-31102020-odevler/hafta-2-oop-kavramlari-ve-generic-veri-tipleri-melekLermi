package com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri;

import java.util.List;

import com.Hafta2Odevi.Soru4.Sigorta.Insurance.Insurance;

public class Enterprise extends Account {

	public Enterprise(User user, AuthenticationStatus login, List<Insurance> kullanýcýnýnSigortalari) {
		super(user, login, kullanýcýnýnSigortalari);
		// TODO Auto-generated constructor stub
	}
	
	public void sigortaPolicesi() {
		System.out.println("Kurumsal Sigorta Poliçesi");
	}


}
