package Scanneruser;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        System.out.println("Digite o nome do Ninja: ");
        Scanner caixaTexto = new Scanner(System.in); // abrindo caixa de texto Scanner

        String name = caixaTexto.nextLine(); // nextLine() para armazenar uma String
        System.out.println("O nome do ninja é: " + name);

        caixaTexto.close(); // Fechar sempre o scanner com scanner.close
    }
}
