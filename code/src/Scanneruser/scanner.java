package Scanneruser;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        System.out.println("Digite o nome do Ninja: ");
        Scanner caixaTexto = new Scanner(System.in); // abrindo caixa de texto Scanner

        String name = caixaTexto.nextLine(); // nextLine() para armazenar uma String
        System.out.println("Olá " + name + " !!");

         // Fechar sempre o scanner com scanner.close

        System.out.println("-----------------------------------------------------");

        System.out.println("Escreva a idade do ninja: ");
        int idadeNinja = caixaTexto.nextInt();
        System.out.println("A idade do Ninja é: " + idadeNinja);

        if(idadeNinja > 18){
            System.out.println("O ninja está pronto para sair na missão");
        } else {
            System.out.println("O ninja ainda é menor de idade e não pode sair numa missão!");
        }

        caixaTexto.close();



    }
}
