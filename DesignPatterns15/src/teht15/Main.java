package teht15;

public class Main {
	
	public static void main(String[] args) {
		
		Product computer = new Computer(1000);
		Product tv = new Television(625);
		
		DiscountAdapter verkkis = new DiscountAdapterVerkkokauppa(computer);
		
		System.out.println("Computer's price: "+computer.getPrice()+"\nComputer's discounted price at Verkkokauppa: "+verkkis.getPrice()+"\n");
		verkkis.setProduct(tv);
		System.out.println("TV's price: "+tv.getPrice()+"\nTV's discounted price at Verkkokauppa: "+verkkis.getPrice()+"\n");
		
		DiscountAdapter jimms = new DiscountAdapterJimms(computer);
		
		System.out.println("Computer's price: "+computer.getPrice()+"\nComputer's discounted price at Jimm's: "+jimms.getPrice()+"\n");
		jimms.setProduct(tv);
		System.out.println("TV's price: "+tv.getPrice()+"\nTV's discounted price at Jimm's: "+jimms.getPrice());
		
	}
}
