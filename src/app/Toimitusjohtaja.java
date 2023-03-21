package app;

public class Toimitusjohtaja  extends Handleri{
	public void processRequest(Double maara) {
		System.out.println("Toimitusjohtaja hyväksyy " + maara + "% palkankorotuksen.");
	}
}
