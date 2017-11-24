package zizixin.designPattern;

import zizixin.designPattern.Demo;
import zizixin.designPattern.abstractFactoryPattern.AbstractFactoryPatternDemo;
import zizixin.designPattern.adapterPattern.AdapterPatternDemo;
import zizixin.designPattern.builderPattern.BuilderPatternDemo;
import zizixin.designPattern.factoryPattern.FactoryPatternDemo;
import zizixin.designPattern.singletonPattern.SingletonPatternDemo;

public class DemoFactory {

	private DemoFactory(){
		super();
	}
	
	public static String FactoryPattern = "FactoryPatternDemo"; 
	
	public static String AbstractFactoryPattern = "abstractFactoryPatternDemo";
	
	public static String SingletonPattern = "singletonPatternDemo";
	
	public static String BuilderPattern = "builderPatternDemo";
	
	public static String AdapterPattern = "adapterPattern";
	
	public static Demo getDemo(String demoName) throws Exception{
		
		if(demoName.equals(DemoFactory.FactoryPattern)){
			return FactoryPatternDemo.instance;//worng singleton pattern
		}
		
		if(demoName.equals(DemoFactory.AbstractFactoryPattern)){
			return AbstractFactoryPatternDemo.instance;
		}
		
		if(demoName.equals(DemoFactory.SingletonPattern)){
			return SingletonPatternDemo.instance;
		}
		
		if(demoName.equals(DemoFactory.BuilderPattern)){
			return BuilderPatternDemo.getInstance();//right singleton pattern
		}
		
		if(demoName.equals(DemoFactory.AdapterPattern)){
			return new AdapterPatternDemo();
		}
		
		throw new Exception("wo can not product your demo,sorry about that!");
	}
}
