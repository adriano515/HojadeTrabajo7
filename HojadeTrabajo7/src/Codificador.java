import java.util.Hashtable;


//Juan Luis Garcia
//Freddie Batlle

public class Codificador{
	Heap arbol;
	Nodo nodoActual;
	Nodo[] lista;
	Hashtable<Character,Integer> hash; 
	char[] cadena;
	String codigo;
	String caracteres;
	Nodo nodoActual1;
	Nodo temporal;
	
	public Codificador(String str){
		arbol = new Heap(str);
		arbol.Lista();
		arbol.Arbol(2);
		nodoActual = arbol.getNodoActual();
		nodoActual1= nodoActual;
		temporal = nodoActual;
		lista = arbol.getLista();
		hash = arbol.getHash();
		cadena = arbol.getCadena();
		codigo = "";
		caracteres = "";
	}
	public void recorrer(Nodo nodoActual,char key){
		if(nodoActual.getHijoizq()!=null){
		if(nodoActual.getHijoizq().getCarac() == '\0'){
			if (nodoActual.getHijoizq().getHijoizq().getCarac() == key){
				codigo = codigo + "0";
				return;
			}
			if (nodoActual.getHijoizq().getHijoder().getCarac() == key){
				codigo = codigo + "1";
				return;
			}
		}
		}
		if(nodoActual.getHijoizq()==null){
			return;
		}
		else{
			if(nodoActual.getHijoizq().getCarac()==key){
				codigo = codigo + "0";
				return;
			}
			if(nodoActual.getHijoder().getCarac()==key){
				codigo = codigo +"1";
				return;
			}
			else{
				codigo = codigo + "1";
				nodoActual = nodoActual.getHijoder();
				recorrer(nodoActual,key);
			}
		}
		
	}
	public String str2code(){
		for(char c : cadena ) {
		nodoActual = temporal;
		recorrer(nodoActual,c);
		codigo = codigo + " ";
	}
		return codigo;
}
	public String recorrerR(char[] binario){
		for (int i =0; i<binario.length;i++){
			if (binario[i]==(char)(49)){
				nodoActual1 = nodoActual1.getHijoder();
			}
			if (binario[i]==(char)(48)){
				nodoActual1 = nodoActual1.getHijoizq();
			}
			}
		if (nodoActual1==null){
			return "invalido";
		}
		return Character.toString(nodoActual1.getCarac());
		
	}
	public String code2str(String codigo){
		String retorno;
		String[] separado;
		separado = codigo.split(" ");
		char[] binario;
		for (int i = 0; i<separado.length;i++){
			nodoActual1 = temporal;
			binario = separado[i].toCharArray();
			retorno = recorrerR(binario);
			if (retorno.equals("invalido")){
				caracteres = "cadena invalida";
				return caracteres;
				
			}
			caracteres = caracteres + retorno;
		}
		return caracteres;
	}
}