/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author Tiago Santos
 */
public class Petroleiro extends Navio{
    private float capacidade;
            
    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param capacidade
     */
    public Petroleiro(String matricula, String nome, float comprimento, float capacidade) {
        super(matricula, nome, comprimento);
        this.capacidade = capacidade;
    }

    /**
     *
     * @return String capacidade
     */
    public float getCapacidade() {
        return capacidade;
    }

    /**
     *
     * @param capacidade
     */
    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }
            
    
}
