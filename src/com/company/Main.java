package com.company;

public class Main {

    public static void main(String[] args) {

        int resultado=0;
        resultado=suma(4,2,3);
	// write your code here
        System.out.println("el resultado de la suma de los tres parametros " + resultado);

        var miCoche=new coche().incrementar(3);
        System.out.println("Número de puestas del objeto " + miCoche);

    }

    static int suma(int a, int b, int c){
        return a+b;
    }


}

class coche{

    int incrementar(int p){
        return p=p+1;
    }
}