package q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("boa tarde caro espectador");
        System.out.println("digite qual jogo deseja participar no torneio");
        System.out.printf("1 para futebol %n2 para basquete %n3 para volei");
        String escolha = s.nextLine();

        switch (escolha){
            case "1":
                System.out.println("digite seu nome");
                String nome = s.nextLine();
                System.out.println("digite seu numero");
                String numero = s.nextLine();
                System.out.println("digite o tempo de jogo");
                String tempo = s.nextLine();
                System.out.println("digite o tipo de campo");
                String tipoDeCampo = s.nextLine();
                Futebol futebol = new Futebol(nome,numero,tempo,tipoDeCampo);
                System.out.println(futebol);
            break;
            case "2":
                System.out.println("digite seu nome");
                String nome2 = s.nextLine();
                System.out.println("digite seu numero");
                String numero2 = s.nextLine();
                System.out.println("digite o tempo de jogo");
                String tempo2 = s.nextLine();
                System.out.println("digite o tipo de campo");
                String alturaDoJogador = s.nextLine();
                Basquete basquete = new Basquete(nome2,numero2,tempo2,alturaDoJogador);
                System.out.println(basquete);
            break;
            case "3":
                System.out.println("digite seu nome");
                String nome3 = s.nextLine();
                System.out.println("digite seu numero");
                String numero3 = s.nextLine();
                System.out.println("digite o tempo de jogo");
                String tempo3 = s.nextLine();
                System.out.println("digite o tamanho da rede");
                String tamanhoDaRede = s.nextLine();
                Volei volei = new Volei(nome3,numero3,tempo3,tamanhoDaRede);
                System.out.println(volei);

        }



    }
}