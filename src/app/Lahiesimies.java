package app;

public class Lahiesimies extends Handleri{
	public void processRequest(Double maara) {
		if (maara <= BASE) {
			System.out.println("Lähiesimies hyväksyy " + maara + "% palkankorotuksen.");
		
		} 
		else {
			super.processRequest(maara);
		}
	}
}
