package teht21;

class Memory {
	
    public void load(long position, byte[] data) {
    	
    	System.out.println("Loading from address "+position+" data: "+data[(int) position]);
    }
    	    
}

