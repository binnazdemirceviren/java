package binnaz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class kuyruk {

	public static void main(String[] args) {
		String dizi[]= {"java", "c#", "ruby", "php"};
		ArrayList<String> liste =new ArrayList<String>();
		for(int i= 0; i< dizi.length; i++){
			liste.add(dizi[i]);
		}
		System.out.println(liste);
		System.out.println(liste.size());
		liste.add("abc");
		liste.set(4, "c");
		System.out.println(liste);
		for(int i =0 ; i < liste.size(); i++){
			System.out.println(liste.get(i));
			
		}
		HashMap<String, String> ogr = new HashMap<String, String>();
		
		
		/*krk.offer("Bade");
		krk.offer("Zehra");
		krk.offer("Fatih");
		krk.offer("Hakan");
		System.out.println("Kuyruktan çýkartýlýyor");
		while(!krk.isEmpty())
			System.out.print(krk.remove() + " ");*/
		
		
		

	}

}
