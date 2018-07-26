package fh.br.com.bookstore.Interface.impl;

import java.util.ArrayList;

import fh.br.com.bookstore.Interface.AutorInterface;


public class DefaultAutorFacade implements AutorInterface{
	ArrayList<String> autores = new ArrayList<String>();
	@Override
	public ArrayList<String> popular() {
		
		autores.add("Juca Bala");
	    autores.add("Marcos Paqueta");
	    autores.add("Maria Antonieta");
	    autores.add("Antônio Conselheiro");
	 
		// TODO Auto-generated method stub
	    return autores;
		
	}

}
