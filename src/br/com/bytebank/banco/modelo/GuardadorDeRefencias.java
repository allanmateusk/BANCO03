package br.com.bytebank.banco.modelo;

public class GuardadorDeRefencias {
private Object[] referencias;
private int posiçaolivre;
public GuardadorDeRefencias(){
    this.referencias=new Object[10];
    this.posiçaolivre=0;
}
public void adiciona(Object ref){
    this.referencias[this.posiçaolivre]=ref;
    this.posiçaolivre++;
}
public int getQuantidadeDeElementos() {
    return this.posiçaolivre;
}
public Object getReferencia(int pos) {
    return this.referencias[pos];
}
}
