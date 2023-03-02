package br.com.bytebank.banco.modelo;

public abstract class Conta extends Object implements Comparable<Conta>{
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
     private static int total;
     
    // costrutor
    public Conta(int agencia , int numero){
        Conta.total++;
        //System.out.println(" o tatal de contas e "+total);
        this.agencia=agencia;
        this.numero=numero;
        
    }
    
    public abstract void deposita(double valor);

    public void saca(double valor ) throws SaldoInsuficienteExecption{
if(this.saldo<valor){
    throw new SaldoInsuficienteExecption("saldo:"+ this.saldo + ",valor:" + valor);
}
  this.saldo=this.saldo-valor;
}
public void transfere(double valor,Conta destino)throws SaldoInsuficienteExecption{
    this.saca(valor);
        destino.deposita(valor);
}

public double getsaldo(){
    return this.saldo;
}
public int getNumero(){
    return this.numero;
}
public void setNumero(int novoNumero) {
    if(numero<=0){
        System.out.println("nao pode valor menor ou igual a 0");
        return;
    }
    this.numero = novoNumero;
}
public int getAgencia(){
    return this.agencia;
}
public void setAgencia(int agencia) {
    if(agencia<=0 ){
        System.out.println("nao pode valor menor ou igual a 0");
        return;
    }
    this.agencia = agencia;
}
 public Cliente getTitular(){
    return this.titular;
 }
 public void setTitular(Cliente titular){
 this.titular= titular;}
 public static int getTotal() {
     return total;
 }
 public boolean eigaul(Conta outra){
    if(this.agencia!=outra.agencia){
return false;
    }
    if(this.numero!=outra.numero){
        return false;
    }
    return true;
 }
 @Override
 public boolean equals(Object ref) {
    Conta outra = (Conta)ref;
    if(this.agencia!=outra.agencia){
        return false;
 }
 if(this.numero!=outra.numero){
    return false;
}
return true;
}

 @Override
 public String toString() {
     return "numero:"+this.getNumero()+" agencia: "+this.getAgencia()+"saldo: "+this.saldo;
 }
 @Override
 public int compareTo(Conta outra) {
    
     return Double.compare(this.saldo, outra.saldo);
 }

}

