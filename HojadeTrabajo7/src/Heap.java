import java.util.Hashtable;

public class Heap{
	Nodo nodoActual;
	Clasi tabla;
	Nodo[] lista;
	Hashtable<Character,Integer> hash; 
	char[] cadena;
	
	
	public Heap(String str){
		tabla = new Clasi();
		tabla.cadena(str);
		cadena= new char[str.length()];
		cadena = str.toCharArray();
		hash = new Hashtable<Character,Integer>();
		hash = tabla.getHashtable();
		lista = new Nodo[hash.size()];
	}
	
	public void Lista(){
		int i=0;
		int valor =0;
		Nodo variableauxiliar = new Nodo();
		for(char c : cadena ) {
			valor = hash.get(c);
			nodoActual = new Nodo(c,valor);
		  lista[i] = nodoActual;
		}
		//ordenamiento
			 
	        //Usamos un bucle anidado
	        for(int a=0;a<(lista.length-1);a++){
	            for(int b=a+1;b<lista.length;b++){
	                if(lista[a].getPeso()>lista[b].getPeso()){
	                    //Intercambiamos valores
	                    variableauxiliar=lista[a];
	                    lista[a]=lista[b];
	                    lista[b]=variableauxiliar;
	 
	                }
	            }
	        }
	    }
			
		}
