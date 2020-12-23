package com.Hafta2Odevi.Soru4.Sigorta.MusteriBilgileri;

import java.util.Set;
import java.util.TreeSet;

public class AccountManager implements Comparable {

	
	Set<Account> hesapListesi = new TreeSet<>();
	//bireysel ve kurumsal hesaplarý bu listede sakla
	
	public AccountManager (Set<Account> hesapListesi) {
		this.hesapListesi = hesapListesi;
	}
	
	public Account login() {
		for(Account account : hesapListesi) {
			if(account != null) {
				try {
					account.isInvalid();
				}
				catch(InvalidAuthenticationException e ) {
					e.printStackTrace();
				}
			}else {
				return null;
			}
		}
		return null;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hesapListesi == null) ? 0 : hesapListesi.hashCode());
		return result;
	}


	public Set<Account> getHesapListesi() {
		return hesapListesi;
	}


	public void setHesapListesi(Set<Account> hesapListesi) {
		this.hesapListesi = hesapListesi;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountManager other = (AccountManager) obj;
		if (hesapListesi == null) {
			if (other.hesapListesi != null)
				return false;
		} else if (!hesapListesi.equals(other.hesapListesi))
			return false;
		return true;
	}


	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
