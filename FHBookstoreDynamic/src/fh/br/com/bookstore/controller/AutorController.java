package fh.br.com.bookstore.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fh.br.com.model.Autor;

@Controller
@RequestMapping("/Autor")
public class AutorController {


	    @RequestMapping("novoAutor")
	    public String form() {
	        return "formulario";
	    }
	    
	  
	    public ArrayList<Autor> listarAutores() {
	    		
	    	ArrayList<Autor> autores = new ArrayList<Autor>();
	    	
	    	Autor autor1 = new Autor();
	    	Autor autor2 = new Autor();
	    	
	    	autor1.setNome("Joao");
	    	autor2.setNome("Maria");
	    	
	    	autores.add(autor1);
	    	autores.add(autor2);
	    	
	    		System.out.println("teste!"); 
	    		
	        return autores;
	    }
	    @RequestMapping(value = "/Autor/adicionado", method = RequestMethod.GET)
	      public String getAutores(Model model) {
	    		ArrayList<Autor> autores = listarAutores();
	          model.addAttribute("autores", autores);
	          return "lista";
	      }
	
}
