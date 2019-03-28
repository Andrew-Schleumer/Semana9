/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.oo;

/**
 *
 * @author Manoel Rodriguez
 */
public class Main {

    public static void main(String[] args) {
        Horario horaAtual = new Horario();
        horaAtual.setHoras(14);
        horaAtual.setMinutos(51);
        horaAtual.setMinutos(43);

        Horario horaIntervalo = new Horario();
        horaIntervalo.setHoras(14);
        horaIntervalo.setMinutos(50);
        horaIntervalo.setMinutos(00);
        
        //CLASSE DATA
        Data hoje = new Data();
        hoje.setDia(25);
        hoje.setMes(03);
        hoje.setAno(2019);
        
        

    }
    
}
