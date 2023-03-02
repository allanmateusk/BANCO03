package br.com.bytebank.banco.teste.util.br.com.bytebank.banco.teste.util.java;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    
    public static void main(String[] args) {
        int[] idades = new int [5];
        List numero = new ArrayList<Integer>();
        int idade= 29;// integer
         Integer idaderef= Integer.valueOf(29);//autoboxing
         int valor=idaderef.intValue();//unboxing
         String s = args[0];//"0"
         //Integer numeros=Integer.valueOf(s);
         int numeros=Integer.parseInt(s);
         System.out.println(numeros);
        String[] nomes = new String[5];
          numero.add(idade);//autoboxing

    }
}
