package com.Hafta2Odevi.Soru2.MatrisCarpim;

import java.util.Random;

public class Application {
	
	public static void main(String[] args) {

		Random rand = new Random();
		int N=rand.nextInt(10),M=rand.nextInt(10),T=rand.nextInt(10);
		int i,j;
		int[][] randomDizi1 = new int[N][M];
		int[][] randomDizi2 = new int[M][T];

		System.out.println( "N:" + randomDizi1.length + "  M:" + randomDizi1[0].length + "  T:" + randomDizi2[0].length);
		
		System.out.println("1.dizi");

		for(i=0; i<randomDizi1.length; i++) {
			for(j=0; j<randomDizi1[0].length; j++) {
				int a = rand.nextInt(10);
				randomDizi1[i][j]=a;
				System.out.print(randomDizi1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("\n2.dizi");
		
		for(i=0; i<randomDizi2.length; i++) {
			for(j=0; j<randomDizi2[0].length; j++) {
				int b = rand.nextInt(10);
				randomDizi2[i][j]=b;
				System.out.print(randomDizi2[i][j] + " ");
			}
			System.out.println(" ");
	    }
		
		System.out.println("Carpim Matrisi: ");
		MatrisCarpim<Integer> carp = new MatrisCarpim<Integer>();
		carp.matMul(randomDizi1, randomDizi2);
	}
	
}	

