package Aula05;

import java.sql.SQLOutput;

public class ContaBanco {

    //Atibutos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    //Métodos Personalizados

    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono(a): " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("--------------------------------------");
        System.out.println("");
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta de " + this.getDono() + " aberta com Sucesso!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta de " + this.getDono() + " com dinheiro! Impossível fechar esta conta!");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta de " + this.getDono() + " em débito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso!");
        }

    }

    public void depositar(float v){
        if (this.getStatus() == true) {
            this.setSaldo(getSaldo() + v);
            System.out.println("Depósito de R$" + v + " efetuado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if (this.getStatus() == true) {
           if (this.getSaldo() >= v) {
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque de R$" + v + " realizado na conta de " + this.getDono());
           } else{
               System.out.println("Saldo Insuficiente na conta de " + this.getDono() + " !");
           }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
        public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus() == true){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
    }

    //Métodos Especiais
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }



    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
}
