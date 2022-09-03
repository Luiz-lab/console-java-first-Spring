package com.br.calixto.FirstStep;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstStepApplication {

	public static void main(String[] args) {
		System.out.println("Meu Primeiro Projeto em SpringBoot, top!!!");
		Scanner teclado = new Scanner(System.in);
		System.out.println("DIgite o primeiro nome: ");
		String nome1 = teclado.nextLine();
		System.out.println("DIgite o segundo nome: ");
		String nome2 = teclado.nextLine();
		System.out.println("DIgite o terceiro nome: ");
		String nome3 = teclado.nextLine();
		System.out.println("DIgite o quarto nome: ");
		String nome4 = teclado.nextLine();
		System.out.println("DIgite o quinto nome: ");
		String nome5 = teclado.nextLine();
		System.out.println("Os nomes digitados foram: "+ nome1 +","+nome2+","+nome3+","+nome4+","+nome5 );
		SpringApplication.run(FirstStepApplication.class, args);
	}

}
