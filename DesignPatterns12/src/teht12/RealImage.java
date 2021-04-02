package teht12;

public class RealImage implements Image {

	
	private final String filename;

	
	public void showData() {}
	

    public RealImage(String filename, String title) {
        this.filename = filename;
        loadImageFromDisk();
    }

    
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
