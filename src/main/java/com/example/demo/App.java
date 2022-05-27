package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);//Cria as injeções
		
		Livro livro = factory.getBean(Livro.class);//Instancia um Livro
		livro.setNome("Harry Potter");//Seta os atributos do Livro
		livro.setCodigo("D34FD");
		
		Autor autor = factory.getBean(Autor.class);//Instancia um Autor
		autor.setNome("J. K. Rowling");//Seta os atributos do Autor
		
		livro.exibir();
		
		((AbstractApplicationContext) factory).close();//Conversão para AbstractApplicationContext - encerra o factory
	}

}
