package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para definir o até que numero deve ser feita a busca de numeros primos ");
        int numeroLimite = scanner.nextInt();
        List<Integer> listaDePrimos = new ArrayList();
        List<Integer> listaSomaPrimos = new ArrayList();

//        encontraPrimo(n1);


        for (int i = 1; i <= numeroLimite; i ++){
            if(primoVal(i)) {
                listaDePrimos.add(i);
                System.out.println("numero primo: " + i);
            }
        }

        Integer somaPrimo = 0;
        for ( Integer numeroPrimo: listaDePrimos) {
            if(numeroPrimo == 2){
                somaPrimo = numeroPrimo;
                continue;
            }

            somaPrimo = somaPrimo + numeroPrimo;
            if(primoVal(somaPrimo) && somaPrimo <= numeroLimite){
                listaSomaPrimos.add(somaPrimo);
            }
        }

        int size = listaSomaPrimos.size();
        Integer maiorSomaPrimo = listaSomaPrimos.get(size-1);
        System.out.println("Maior soma possivel consecutiva de numero primos: " + maiorSomaPrimo + " Abaixo de " + numeroLimite);

        scanner.close();
    }
    
    public static boolean primoVal(int numero) {
        if (numero == 0 || numero == 1) {
            return false;
        }
        int i, fim;
        fim = (int) Math.sqrt(numero);
        for (i = 2; i <= fim; i++) {
            if ((numero % i) == 0) {
                return false;
            }
        }
        return true;

    }
}
