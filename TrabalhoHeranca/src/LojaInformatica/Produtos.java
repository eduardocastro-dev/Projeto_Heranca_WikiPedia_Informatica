package LojaInformatica;
import java.io.IOException;
import java.util.Scanner;

public class Produtos {
	
	Scanner entrada = new Scanner (System.in);
	public String Nome;
	public String Marca;
	public String Modelo;
	public Double Valor;
	public int EAN;
	
	public int Cod;
	public int Memoria;
	public Double Voltagem;
	
	public String VisualizaRegistro(int categoria, int contador) throws IOException {
		switch (categoria) {
		//GABINETE
		case 1:
			
			Gabinete gabinetevisu = new Gabinete();
			gabinetevisu.VisualizaGabinete(contador);
			break;
			
		//PLACA MÃE
		case 2:
			
			break;
		//PLACA DE VIDEO	
		case 3:
			break;
			
		//MEMORIA RAM
		case 4:
			break;
		
		//ARMAZENAMENTO	
		case 5:
			break;
			
		//PROCESSADOR
		case 6:
			break;
		
		//COOLER	
		case 7:
			break;
		}
		return "--REGISTROS--";
	}
	
	public String cadastro(int categoria,int contador){
		switch (categoria) {
			//GABINETE
			case 1:
				Gabinete gabinetes = new Gabinete();
				gabinetes.GabineteCadastro(contador);
				break;
				
			//PLACA MÃE
			case 2:
				
				break;
			//PLACA DE VIDEO	
			case 3:
				break;
				
			//MEMORIA RAM
			case 4:
				break;
			
			//ARMAZENAMENTO	
			case 5:
				break;
				
			//PROCESSADOR
			case 6:
				break;
			
			//COOLER	
			case 7:
				break;
		}
		return "--# CADASTRO COMPLETO #--";
		
	}

	
	public String EditaRegistro(int categoria,int contador) throws IOException { 
		switch (categoria) {
		//GABINETE
		case 1:
			Gabinete gabinetevisu = new Gabinete();
			gabinetevisu.EditaGabinete(contador);
			break;
			
		//PLACA MÃE
		case 2:
			
			break;
		//PLACA DE VIDEO	
		case 3:
			break;
			
		//MEMORIA RAM
		case 4:
			break;
		
		//ARMAZENAMENTO	
		case 5:
			break;
			
		//PROCESSADOR
		case 6:
			break;
		
		//COOLER	
		case 7:
			break;
		}
		return "--EDIÇÃO CONCLUIDA--";
	}
}

