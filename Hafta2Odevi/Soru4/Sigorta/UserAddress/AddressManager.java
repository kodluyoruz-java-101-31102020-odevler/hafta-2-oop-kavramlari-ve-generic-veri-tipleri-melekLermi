package com.Hafta2Odevi.Soru4.Sigorta.UserAddress;

import java.util.ArrayList;
import java.util.List;

import com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri.User;

public class AddressManager {

	
	//User kullan�c�Adresleri = new User();
	
	public static void adresEkle(User kullan�c�Adresleri, Address address) {
		if(kullan�c�Adresleri.getAdresListesi().size() == 0) {
			List<Address> adresListesi = new ArrayList<>();
			adresListesi.add(address);
			kullan�c�Adresleri.setAdresListesi(address);
		}
		else {
			System.out.println("Adres zaten kay�tl�!");
		}
		
	}
	
	public static void adresSil(User kullan�c�Adresleri, Address address) {
		if(kullan�c�Adresleri.getAdresListesi().size() != 0 ) {
			kullan�c�Adresleri.getAdresListesi().remove(address);
		}
		else {
			System.out.println("Silinemedi!");
		}
			
	
	}
}
