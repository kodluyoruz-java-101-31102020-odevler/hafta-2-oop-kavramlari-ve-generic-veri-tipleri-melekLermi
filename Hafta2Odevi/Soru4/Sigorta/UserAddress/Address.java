package com.Hafta2Odevi.Soru4.Sigorta.UserAddress;

import java.util.ArrayList;

public interface Address {

	public int telNo = 0;
	public String city = "";
	public String street ="";
	public short no = 1;
	
	public void homeAddress();
	public int kisiTelNo();
	
	ArrayList<String> address = new ArrayList<String>();
	
	
	
	
}
