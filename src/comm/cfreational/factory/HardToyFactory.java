package comm.cfreational.factory;

public class HardToyFactory implements ToysFactory{

	@Override
	public Toy babyToy() {
		Toy toy = new ToddleToy();
		toy.buildToy();
		return toy;
	}
}
