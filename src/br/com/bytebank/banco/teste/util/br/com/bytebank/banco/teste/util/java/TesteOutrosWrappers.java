package br.com.bytebank.banco.teste.util.br.com.bytebank.banco.teste.util.java;

public class TesteOutrosWrappers {
    public static void main(String[] args) {
        Integer idaderef= Integer.valueOf(29);//autoboxing
        System.out.println(idaderef.doubleValue());//unboxing

Double dref=Double.valueOf(3.2);//autoboxing
System.out.println(dref.doubleValue());//unboxing
Boolean bref=Boolean.TRUE;
System.out.println(bref.booleanValue());


    }
}
