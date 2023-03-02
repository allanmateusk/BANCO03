package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeRefencias;

public class GuardadorDeReferencias {
    public static void main(String[] args) {
        GuardadorDeRefencias guardar=new GuardadorDeRefencias();
        Conta cc =new ContaCorrente(22, 22);
        guardar.adiciona(cc);
        Conta cc2=new ContaCorrente(11, 11);
        guardar.adiciona(cc2);    
        
        int tamanho=guardar.getQuantidadeDeElementos();
        System.out.println(tamanho);
        Conta ref=(Conta)guardar.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
