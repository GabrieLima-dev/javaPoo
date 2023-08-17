package Aula07;

import java.sql.SQLOutput;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso < 52.2f){
            categoria = "Inválido";
        } else if (peso <= 70.3) {
            categoria = "Leve";
        } else if (peso <= 83.9) {
            categoria = "Médio";
        } else if (peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }



    public void apresentar() {
        System.out.println("-----------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem; " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + "anos");
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou " + getVitorias());
        System.out.println("Perdeu " + getDerrotas());
        System.out.println("Empatou " + getEmpates());
        System.out.println("");
    }


    public void status() {
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias.");
        System.out.println(getDerrotas() + " derrotas.");
        System.out.println(getEmpates() + " empates.");
    }


    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }


    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }


    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
