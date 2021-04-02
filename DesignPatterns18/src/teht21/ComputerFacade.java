package teht21;

class ComputerFacade {
	
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    
    
    private int BOOT_ADDRESS = 0;
    private long BOOT_SECTOR = 0;
    private int SECTOR_SIZE = 8;
    

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    
    public void start() {
    	while(BOOT_ADDRESS < SECTOR_SIZE) {
    		processor.freeze();
            ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
            processor.jump(BOOT_ADDRESS);
            processor.execute();
            BOOT_ADDRESS++;
    	}
    }
}
