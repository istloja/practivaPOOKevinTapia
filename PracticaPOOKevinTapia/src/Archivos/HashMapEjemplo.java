/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.util.HashMap;

/**
 *
 * @author its
 */
public class HashMapEjemplo {

    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("Real Madrid", 1);
        mapa.put("Barcelona", 5);// asi guardo
        mapa.put("Barcelona",mapa.get("Barcelona")+1);
        System.out.println(mapa.get("Barcelona"));

    }

}
