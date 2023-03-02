package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivo {
   
    public static void main(String[] args) {
        int[]idadees= new int[5];
        for(int i=0;i<idadees.length;i++){
            idadees[i]=i*i;
            System.out.println(idadees[i]);
        }
    }
}
