package zizixin.designPattern.businessDelegatePattern;

public class EJBService implements BusinessService{

	@Override
	public void doProcess() {
		System.out.println("do this in ejb service");
	}

}
