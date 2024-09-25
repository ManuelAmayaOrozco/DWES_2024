package com.es.tema0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiClaseJava {


    public static void main(String[] args) {


        //Para imprimir por pantalla se suele usar el println
        //println("Hola mundo")
        System.out.println("Hola mundo.");

        //Variables en Java, igual que en Kotlin tienen tipado fuerte
        int numero = 1; //var numero = 1
        // String
        String nombre;
        nombre = "Pepe";
        // char
        char carac = 'c';

        // double
        double precio = 7.17;
        // float
        float altura = 1.75f;

        // boolean -> tipo de dato para valores de verdadero/falso
        boolean cansado = true;

        // long
        long numeroLargo = 12345678;
        // byte
        byte numeroMasCorto = 1;
        // short
        short numeroCorto = 2;

        //Estructuras de control
        int i = 0;
        int j = 1;
        if (i <= j) {
            System.out.println("i es menor.");
        } else if (i == j){
            System.out.println("son iguales.");
        } else {
            System.out.println("j es menor.");
        }

        //Estructuras de repetición (bucles)
        //bucle for (versión clásica)
        for (int k = 0; k <= 10; k++) {
            System.out.println(k);
        }

        /*
        Kotlin
        for (k in 0..10) {
            println(k);
        }
        */

        //bucle while
        int variable = 0;
        while(variable < 100) {
            System.out.println("La variable es " + variable);
            variable++;
        }

        //bucle do...while
        do {
            System.out.println("La variable es " + variable);
            variable--;
        } while (variable >= 0 );

        //Estructuras de datos
        //Arrays ->
        String[] arrayDeString = new String[5];
        arrayDeString[0] = "Cadena";
        arrayDeString[1] = "Cadena";
        arrayDeString[2] = "Cadena";
        arrayDeString[3] = "Cadena";
        arrayDeString[arrayDeString.length - 1] = "Ultima Cadema";

        //Bucle for each
        for (String cadenaTemp : arrayDeString) {
            System.out.println(cadenaTemp);
        }

        //HashSet, TreeSet -> No puede haber duplicados
        //HashMap, TreeMap -> Duplicados si (en los valores)
        //ArrayList, LinkedList -> Duplicados si
        // Queue

        List<Integer> listaDeNumeros = new ArrayList<Integer>();
        //var listaDeNumeros = mutableListOf<Int>()
        listaDeNumeros.add(6);
        listaDeNumeros.add(7);
        listaDeNumeros.add(10);
        listaDeNumeros.add(5);
        listaDeNumeros.add(2);
        listaDeNumeros.add(1, 11);

        Map<Integer, String> listin = new HashMap<>();
        listin.put(11010, "Cadiz Laguna");
        listin.put(11510, "Puerto Real");
        //var listin = mutableMapOf<Int, String>()

        for (int num : listaDeNumeros) {
            System.out.println(num);
        }

        listaDeNumeros.forEach(l -> {System.out.println(l);});

        // listadeNumeros.foreach{ num -> println(num)}

        for (Map.Entry<Integer, String> dupla : listin.entrySet()) {
            System.out.println(dupla.getKey());
            System.out.println(dupla.getValue());
        }

        for (int key : listin.keySet()) {
            System.out.print(key + ": ");
            System.out.println(listin.get(key));

        }
    }


}
