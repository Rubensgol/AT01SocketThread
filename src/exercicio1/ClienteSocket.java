package exercicio1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteSocket {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		Socket cliente = null;
		PrintStream saida = null;
		try {
			cliente = new Socket("127.0.0.1", 7000);
			saida = new PrintStream(cliente.getOutputStream());
			
				System.out.println("digite o texto da primeira trhead");
				texto = entrada.nextLine();
				saida.println(texto);

				System.out.println("digite o texto da segunda");
				texto = entrada.nextLine();
				saida.println(texto);

		} catch (IOException e) {
			System.out.println("Algo deu errado");
		} finally {
			cliente.close();
		}

	}

}

