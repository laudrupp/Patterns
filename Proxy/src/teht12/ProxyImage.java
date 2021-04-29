package teht12;

class ProxyImage implements Image {
	
	
    private final String filename;
    private final String title;
    private RealImage image;
    
    
    public ProxyImage(String filename, String title) {
        this.filename = filename;
        this.title = title;
        
    }

    
    public void showData() {
    	System.out.println("Image title: "+title);
    }
    
    
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename, title);
        }
        image.displayImage();
    }
}
