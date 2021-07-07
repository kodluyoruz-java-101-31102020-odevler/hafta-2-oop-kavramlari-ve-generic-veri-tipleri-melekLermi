package com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri;

import java.util.ArrayList;
import java.util.List;

import com.Hafta2Odevi.Soru4.Sigorta.Insurance.Insurance;

//Müþteri profili 
//Account sýnýfý müþterinin sisteme giriþ sonrasýnda tüm bilgilerinin tutulduðu hesap bilgisidir. 
public abstract class Account {

	private final AuthenticationStatus success = AuthenticationStatus.SUCCESS;
	private final AuthenticationStatus fail = AuthenticationStatus.FAIL;
	private AuthenticationStatus login = fail;
	private User user = new User();
	private List<Insurance> kullanýcýnýnSigortalari = new ArrayList();
	
	public Account(User user, AuthenticationStatus login, List<Insurance> kullanýcýnýnSigortalari) {
		this.user = user;
		this.login = login;
		this.kullanýcýnýnSigortalari = kullanýcýnýnSigortalari;
	}
	
	public final void showUserInfo() { 
		
		System.out.println("müþteri bilgileri: ");

		if(this.user != null) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Ýsim : ");
			stringBuilder.append(this.user.getIsim());
			stringBuilder.append("Soyisim: ");
			stringBuilder.append(this.user.getSoyisim());
			stringBuilder.append("Son giris tarihi: ");
			stringBuilder.append(this.user.getSistemeSonGirisTarihi());
			System.out.println(stringBuilder.toString());
		}
		else {
			System.out.println("Kullanýcý bulunamadý!");
		}
		
	public  void giris (String email, String sifre)  throws InvalidAuthenticationException {
		
		if(user.getEmail().equals(emaill) && user.getSifre().equals(sifree)) {
				login = success;
				System.out.println("Baþarýyla giriþ yapýlýyor!");
		}
		else {
			login = fail;
			System.out.println("Email yada sifre yanlis! Lütfen yeniden deneyiniz.");
		}
		
	}
		
	public void girisDurumu() {
		System.out.println(authenticationStatus);
	}
		
	public abstract void sigortaPolicesi();
		System.out.println("Sigorta Policesi");
	   }

	public void isInvalid() {
		// TODO Auto-generated method stub
		
	}
	
	
}
