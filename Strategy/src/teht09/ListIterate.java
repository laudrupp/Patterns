package teht09;

import java.util.List;
import java.util.ListIterator;

public class ListIterate implements ListConverter {

	public String listToString(List<String> list) {
		
		ListIterator<String> iterator = list.listIterator();
		String returnString = "";
		int i = 0;
		
		while(iterator.hasNext()) {
			returnString += iterator.next();
			i++;
			if(i % 2 == 0) {
				returnString += "\n";
			}
		}
		
		return returnString;
		
	}
	
}
