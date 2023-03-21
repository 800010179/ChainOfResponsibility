package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Lahiesimies lahiesimies = new Lahiesimies();
		Yksikonpaallikko yksikonpaallikko = new Yksikonpaallikko();
		Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
		lahiesimies.setSuccessor(yksikonpaallikko);
		yksikonpaallikko.setSuccessor(toimitusjohtaja);
		
		Scanner skanneri = new Scanner(System.in);  
		  
		    
		   
		boolean jatketaan = true;
		while(jatketaan) {
	    	System.out.println("");
	    	System.out.println("Syötä palkankorotus % lukuna tai syötä luku 0 lopettaaksesi.");
	    	double palkankorotus = skanneri.nextDouble(); 
	    	if(palkankorotus == 0) {
	    		jatketaan = false;
	    	}
	    	else {
	    		lahiesimies.processRequest(palkankorotus);
	    	}
	    }
	}

}
