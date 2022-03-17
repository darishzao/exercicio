/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author Tiago Santos
 */
public class PortaContentores extends Navio{
    private int nrMaximoContentores;
    
    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param nrMaximoContentores
     */
    public PortaContentores(String matricula, String nome, float comprimento, int nrMaximoContentores) {
        super(matricula, nome, comprimento);
        this.nrMaximoContentores = nrMaximoContentores;

    }

    /**
     *
     * @return int do NrMaximoContentores
     */
    public int getNrMaximoContentores() {
        return nrMaximoContentores;
    }

    /**
     *
     * @param nrMaximoContentores
     */
    public void setNrMaximoContentores(int nrMaximoContentores) {
        this.nrMaximoContentores = nrMaximoContentores;
    }
    
}
