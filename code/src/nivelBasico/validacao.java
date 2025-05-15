package nivelBasico;

import java.util.Scanner;

public class validacao {
    public static void main(String[] args) {
        int realpassword = 84068535;
        int val = 0;
        System.out.println("LOGIN");

        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String name = input.nextLine();

        System.out.print("Senha: ");
         int trypassword = input.nextInt();
        input.close();

        if(realpassword == trypassword){
            System.out.println("Senha Correta"); int val = 1;

        } else {
            System.out.println("Senha Incorreta"); int val = 0;
        }

        while (){

        }







    }
}
