package task8demo;

public class Removefirst2char1 {

	
	public String Remove(String string) {
		int stringLength=string.length();
		char firstchar=string.charAt(0);
		char secondchar=string.charAt(1);
		String remainigstring=string.substring(2, stringLength);
		if(firstchar=='A' && secondchar=='A')
			return remainigstring;
		else if(firstchar=='A' && secondchar!='A')
		{
			return secondchar+remainigstring;
		}
		else if(firstchar!='A' && secondchar=='A')
		{
			return firstchar+remainigstring;
		}
		else// if(firstchar!='A' && secondchar!='A')
		{
			return string;
		}
		
	}

}
