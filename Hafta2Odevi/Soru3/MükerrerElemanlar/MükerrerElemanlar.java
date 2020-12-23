package com.Hafta2Odevi.Soru3.MükerrerElemanlar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class MükerrerElemanlar {
	
	private static final String Set = null;

	/*  N boyutunda 0-10 arasý rastgele sayýlardan oluþan bir dizi tanýmlayýnýz.
	 *  Bu dizi içinde mükerrer olan elemanlarý ekrana yazdýran algoritmayý tasarlayýnýz.
	 * 	Örnek: { 2, 4, 5, 11, 33, 2, 5, 55, 100, 1 }
	 *  Örnek çýktý: 2 5
	 */

	public static void main(String[] args) {

		java.util.Set<Integer> mükerrerSayýlar = new HashSet<>();

		Random rand = new Random();
		int N=rand.nextInt(100);
		int randomDizi[];
		randomDizi = new int[N];
		
		System.out.println("Eleman sayýsý : " + N );
		System.out.print("Dizi elemanlarý : ");

		for(int m=0; m<N; m++) {
			
			randomDizi[m]=rand.nextInt(10);
			System.out.print(randomDizi[m] + " ");

		}
		
		System.out.println("\nListedeki mükerrer sayýlar :");
		for(int i=0; i<randomDizi.length; i++) {
			for(int j=i++; j<randomDizi.length; j++) {
				if(randomDizi[i] == randomDizi[j]) {
					mükerrerSayýlar.add(randomDizi[i]);
				}
			}
		}
		System.out.print(mükerrerSayýlar.toString());
		
	}


}
