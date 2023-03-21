package app;

public class Yksikonpaallikko  extends Handleri{
	private final double max = 5;
	
	public void processRequest(Double maara) {
		if (maara <= max) {
			System.out.println("Yksikön päällikkö hyväksyy " + maara + "% palkankorotuksen.");
		
		} 
		else {
			super.processRequest(maara);
		}
	}
}
