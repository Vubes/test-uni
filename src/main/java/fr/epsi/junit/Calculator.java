package fr.epsi.junit;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int multi(int a, int b){
        return a * b;
    }

    public int substract(int a, int b){ return a - b;
    }

    public int div(int a, int b){
        return a/b;
    }

    public int add(int[] nmbers){

        int[] tab = {1, 2, 3, 4, 5};
        int somme = 0;
        for( int i : tab) {
            somme = somme + i;
        }
        return somme;
        //System.out.println("La somme des éléments du tableau est : "+ somme);
    }
}
