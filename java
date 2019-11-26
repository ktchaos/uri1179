import java.io.IOException;
import java.util.Scanner;

public class ListaUri {
	
	int tamMax;
	int tamAtual;
	int dados[];
	String nome;
	
	public ListaUri(String tipo) {
		nome = tipo;
		tamMax = 5;
		tamAtual = 0;
		dados = new int[tamMax];
	}
	
	public void print() {
		for(int i = 0; i < tamAtual; i++) {
			System.out.println("" + nome + "[" + i + "] = " + dados[i]);
		}
	}
	
	public void limpar() {
		tamAtual = 0;
	}
	
	public void add(int elemento) {
		if(tamAtual == 5) {
			print();
			limpar();
		}
		dados[tamAtual] = elemento;
		tamAtual++;
	}
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		ListaUri listapar = new ListaUri("par");
		ListaUri listaimpar = new ListaUri("impar");
		
		for(int i = 0; i < 15; i++) {
			int elemento = input.nextInt();
			
			if(elemento % 2 == 0) {
				listapar.add(elemento);
			}
			else {
				listaimpar.add(elemento);
			}
		}
		
		input.close();
		
		listaimpar.print();
		listapar.print();
		
	}

}
