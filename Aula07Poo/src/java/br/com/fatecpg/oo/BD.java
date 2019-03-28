/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.oo;

import java.util.ArrayList;

/**
 *
 * @author Manoel Rodriguez
 */
public class BD {
    private static ArrayList<Contato> contatosList;
    public static ArrayList<Contato> getContatosList(){
        if(contatosList == null){
            contatosList = new ArrayList<>();
            Contato c1 = new Contato();
            c1.setNome("Fulano");
            c1.setEmail("fulano@domain.com");
            c1.setTelefone("+55 13 99000-1111");
            contatosList.add(c1);
            
            Contato c2 = new Contato();
            c2.setNome("Beltrano");
            c2.setEmail("beltrano@domain.com");
            c2.setTelefone("+55 13 99000-2222");
            contatosList.add(c2);
        }
        return contatosList;
    }
}
