package com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri;

import java.util.ArrayList;
import java.util.List;

import com.Hafta2Odevi.Soru4.Sigorta.Insurance.Insurance;

//M��teri profili 
//Account s�n�f� m��terinin sisteme giri� sonras�nda t�m bilgilerinin tutuldu�u hesap bilgisidir. 
public abstract class Account {

	private final AuthenticationStatus success = AuthenticationStatus.SUCCESS;
	private final AuthenticationStatus fail = AuthenticationStatus.FAIL;
	private AuthenticationStatus login = fail;
	private User user = new User();
	private List<Insurance> kullan�c�n�nSigortalari = new ArrayList();
	
	public Account(User user, AuthenticationStatus login, List<Insurance> kullan�c�n�nSigortalari) {
		this.user = user;
		this.login = login;
		this.kullan�c�n�nSigortalari = kullan�c�n�nSigortalari;
	}
	
	public final void showUserInfo() { 
		
		System.out.println("m��teri bilgileri: ");

		if(this.user != null) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("�sim : ");
			stringBuilder.append(this.user.getIsim());
			stringBuilder.append("Soyisim: ");
			stringBuilder.append(this.user.getSoyisim());
			stringBuilder.append("Son giris tarihi: ");
			stringBuilder.append(this.user.getSistemeSonGirisTarihi());
			System.out.println(stringBuilder.toString());
		}
		else {
			System.out.println("Kullan�c� bulunamad�!");
		}
		
	public  void giris (String email, String sifre)  throws InvalidAuthenticationException {
		
		if(user.getEmail().equals(emaill) && user.getSifre().equals(sifree)) {
				login = success;
				System.out.println("Ba�ar�yla giri� yap�l�yor!");
		}
		else {
			login = fail;
			System.out.println("Email yada sifre yanlis! L�tfen yeniden deneyiniz.");
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
