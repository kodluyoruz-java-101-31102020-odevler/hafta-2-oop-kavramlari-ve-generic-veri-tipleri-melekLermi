package com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri;

import java.util.List;

import com.Hafta2Odevi.Soru4.Sigorta.Insurance.Insurance;

public class Individual extends Account {

	public Individual(User user, AuthenticationStatus login, List<Insurance> kullan�c�n�nSigortalari) {
		super(user, login, kullan�c�n�nSigortalari);
		// TODO Auto-generated constructor stub
	}
	
	public void sigortaPolicesi() {
		System.out.println("Bireysel Sigorta Poli�esi");
	}

}
