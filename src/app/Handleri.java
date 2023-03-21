package app;

public abstract class Handleri {
	protected static final double BASE = 2;
	private Handleri successor;
	public void setSuccessor(Handleri successor) {
		this.successor = successor;
	}
	public void processRequest(Double request){
	if (successor != null)
		successor.processRequest(request);
	}
}
