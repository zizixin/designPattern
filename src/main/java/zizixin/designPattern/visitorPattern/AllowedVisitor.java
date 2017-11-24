package zizixin.designPattern.visitorPattern;

public interface AllowedVisitor {

	public void accept(VisitAbility visitAbility);
	
	public  String getName();
}
