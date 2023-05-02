package LojaInformatica;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WikiHardware {

	public static void main(String[] args) throws IOException {
		
		Funcoesinicio diretorio = new Funcoesinicio();
		diretorio.Diretorio();
		
		int menu,categoria,LoopApp,cont=0;
		int ContGabinete = 1,ContPlacaMae = 1,ContPlacaDeVideo = 1,ContMemoriaRam = 1,ContArmazenamento = 1,ContProcessador = 1,ContCooler = 1;
		Scanner entrada = new Scanner (System.in);
		Scanner cad = new Scanner (System.in);
		
		do {
			System.out.println("-- UNIP_HARDWARE -- \n [1] Hardwares \n [2] Fornecedor \n [3] Sair \n-- UNIP_HARDWARE -- \n Informe o menu que deseja visualizar: ");
			menu = entrada.nextInt();
			if(menu < 1 || menu > 3) {
				do {
					System.out.println("Opção invalida! tente novamente:\n");
					menu = entrada.nextInt();
				} while (menu < 1 || menu > 3);

			}
			LoopApp = menu;
		
			switch(menu) {
			
			//MENU PRODUTOS
			case 1:
				System.out.println("--HARDWARES-- \n [1] GABINETES \n [2] PLACA MÃE \n [3] PLACA DE VIDEO \n [4] MEMORIA RAM \n [5] ARMAZENAMENTO \n [6] PROCESSADOR \n [7] COOLER \n [8] SAIR \n--PRODUTOS-- \nInforme o menu que deseja visualizar:  ");
				categoria = cad.nextInt();
				if(categoria < 1 || categoria > 9) {
					do {
						System.out.println("Opção invalida! tente novamente:\n");
							categoria = cad.nextInt();
					} while ( categoria < 1 ||  categoria > 9);

				}
				switch(categoria) {
				case 1:
					cont = ContGabinete;
					break;
				case 2:
					cont = ContPlacaMae;
					break;
				case 3:
					cont = ContPlacaDeVideo;
					break;
				case 4:
					cont = ContMemoriaRam;
					break;
				case 5:
					cont = ContArmazenamento;
					break;
				case 6:
					cont = ContProcessador;
					break;
				case 7:
					cont = ContCooler;
					break;
				}
					
				System.out.println("--OPÇÕES-- \n [1]VISUALIZAR CADASTROS \n [2]CADASTRAR \n [3]EDITAR \n [4]EXCLUIR \n [5]VOLTAR");
				    menu = entrada.nextInt();
				    if(menu < 1 || menu > 5) {
						do {
							System.out.println("Opção invalida! tente novamente:\n");
							menu = entrada.nextInt();
						} while (menu < 1 || menu > 5);
					}
					switch(menu) {
					case 1:
						System.out.println("--VISUALIZA--");
						Produtos ProdutoVisualiza = new Produtos();
						System.out.println(ProdutoVisualiza.VisualizaRegistro(categoria,cont));
						break;
							
					case 2:
						System.out.println("--CADASTRO--");
						Produtos produto = new Produtos();
						System.out.println(produto.cadastro(categoria,cont));
						switch(categoria) {
						case 1:
							ContGabinete++;
							break;
						case 2:
							ContPlacaMae++;
							break;
						case 3:
							ContPlacaDeVideo++;
							break;
						case 4:
							ContMemoriaRam++;
							break;
						case 5:
							ContArmazenamento++;
							break;
						case 6:
							ContProcessador++;
							break;
						case 7:
							ContCooler++;
							break;
						}
						break;
					
					case 3:
						System.out.println("--EDITA--");
						Produtos ProdutoEdita = new Produtos();
						System.out.println(ProdutoEdita.EditaRegistro(categoria,cont));
						break;
						
					case 4:
						
						break;
					case 5:
						break;
						}
					   
					break;
				   
			//FORNECEDOR
			case 2:
				System.out.println("teste parada");
				break;

			}	
		}while(LoopApp !=3);
	entrada.close();	
	cad.close();

	}

}
