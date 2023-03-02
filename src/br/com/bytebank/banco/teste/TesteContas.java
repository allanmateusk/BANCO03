package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupança;
import br.com.bytebank.banco.modelo.SaldoInsuficienteExecption;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteExecption {
    
        ContaCorrente cc= new ContaCorrente(111, 0111);
        cc.deposita(1000);

        ContaPoupança cp = new ContaPoupança(222, 0222);
        cp.deposita(5000);

        cc.transfere(100, cp);
        System.out.println(cp.getsaldo());
        System.out.println(cc.getsaldo());
        
 

    }
}
  