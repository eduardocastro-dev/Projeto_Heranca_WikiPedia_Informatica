package LojaInformatica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Gabinete extends Produtos{
	
	int CodGabinete = 1;
	int TipoTamanho;
	String Tamanho;
	
	//VISUALIZA_REGISTRO
	String VisualizaGabinete(int contador) throws IOException  {
		for(int CodGabinete = 1 ; CodGabinete < contador; CodGabinete++) {
	        System.out.println("----------GABINETE"+CodGabinete+"----------");
			Path path = Paths.get("C:/WS-Trabalho/Produtos/Gabinete/"+CodGabinete+"Gabinete.txt");
	        Files.lines(path).forEach(System.out::println);
	        System.out.println("--------------------");
		}
		
		
		return null;
		}
	
	//CADASTRO
	Boolean GabineteCadastro(int contador) {
		CodGabinete = contador;
		System.out.println("Informe o Nome: ");
		Nome = entrada.nextLine();
		System.out.println("Informe a Marca: ");
		Marca = entrada.nextLine();
		System.out.println("Informe a Modelo: ");
		Modelo = entrada.nextLine();
		System.out.println("Informe o EAN: ");
		EAN = entrada.nextInt();
		System.out.println("Informe o Valor: ");
		Valor = entrada.nextDouble();
		
		System.out.println("Informe o Tamanho \n [1] FULL TOWER \n [2] MID TOWER \n [3] MICRO TOWER \n [4] MINI ATX ");
		TipoTamanho = entrada.nextInt();
		if(TipoTamanho <1 || TipoTamanho >5) {
			do {
				System.out.println("Opção invalida! tente novamente: \n");
				TipoTamanho = entrada.nextInt();
			} while(TipoTamanho <1 || TipoTamanho >5);
		}else {
			if(TipoTamanho == 1) {
				Tamanho = "FULL TOWER";
			}else if(TipoTamanho == 2) {
				Tamanho = "MID TOWER";
			}else if (TipoTamanho == 3) {
				Tamanho = "MICRO TOWER";
			}else {
				Tamanho = "MINI ATX";
			}
		}

			try {
	        File file = new File("C:/WS-Trabalho/Produtos/Gabinete/"+CodGabinete+"Gabinete.txt");
	
	        // Se o arquivo nao existir, ele gera
	        if (!file.exists()) {
	            file.createNewFile();
	        }
	
	        // Prepara para escrever no arquivo
	        FileWriter fw = new FileWriter(file.getAbsoluteFile());
	        BufferedWriter bw = new BufferedWriter(fw);
	        
	        // Escreve e fecha arquivo
	        bw.write(" Nome: "+Nome+"\n Marca: "+Marca+"\n Modelo: "+Modelo+"\n EAN: "+EAN+"\n Valor: "+Valor+"\n Tamanho: "+Tamanho);
	        bw.close();
	        
	        // Le o arquivo
	        FileReader ler = new FileReader("C:/WS-Trabalho/Produtos/Gabinete/"+CodGabinete+"Gabinete.txt");
	        BufferedReader reader = new BufferedReader(ler);  
	        String linha;
	        while( (linha = reader.readLine()) != null ){
	            System.out.println(linha);
	
	
	        }
	
	        System.out.println("--GRAVAÇÃO CONCLUIDA--");
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		return  true;
	}
	
	//EDITA
	String EditaGabinete(int contador) throws IOException  {
		
		Gabinete visualizar = new Gabinete();
		visualizar.VisualizaGabinete(contador);
		
		int edita = 0;
		System.out.println("Informe o registro que deseja editar: ");
		edita = entrada.nextInt();
		if(edita < 1 || edita > contador ){
			do {
				System.out.println("Opção invalida! tente novamente: \n");
				edita = entrada.nextInt();
			}while(edita < 1 || edita > contador );
			
		}else {
			Gabinete editaGab = new Gabinete();
			editaGab.GabineteCadastro(edita);
			System.out.println("--Registro Editado--");
			
		}
		return null;
		}
}


