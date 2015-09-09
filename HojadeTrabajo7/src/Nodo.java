
/**
 *
 * @author Juan Luis Garcia 14189
 * @author Freddie Adriano 14074
 */

public class Nodo {
	private char Carac;
	private Nodo Padre;
	private Nodo Hijoizq;
	private Nodo Hijoder;
	private int Peso;
	
	public Nodo() {
		Carac = '\0';
		Padre = null;
		Hijoizq = null;
		Hijoder = null;
		Peso = 0;
	}
	public Nodo(int peso){
		this.Carac = '\0';
		this.Peso = peso;
		Padre = null;
		Hijoizq = null;
		Hijoder=null;
	}
	public Nodo(char cara,int peso) {
		this.Carac = cara;
		this.Peso = peso;
		Padre = null;
		Hijoizq = null;
		Hijoder=null;
	}
	public char getCarac() {
		return Carac;
	}
	public void setCarac(char carac) {
		this.Carac = carac;
	}
	public Nodo getPadre() {
		return Padre;
	}
	public void setPadre(Nodo padre) {
		Padre = padre;
	}
	
	public void setHijoizq(Nodo hijoizq){
		Hijoizq = hijoizq;
	}
	public Nodo getHijoizq(){	
		return Hijoizq;
	}
	public void setHijoder(Nodo hijoder){
		Hijoder = hijoder;
	}
	public Nodo getHijoder(){	
		return Hijoder;
	}

    public int getPeso() {
		return Peso;
	}
	public void setPeso(int peso) {
		this.Peso = peso;
	}
	
	
	
}
