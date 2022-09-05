package com.br.calixto.FirstStep.models;

import java.util.List;

public class Aluno {
    private String nome;
    private List<Float> nota;

    // public Aluno(String nome, double nota){
    //     nome = this.nome;
    // }

    public List<Float> getNota() {
        return nota;
    }
    public void setNota(List<Float> nota) {
        this.nota = nota;
    }

 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float media(){
        float media = 0;

        if(this.nota != null){
            for(Float nota:this.nota){
                media += nota;
            }
            media = media/this.nota.size();
        }
        return media;
    }

    public String statusAluno(){
        var media = this.media();
        if (media<5) {
            return "Reprovado" ;
        }
        if(media >= 5 && media <7){
            return "Recuperação";
        }
        else {
            return "Aprovado";
        }
    }   
}
