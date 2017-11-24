package zizixin.designPattern.observerPattern;

/**
 * @author zizixin
 *
 */
public abstract class Observer {

	protected Subject subject; 
	
	public abstract void update();
	
}
