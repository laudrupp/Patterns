package teht02;

public class Jasper {
	
	public void pueAdidas() {
		AdidasFactory adidasFactory = new AdidasFactory();
		Hat AdidasHat = adidasFactory.makeHat();
		Shirt AdidasShirt = adidasFactory.makeShirt();
		Jeans AdidasJeans = adidasFactory.makeJeans();
		Shoes AdidasShoes = adidasFactory.makeShoes();
        System.out.println("Olen opiskelija ja minulla on päälläni "+AdidasHat.getProduct()+", "+AdidasShirt.getProduct()+", "+AdidasJeans.getProduct()+" ja "+AdidasShoes.getProduct());
	}
	
	public void pueBoss() {
		BossFactory bossFactory = new BossFactory(); 
        Hat BossHat = bossFactory.makeHat();
        Shirt BossShirt = bossFactory.makeShirt();
        Jeans BossJeans = bossFactory.makeJeans();
        Shoes BossShoes = bossFactory.makeShoes();
        System.out.println("Valmistuin insinööriksi ja nyt minulla on päälläni "+BossHat.getProduct()+", "+BossShirt.getProduct()+", "+BossJeans.getProduct()+" ja "+BossShoes.getProduct());
	}
}
