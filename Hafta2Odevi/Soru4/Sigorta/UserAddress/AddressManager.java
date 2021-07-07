package com.Hafta2Odevi.Soru4.Sigorta.UserAddress;

import java.util.ArrayList;
import java.util.List;

import com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri.User;

public class AddressManager {

	
	//User kullanıcıAdresleri = new User();
	
	public static void adresEkle(User kullanıcıAdresleri, Address address) {
		if(kullanıcıAdresleri.getAdresListesi().size() == 0) {
			List<Address> adresListesi = new ArrayList<>();
			adresListesi.add(address);
			kullanıcıAdresleri.setAdresListesi(address);
		}
		else {
			System.out.println("Adres zaten kayıtlı!");
		}
		
	}
	
	public static void adresSil(User kullanıcıAdresleri, Address address) {
		if(kullanıcıAdresleri.getAdresListesi().size() != 0 ) {
			kullanıcıAdresleri.getAdresListesi().remove(address);
		}
		else {
			System.out.println("Silinemedi!");
		}
			
	
	}
}
