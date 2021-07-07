package com.Hafta2Odevi.Soru2.MatrisCarpim;

import java.util.Random;

public class MatrisCarpim < T extends Number> {

	/*N x M ile M x T boyutlarýnda 0-10 arasý rastgele sayýlardan oluþan iki matris tanýmlayýnýz.
	 *Bu iki matrisin çarpýmýný yapan fonksiyonu yazýn. Çarpým sonucu oluþan matrisi ekrana yazdýrýn.
	 *Bu matris çarpýmýný yapan sýnýfý Generic tipte tanýmlayýnýz.
	 *Matris sýnýfý int, int, float, long gibi Number kökenli matrisleri çarpabilmelidir.
	 */
//	MatrisCarpim<Integer> carp = new MatrisCarpim<Integer>;

	public int[][] matMul(int[][] randomDizi1,int[][] randomDizi2){
		  
        int[][] carpýmMatrisi =new int[randomDizi1.length][randomDizi2[0].length];
        
        for(int s=0;s<randomDizi1.length;s++){
        
        	for(int k=0;k<randomDizi2[0].length;k++){ 
        		carpýmMatrisi[s][k] = 0;
        
        		for(int i=0;i<randomDizi1[0].length;i++){
        			carpýmMatrisi [s][k] += randomDizi1[s][i] * randomDizi2[i][k];
        		}
        		System.out.print(carpýmMatrisi[s][k] + " ");
            }	
        	System.out.println();
			
	}
		
    
        return carpýmMatrisi;
	
	}	

}