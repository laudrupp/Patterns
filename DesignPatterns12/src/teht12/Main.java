package teht12;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		
		Image image1 = new ProxyImage("IMG001.jpg", "Lake");
		Image image2 = new ProxyImage("IMG002.jpg", "Forest");
		Image image3 = new ProxyImage("IMG003.jpg", "Mountain");
		Image image4 = new ProxyImage("IMG004.jpg", "River");
		Image image5 = new ProxyImage("IMG005.jpg", "Village");
		
		ArrayList<Image> imageList = new ArrayList<Image>();

		imageList.add(image1);
		imageList.add(image2);
		imageList.add(image3);
		imageList.add(image4);
		imageList.add(image5);
		
		
		for(Image i : imageList) {
			i.showData();
		}
		
		System.out.println("- - - - -");
		
		for(Image i : imageList) {
			i.displayImage();
			i.showData();
			System.out.println("- - - - -");
		}
		
	}

}
