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
		char[] arreglo = new char[lista.length];
		int i=0;
		int valor =0;
		Nodo variableauxiliar = new Nodo();
		for(char c : cadena ) {
			int contador =0;
			for (int j=0;j<lista.length;j++){
				if(arreglo[j]==c){
					contador++;
				}
			}
			if (contador<1){
			valor = hash.get(c);
			nodoActual = new Nodo(c,valor);
			arreglo[i]=c;
			lista[i] = nodoActual;
			i++;
			}
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
	
	public void Arbol(int posicion){
		if( posicion >= lista.length){
			return;
		}
		else{
			while (lista[0].getPadre()==null){
			int valor1 = lista[0].getPeso();
			int valor2 = lista[1].getPeso();
			nodoActual = new Nodo(valor1+valor2);
			nodoActual.setHijoizq(lista[0]);
			nodoActual.setHijoder(lista[1]);
			lista[0].setPadre(nodoActual);
			lista[1].setPadre(nodoActual);
			}
			int valor1 = lista[posicion].getPeso();
			if(valor1<nodoActual.getPeso()){
				Nodo temporal = nodoActual;
				nodoActual = new Nodo(valor1+nodoActual.getPeso());
				nodoActual.setHijoizq(lista[posicion]);
				nodoActual.setHijoder(temporal);
				lista[posicion].setPadre(nodoActual);
				temporal.setPadre(nodoActual);
				Arbol(posicion+1);
				if( posicion+1 >= lista.length){
					return;
				}
			}
			if((lista[posicion+1]==null)){
				
				Nodo temporal = nodoActual;
				nodoActual = new Nodo(valor1+nodoActual.getPeso());
				nodoActual.setHijoizq(lista[posicion]);
				nodoActual.setHijoder(temporal);
				lista[posicion].setPadre(nodoActual);
				temporal.setPadre(nodoActual);
				return;
			}
			if(valor1>nodoActual.getPeso()){
				int valor2 = lista[posicion+1].getPeso();
				Nodo temporal = nodoActual;
				nodoActual = new Nodo(valor1+valor2);
				nodoActual.setHijoizq(lista[posicion]);
				nodoActual.setHijoder(lista[posicion+1]);
				lista[posicion].setPadre(nodoActual);
				lista[posicion+1].setPadre(nodoActual);
				Nodo temporal2 = nodoActual;
				nodoActual = new Nodo(temporal.getPeso()+temporal2.getPeso());
				nodoActual.setHijoizq(temporal);
				nodoActual.setHijoder(temporal2);
				temporal.setPadre(nodoActual);
				temporal2.setPadre(nodoActual);
				Arbol(posicion+2);
				if( posicion+2 >= lista.length){
					return;
				}
			}
			}
		}
	public Nodo getNodoActual(){
		return nodoActual;
	}
	
			
	public char[] getCadena(){
		return cadena;
	}
	public Hashtable getHash(){
		return hash;
	}
	
	public Nodo[] getLista(){
		return lista;
	}
	}
