package teht03;


public class ComponentFactory implements ComputerParts {
	
	
	public Component makeRam() {
		Component ram = new Leaf("RAM", 120.50);
		return ram;
	}
	
	
	public Component makeCpu() {
		Component cpu = new Leaf("CPU", 300.39);
		return cpu;
	}
	
	
	public Component makeNetwork() {
		Component network = new Leaf("Network Interface Card", 21.15);
		return network;
	}
	
	
	public Component makeGpu() {
		Component gpu = new Leaf("GPU", 399.90);
		return gpu;
	}
	
	
	public Component makeSsd() {
		Component ssd = new Leaf("SSD", 140.95);
		return ssd;
	}
	
	
	public Component makeKeyboard() {
		Component keyboard = new Leaf("Keyboard", 74.95);
		return keyboard;
	}
	
	
	public Component makeMouse() {
		Component mouse = new Leaf("Mouse", 59.90);
		return mouse;
	}
	
	
	public Composite makeMotherboard() {
		Composite motherboard = new Composite("Motherboard", 210);
		return motherboard;
	}
	
	
	public Composite makeCase() {
		Composite pc = new Composite("PC Case", 79.90);
		return pc;
	}
	
	
	public Composite makeSetup() {
		Composite setup = new Composite("PC Setup", 0);
		return setup;
	}

}
