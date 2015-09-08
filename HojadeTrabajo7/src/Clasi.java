import java.util.Hashtable;

// Juan Luis Garcia
// Freddie Batlle
// Clase para ordenar las cadenas

public class Clasi{
	Hashtable<Character,Integer> table;
	public Clasi(){
	 table = new Hashtable<Character,Integer>();	
	}
	
	public Hashtable getHashtable(){
		return table;
	}
	public void cadena(String str){
	
		char[] cadena= new char[str.length()];
				cadena = str.toCharArray();
		
	for(char c : cadena ) {
	    if( table.get(c) == null )
	        table.put(c,1);
	    else
	        table.put(c,table.get(c) + 1);
	}
	}
}