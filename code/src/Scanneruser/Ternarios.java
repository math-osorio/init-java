package Scanneruser;

public class Ternarios {
    public static void main(String[] args) {
        // Os ternarios são maneiras de enxugar o código
        //variavel = (condição) ? valorVerdadeiro : valorFalso;

        short numeroDeMissoes = 1;
        String level = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(level);
    }
}
