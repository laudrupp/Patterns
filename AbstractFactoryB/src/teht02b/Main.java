package teht02b;

import java.lang.reflect.Method; 

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		// Jasper-luokassa sijaitsee tehtaiden luonti Reflection APIn avulla
		
		Jasper jasper = new Jasper();
		//jasper.pueAdidas();
		//jasper.pueBoss();
		
		Class<? extends Jasper> c = jasper.getClass();
		
		Method adidas = c.getDeclaredMethod("pueAdidas");
		adidas.invoke(jasper);
		
		Method boss = c.getDeclaredMethod("pueBoss");
		boss.invoke(jasper);
	}
}
