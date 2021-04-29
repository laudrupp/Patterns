package teht09;

import java.util.List;

public class ListArray implements ListConverter {
	
public String listToString(List<String> list) {
		
		String returnString = "";
		int i = 0;
		
		for(String x : list) {
			returnString += x;
			if((i+1) % 3 == 0) {
				returnString += "\n";
			}
			i++;
		}
		return returnString;
	}
}
