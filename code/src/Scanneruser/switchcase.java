package Scanneruser;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou: " + escolhaDoUsuario);

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu Naruto Uzumaki, o futuro hokage");
                break;
            case 2:
                System.out.println("Você escolheu Sasuke Uchiha, o ninja revoltado");
                break;
            case 3:
                System.out.println("Você escolheu Sakura Haruno, a personagem feminina irrelevante");
                break;
            default:
                System.out.println("Escolha SOMENTE números correspondentes aos personagens citados de 1 a 3 !");
        }



        scanner.close();
    }
}
