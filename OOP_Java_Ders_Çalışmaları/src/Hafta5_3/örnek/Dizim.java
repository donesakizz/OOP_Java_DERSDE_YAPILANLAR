package Hafta5_3.örnek;

import java.util.ArrayList;

public class Dizim {
	
	public static void main(String[] args) {
		ArrayList<String> item =new ArrayList<String>();
		item.add("red");
		item.add("yellow");
		item.add(0,"green");
        for(String renk:item) {
        	System.out.print(" " +renk);
        	
        	
        }
        item.remove("red");
        System.out.println("");
        for(String renk:item) {
        	System.out.print(" " +renk);

}
        System.out.println();
        System.out.print(item.get(1));
        System.out.println(item.contains("red")  ? "? \nevet var": "\nhayır yok");

}




}
