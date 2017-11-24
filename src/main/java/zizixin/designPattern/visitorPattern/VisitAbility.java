package zizixin.designPattern.visitorPattern;

public interface VisitAbility {

	public void visit(AllowedVisitor allowedVisitor);

	public String getName();
}
