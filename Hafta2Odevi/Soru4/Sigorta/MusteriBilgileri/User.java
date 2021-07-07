package com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri;

import java.sql.Date;
import java.util.ArrayList;

import com.Hafta2Odevi.Soru4.Sigorta.UserAddress.Address;

public class User {

	private String isim, soyisim, email, sifre, meslek;
	private int yas;
	private ArrayList<String> adresListesi = new ArrayList<String>();  //Adres bilgisi iki tiptir."HomeAddress""BusinessAddress"
	private Date sistemeSonGirisTarihi;
	

	public ArrayList getAdresListesi() {
		return adresListesi;
	}
	public void setAdresListesi(Address address) {
		this.adresListesi = (ArrayList<String>) address;
	}
	public String getIsim() {
		return isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public Date getSistemeSonGirisTarihi() {
		return sistemeSonGirisTarihi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
	
	
}
