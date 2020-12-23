package com.Hafta2Odevi.Soru4.Sigorta.Insurance;

import java.sql.Date;

public abstract class Insurance {
	
	public String sigortaIsmi;
	public double sigortaUcreti;
	public Date sigortaBasBitisTarihi;

	
	public abstract void calculate();
}
