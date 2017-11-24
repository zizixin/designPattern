package zizixin.designPattern.visitorPattern;

public class HomeTwo implements AllowedVisitor{

	@Override
	public void accept(VisitAbility visitAbility) {
		System.out.println("homeTwo has allowed"+visitAbility.getName()+"Visit");
		visitAbility.visit(this);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
