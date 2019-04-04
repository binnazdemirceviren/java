package binnaz;

import java.util.LinkedList;

public class listeler {

	public static void main(String[] args) {
		LinkedList<String> liste = new LinkedList<String>();
		liste.add("elma");
		liste.add("kiraz");
		liste.add("armut");
		liste.add("elma");
		liste.add("ayva");
		for(int i=0; i<liste.size(); i++){
			System.out.println (liste.get(i).length());
		    System.out.println (liste.get(i));
		    if (liste.get(i).length() >= 5)
		    {
		    	liste.set(i, "kivi");
		    }
		}
		
		    System.out.println(liste);
	}

}
