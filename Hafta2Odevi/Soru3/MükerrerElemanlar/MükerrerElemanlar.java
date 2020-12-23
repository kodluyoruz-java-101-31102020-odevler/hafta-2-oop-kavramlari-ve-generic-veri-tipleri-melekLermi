package com.Hafta2Odevi.Soru3.M�kerrerElemanlar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class M�kerrerElemanlar {
	
	private static final String Set = null;

	/*  N boyutunda 0-10 aras� rastgele say�lardan olu�an bir dizi tan�mlay�n�z.
	 *  Bu dizi i�inde m�kerrer olan elemanlar� ekrana yazd�ran algoritmay� tasarlay�n�z.
	 * 	�rnek: { 2, 4, 5, 11, 33, 2, 5, 55, 100, 1 }
	 *  �rnek ��kt�: 2 5
	 */

	public static void main(String[] args) {

		java.util.Set<Integer> m�kerrerSay�lar = new HashSet<>();

		Random rand = new Random();
		int N=rand.nextInt(100);
		int randomDizi[];
		randomDizi = new int[N];
		
		System.out.println("Eleman say�s� : " + N );
		System.out.print("Dizi elemanlar� : ");

		for(int m=0; m<N; m++) {
			
			randomDizi[m]=rand.nextInt(10);
			System.out.print(randomDizi[m] + " ");

		}
		
		System.out.println("\nListedeki m�kerrer say�lar :");
		for(int i=0; i<randomDizi.length; i++) {
			for(int j=i++; j<randomDizi.length; j++) {
				if(randomDizi[i] == randomDizi[j]) {
					m�kerrerSay�lar.add(randomDizi[i]);
				}
			}
		}
		System.out.print(m�kerrerSay�lar.toString());
		
	}


}
