package Aula02;

public class Aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        System.out.println("CANETA 1");
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        System.out.println(" ");
        System.out.println("CANETA 2");
        c1.cor = "Preta";
        c1.ponta = 0.3f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
