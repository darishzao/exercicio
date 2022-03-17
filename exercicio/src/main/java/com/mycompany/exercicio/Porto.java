/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

import java.util.ArrayList;

/**
 *
 * @author Tiago Santos
 */
public class Porto {
    
    ArrayList<Navio> navios;
    ArrayList<PortaContentores> portaContentores;
    ArrayList<Petroleiro> petroleiros;

    /**
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @return cria um novo Navio e faz a verificação de matriculas
     */
    public boolean novoNavio(String matricula, String nome, float comprimento) {
        Navio navio = new Navio(matricula, nome, comprimento);
        for (int i = 0; i < navios.size(); i++) {
            if (matricula.equals(navios.get(i).getMatricula())) {
                System.out.println("Matricula já existe");
                return false;
            }
        }
        navios.add(navio);
        return true;
    }

    /**
     *
     * @return resultado dos contentores máximos dos navios dentro do "porto"
     */
    public int maxContentores() {
        int resultado = 0;
        for (int i = 0; i < portaContentores.size(); i++) {
            resultado += portaContentores.get(i).getNrMaximoContentores();
        }
        return resultado;
    }

    /**
     *
     * @return capacidade total dos navios dentro do "porto"
     */
    public float capacdidadeTotal() {
        float resultado = 0;
        for (int i = 0; i < portaContentores.size(); i++) {
            resultado += portaContentores.get(i).getNrMaximoContentores();
        }
        resultado *= 10;
        for (int i = 0; i < petroleiros.size(); i++) {
            resultado += petroleiros.get(i).getCapacidade();
        }
        return resultado;
    }
    
}
