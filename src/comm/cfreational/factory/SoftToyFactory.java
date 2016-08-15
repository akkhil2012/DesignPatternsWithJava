package comm.cfreational.factory;

public class SoftToyFactory implements ToysFactory{

	@Override
	public Toy babyToy() {
		
		Toy toy = new InfantToy();
		toy.buildToy();
		return toy;
	}

}
