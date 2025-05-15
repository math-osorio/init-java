package nivelBasico;

public class lacosRepeticao {
    public static void main(String[] args) {

        /*
        * while
        * for*/

        //while (condição) {tudo aqui vai acontecer};
        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        /*while (numeroDeClones <= numeroMaxDeClones){
            numeroDeClones++;
            System.out.println("O Naruto fez mais um clone das sombras " + numeroDeClones);

        }*/

        // for (fori) - atalho do intellij
        for (int i = 0; i <= numeroMaxDeClones; i++) {
            System.out.println("Naruto está se clonando e já se clonou " + i + " vezes");

        }


    }
}
