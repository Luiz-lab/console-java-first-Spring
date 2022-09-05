package com.br.calixto.FirstStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.calixto.FirstStep.models.Aluno;

@SpringBootApplication
public class FirstStepApplication {

	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	private static List <Aluno> alunos = new ArrayList<>();
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		while(true){
			int opcao = 0;
			limpaTela();
			System.out.println("Cadastro dos alunos:");
			System.out.println("Indique a opção desejada:");
			System.out.println("1-Cadastrar Aluno\n2-Mostrar Relátorio\n3-Sair");
			
			try{
				opcao = Integer.parseInt(teclado.readLine());
			}
			catch(Exception e){
				System.out.println("Opção Invalida");
			}

			var sair = false ;
			switch (opcao) {
				case 1:
					cadastroAluno();
					break;
				case 2:
					mostrarAunos();
					break;
				case 3:
					sair = true;
					break;
				
				default:
					break;
			}
			if (sair) {
				limpaTela();
				break;
			}
		}
		
		

		SpringApplication.run(FirstStepApplication.class, args);
	}

	private static void mostrarAunos() throws InterruptedException {
		if (alunos.size() ==0) {
			mensagem("Nenhum aluno cadastrado");
			return;
		}
		System.out.println("------ [Relação de ALunos]---------");
		for (Aluno aluno : alunos) {
			System.out.println("Nome: "+ aluno.getNome());
			var notes = aluno.getNota();
			System.out.println("Notas : "+ notes);
			System.out.println("Media: "+ aluno.media());
			System.out.println("Situação: "+ aluno.statusAluno());
			
		}

		espera(10);
		limpaTela();
	}

	private static void cadastroAluno() throws IOException, InterruptedException{
		var aluno = new Aluno();
		System.out.println("Digite o nome do aluno");
		aluno.setNome(teclado.readLine());
		capturaNotasAlunos(aluno);
		alunos.add(aluno);
		mensagem("Aluno cadastrado com sucesso");

	}

	private static void capturaNotasAlunos(Aluno aluno) throws InterruptedException {
		System.out.println("Digite a nota do aluno "+ aluno.getNome());
		if(aluno.getNota() == null){
			aluno.setNota(new ArrayList<Float>());
		}
			try {
				aluno.getNota().add(Float.parseFloat(teclado.readLine()));
			} catch (Exception e) {
				mensagem("Nota Invalida");
				capturaNotasAlunos(aluno);
			}

			try {
				System.out.println("Se desejar continuar digite 1, caso não digite 0");
				int opcaos = Integer.parseInt(teclado.readLine());
				System.out.println(opcaos);
				if (opcaos ==1) {
					capturaNotasAlunos(aluno);
				}
				return;
				
			} catch (Exception e) {
				mensagem("Opção Invalida, iniciando novo cadastro.");
				capturaNotasAlunos(aluno);
			}
				
		}
	

	private static void mensagem(String texto) throws InterruptedException {
		limpaTela();
		System.out.println(texto);
		espera(2);
		limpaTela();
	}

	private static void espera(int time) throws InterruptedException {
		Thread.sleep(time*1000); ;
	}

	private static void limpaTela() {
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}

}
