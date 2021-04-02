package teht09;

import java.util.List;

public class ListGet implements ListConverter {
	
	public String listToString(List<String> list) {
		
		int size = list.size();
		String[] loopList = new String[size];
		String returnString = "";
		
		for(int i = 0; i < size; i++) {
			loopList[i] = list.get(i);
		}
		
		for(int j = 0; j < loopList.length; j++) {
			returnString += loopList[j] + "\n";
		}
		
		return returnString;
	}

}
