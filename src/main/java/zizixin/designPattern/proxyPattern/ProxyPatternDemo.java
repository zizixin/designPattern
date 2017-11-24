package zizixin.designPattern.proxyPattern;

import zizixin.designPattern.Demo;

public class ProxyPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		ProxyImage image = new ProxyImage("fileName");
		image.disPlay();
	}

	public static void main(String[] args) {
		try {
			new ProxyPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
