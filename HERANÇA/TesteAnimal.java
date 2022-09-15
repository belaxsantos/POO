package Heranca;

public class TesteAnimal {

    public static void main(String[] args) {

         Cachorro doguinho = new Cachorro("Alceu",4,"Au-Au" );
         Cavalo pioneiro = new Cavalo("Rone",8,"relinchar");
         preguica dorminhoca = new preguica("Analu",15, "ronca");

         doguinho.imprimirInfo();
         doguinho.correDoguinho();
         doguinho.emitirLatido();
         pioneiro.imprimirInfo();
         pioneiro.correCavalinho();
         pioneiro.relinchoCavalo();
         dorminhoca.imprimirInfo();
         dorminhoca.sobePreguicinha();
         dorminhoca.roncoPreguicinha();

    }

}