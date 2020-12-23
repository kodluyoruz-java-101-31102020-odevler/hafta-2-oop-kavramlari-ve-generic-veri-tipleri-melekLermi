package com.Hafta2Odevi.Soru2.MatrisCarpim;

import java.util.Random;

public class MatrisCarpim < T extends Number> {

	/*N x M ile M x T boyutlar�nda 0-10 aras� rastgele say�lardan olu�an iki matris tan�mlay�n�z.
	 *Bu iki matrisin �arp�m�n� yapan fonksiyonu yaz�n. �arp�m sonucu olu�an matrisi ekrana yazd�r�n.
	 *Bu matris �arp�m�n� yapan s�n�f� Generic tipte tan�mlay�n�z.
	 *Matris s�n�f� int, int, float, long gibi Number k�kenli matrisleri �arpabilmelidir.
	 */
//	MatrisCarpim<Integer> carp = new MatrisCarpim<Integer>;

	public int[][] matMul(int[][] randomDizi1,int[][] randomDizi2){
		  
        int[][] carp�mMatrisi =new int[randomDizi1.length][randomDizi2[0].length];
        
        for(int s=0;s<randomDizi1.length;s++){
        
        	for(int k=0;k<randomDizi2[0].length;k++){ 
        		carp�mMatrisi[s][k] = 0;
        
        		for(int i=0;i<randomDizi1[0].length;i++){
        			carp�mMatrisi [s][k] += randomDizi1[s][i] * randomDizi2[i][k];
        		}
        		System.out.print(carp�mMatrisi[s][k] + " ");
            }	
        	System.out.println();
			
	}
		
    
        return carp�mMatrisi;
	
	}	

}