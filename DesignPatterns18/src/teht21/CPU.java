package teht21;

class CPU {
	
    public void freeze() {
    	System.out.println("Freezing processor");
    }
    public void jump(long position) {
    	System.out.println("Jumping to address: "+position);
    }
    public void execute() {
    	System.out.println("Executing\n");
    }
    
}
