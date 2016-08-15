package comm.cfreational.factory;

public class FactoryInterface {
	
	Toy buildToy(ChildEnum child){
		if(ChildEnum.TODDLER==child){
			return new HardToyFactory().babyToy();
		}
		return new SoftToyFactory().babyToy();
	}

}



	


