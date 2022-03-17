/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author Tiago Santos
 * Classe Navio que extend para o Porta contentores e Petroleiro
 */
public class Navio {


    public String matricula,nome;
    public float comprimento;
    
    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     */
    public Navio(String matricula, String nome, float comprimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.comprimento = comprimento;
    }

    /**
     *
     * @return  String matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @return  String Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     * 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return float comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     *
     * @param comprimento
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
      
      
      
}
