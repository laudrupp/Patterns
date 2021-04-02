package teht09;

import java.util.List;

public class Factory {
	
	ListConverter converter;
	
	public void setStrategy(ListConverter converter) {
		this.converter = converter;
	}
	
	public String listToString(List<String> lista) {
		String returnString = converter.listToString(lista);
		return returnString;
	}
}
