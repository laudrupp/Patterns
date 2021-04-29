package teht02b;

import java.lang.reflect.Method; 

public class Jasper {
	
	public void pueAdidas() throws Exception {
		
		try {
			
			// Factory creation
			
			AdidasFactory adidasFactory = new AdidasFactory();
			Class<?> adidasClass = adidasFactory.getClass();
	        Object factory = adidasClass.newInstance();

	        // Clothing creation
	        
	        Method makeHat = factory.getClass().getMethod("makeHat");
	        Object hat = makeHat.invoke(factory);
	        Method getHat = hat.getClass().getMethod("getProduct");
	        String hatString = getHat.invoke(hat).toString();
	        
	        Method makeShirt = factory.getClass().getMethod("makeShirt");
	        Object shirt = makeShirt.invoke(factory);
	        Method getShirt = shirt.getClass().getMethod("getProduct");
	        String shirtString = getShirt.invoke(shirt).toString();
	        
	        Method makeJeans = factory.getClass().getMethod("makeJeans");
	        Object jeans = makeJeans.invoke(factory);
	        Method getJeans = jeans.getClass().getMethod("getProduct");
	        String jeansString = getJeans.invoke(jeans).toString();
	        
	        Method makeShoes = factory.getClass().getMethod("makeShoes");
	        Object shoes = makeShoes.invoke(factory);
	        Method getShoes = shoes.getClass().getMethod("getProduct");
	        String shoesString = getShoes.invoke(shoes).toString();
	        
	        System.out.println("Olen opiskelija ja minulla on päälläni "+hatString+", "+shirtString+", "+jeansString+" ja "+shoesString);
	        
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
	}
	
	
	
	public void pueBoss() throws Exception {
		
		try {
			
			// Factory creation
			
			BossFactory bossFactory = new BossFactory();
			Class<?> bossClass = bossFactory.getClass();
	        Object factory = bossClass.newInstance();

	        // Clothing creation
	        
	        Method makeHat = factory.getClass().getMethod("makeHat");
	        Object hat = makeHat.invoke(factory);
	        Method getHat = hat.getClass().getMethod("getProduct");
	        String hatString = getHat.invoke(hat).toString();
	        
	        Method makeShirt = factory.getClass().getMethod("makeShirt");
	        Object shirt = makeShirt.invoke(factory);
	        Method getShirt = shirt.getClass().getMethod("getProduct");
	        String shirtString = getShirt.invoke(shirt).toString();
	        
	        Method makeJeans = factory.getClass().getMethod("makeJeans");
	        Object jeans = makeJeans.invoke(factory);
	        Method getJeans = jeans.getClass().getMethod("getProduct");
	        String jeansString = getJeans.invoke(jeans).toString();
	        
	        Method makeShoes = factory.getClass().getMethod("makeShoes");
	        Object shoes = makeShoes.invoke(factory);
	        Method getShoes = shoes.getClass().getMethod("getProduct");
	        String shoesString = getShoes.invoke(shoes).toString();
	        
	        System.out.println("Valmistuin insinööriksi ja nyt minulla on päälläni "+hatString+", "+shirtString+", "+jeansString+" ja "+shoesString);
	        
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
	}
}

