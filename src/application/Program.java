package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		
		File arquivoNovo = new File("c:\\temp\\teste.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(arquivoNovo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());		
			}			
		}catch(IOException e){
			System.out.println("Error ao executar o arquivo");
		}
		finally {
			if(sc != null) {
				sc.close();
			}			
		}
		
	}

}
