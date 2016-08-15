package comm.cfreational.factory;

public class Client {
	
	
	
	public static void main(String args[]) {
		
		new FactoryInterface().buildToy(ChildEnum.TODDLER);
	}

}
