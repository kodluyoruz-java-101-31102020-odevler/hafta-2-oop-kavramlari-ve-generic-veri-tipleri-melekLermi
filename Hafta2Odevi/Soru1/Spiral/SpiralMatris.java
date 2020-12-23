package com.Hafta2Odevi.Soru1.Spiral;

import java.util.Scanner;

public class SpiralMatris {     
	
		public static int [][] matris = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
	
	     public static String matrisTraverse(int[][] matris, int startX, int startY){
	    	    String result = "";
	    	    boolean baseCase = startX + 1 == Math.ceil(matris[0].length / 2.0)
	    	            || startY + 1 == Math.ceil(matris.length / 2.0);

	    	    for (int i = startX ; i < matris[0].length - startX ; i++) {
	    	        result += " " + matris[startY][i];
	    	    }

	    	    for (int i = startY + 1 ; i < matris.length - startY - 1 ; i++){
	    	        result += " " + matris[i][matris[0].length - 1 - startX];
	    	    }

	    	    for (int i = startX ; (matris.length - 1 != 2 * startY) && (i < matris[0].length - startX) ; i++){
	    	        result += " " + matris[matris.length - 1 - startY][matris[0].length - 1 - i];
	    	    }

	    	    for (int i = startY  ; (matris[0].length - 1 != 2 * startX) && (i < matris.length - startY - 2) ; i++){
	    	        result += " " + matris[matris.length - 2 - i][startX];
	    	    }

	    	    if (!baseCase) {
	    	        result += matrisTraverse(matris, ++startX, ++startY);
	    	    }

	    	    return result;

	    	}
	     
	 	public static void main(String[] args) {

			System.out.println(matrisTraverse(matris, 0, 0));
			
		}
	     
		
}