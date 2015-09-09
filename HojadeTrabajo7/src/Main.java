import java.util.Scanner;


//Juan Luis Garcia
//Freddie Batlle

public class Main{
	public static void main (String[] args) {
		Codificador codificador;
		System.out.println("Ingrese cadena");
		Scanner teclado = new Scanner (System.in);
		String cadena = teclado.nextLine();
		codificador = new Codificador(cadena);
		System.out.println("el codigo es"+ codificador.str2code());
		System.out.println("Ingrese codigo");
		String codigo = teclado.nextLine();
		System.out.println("la cadena es " + codificador.code2str(codigo));
	}
}