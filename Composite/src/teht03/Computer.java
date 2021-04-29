package teht03;


public class Computer {
	
	
	private double price;
	
	public double makeSetup() {
		
		ComponentFactory computer = new ComponentFactory();
		
		Component ram = computer.makeRam();
		Component cpu = computer.makeCpu();
		Component gpu = computer.makeGpu();
		Component net = computer.makeNetwork();
		Component ssd = computer.makeSsd();
		
		Composite motherboard = computer.makeMotherboard();
		
		motherboard.addComponent(ram);
		motherboard.addComponent(cpu);
		motherboard.addComponent(gpu);
		motherboard.addComponent(net);
		motherboard.addComponent(ssd);
		
		Composite compcase = computer.makeCase();
		
		compcase.addComponent(motherboard);
		
		Component keyboard = computer.makeKeyboard();
		Component mouse = computer.makeMouse();
		
		Composite pc = computer.makeSetup();
		
		pc.addComponent(compcase);
		pc.addComponent(keyboard);
		pc.addComponent(mouse);
		
		price = pc.getChildPrices();
		
		System.out.println("------------------------------");
		System.out.println("Full price of the setup is "+price+"€");
		System.out.println("------------------------------");
		
		return price;
		
	}
}
