package LojaInformatica;

import java.io.File;

public class Funcoesinicio {
	
	public Boolean importes() {
		return true;
	}
	public Boolean Diretorio() {
		Boolean diretorio = false;
		File directory = new File("C:/WS-Trabalho/");
	    if (directory.mkdir()) {
	        diretorio = true;
	    }
	    
		File directoryProdutos = new File("C:/WS-Trabalho/Produtos");
	    if (directoryProdutos.mkdir()) {
	    	diretorio = true;
	    }
		File directoryGabinete = new File("C:/WS-Trabalho/Produtos/Gabinete");
	    if (directoryGabinete.mkdir()) {
	    	diretorio = true;
	    }
	    
		File directoryFornecedor = new File("C:/WS-Trabalho/Fornecedor");
	    if (directoryFornecedor.mkdir()) {
	    	diretorio = true;
	    }
	    if (diretorio == true) {
	    	System.out.println("Diretorios criados com sucesso");
	    	return true;
	    }else {
	    	System.out.println("Diretorios já criados ou falha na criação");
	    	return false;
	    }
	    
	}

}
