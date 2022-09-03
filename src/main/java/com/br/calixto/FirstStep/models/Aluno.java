package com.br.calixto.FirstStep.models;

public class Aluno {
    private String nome;
    private double[] nota;

    public Aluno(String nome, double nota){
        nome = this.nome;
        nota = this.nota;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNota() {
        return nota;
    }
    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public void alunoAprovado(double[]notas){
        this.nota[] = notas[]

        if(this.nota >5){
            System.out.println("Aluno Aprovado");
        }
        else if(this.nota =5){
            System.out.println("Aluno em Recuperação");
        }
        else {
            System.out.println("Aluno Reprovado");
        }
    }
    

}
