package com.Hafta2Odevi.Soru3.MükerrerElemanlar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class MükerrerElemanlar {
	
	private static final String Set = null;

	/*  N boyutunda 0-10 arası rastgele sayılardan oluşan bir dizi tanımlayınız.
	 *  Bu dizi içinde mükerrer olan elemanları ekrana yazdıran algoritmayı tasarlayınız.
	 * 	Örnek: { 2, 4, 5, 11, 33, 2, 5, 55, 100, 1 }
	 *  Örnek çıktı: 2 5
	 */

	public static void main(String[] args) {

		java.util.Set<Integer> mükerrerSayılar = new HashSet<>();

		Random rand = new Random();
		int N=rand.nextInt(100);
		int randomDizi[];
		randomDizi = new int[N];
		
		System.out.println("Eleman sayısı : " + N );
		System.out.print("Dizi elemanları : ");

		for(int m=0; m<N; m++) {
			
			randomDizi[m]=rand.nextInt(10);
			System.out.print(randomDizi[m] + " ");

		}
		
		System.out.println("\nListedeki mükerrer sayılar :");
		for(int i=0; i<randomDizi.length; i++) {
			for(int j=i++; j<randomDizi.length; j++) {
				if(randomDizi[i] == randomDizi[j]) {
					mükerrerSayılar.add(randomDizi[i]);
				}
			}
		}
		System.out.print(mükerrerSayılar.toString());
		
	}


}
