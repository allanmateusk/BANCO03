package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteExecption;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta= new ContaCorrente(123, 032);
        conta.deposita(200);
        try {
        conta.saca(210);} catch(SaldoInsuficienteExecption ex){
            System.out.println("ex: "+ex.getMessage());
        }
        System.out.println(conta.getsaldo());
    }
}
