package com.mycompany.edd_u4e1;

import java.util.Scanner;

public class Main {

    static CArbolBinario abb = new CArbolBinario();
    static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int op;
        System.out.println("-----------------------------------------------------");
        System.out.println("Bienvenido al sistema de árboles binarios de búsqueda");
        System.out.println("-----------------------------------------------------");
        System.out.println("Seleccione una opción para continuar");
        System.out.println("1)Insertar Nodo");
        System.out.println("2)Eliminar Nodo");
        System.out.println("3)Buscar Nodo con Información");
        System.out.println("4)Contar Nodos");
        System.out.println("5)Imprimir nodos");
        System.out.println("6)Salir");

        op = sc.nextInt();

        switch (op){
            case 1:
                insertar();
                break;
            case 2:
                eliminar();
                break;
            case 3:
                buscar();
                break;
            case 4:
                contar();
                break;
            case 5:
                imprimir();
                break;
            default: break;
        }
    }

    public static void insertar(){
        System.out.println("Ingrese el valor a insertar");
        int dato = sc.nextInt();

        abb.insertar(dato);
        menu();
    }

    public static void eliminar(){
        System.out.println("Ingrese el valor a eliminar");
        int dato = sc.nextInt();

        abb.eliminar(abb.getRaiz(), dato);
        menu();
    }

    public static void buscar(){
        int dato;

        System.out.println("Ingrese el valor a buscar");
        dato = sc.nextInt();

        abb.buscar(dato);
        menu();
    }

    public static void contar(){
        System.out.println("El árbol contine " + abb.contar(abb.getRaiz()) 
                + " nodos");
        menu();
    }

    public static void imprimir(){
        System.out.println("Seleccione el tipo de impresion");
        System.out.println("1)Preorden");
        System.out.println("2)Inorden");
        System.out.println("3)Postorden");
        int op = sc.nextInt();

        switch (op){
            case 1:
                abb.preorden(abb.getRaiz());
                break;
            case 2:
                abb.inorden(abb.getRaiz());
                break;
            case 3:
                abb.postorden(abb.getRaiz());
                break;
        }
        
        System.out.println();
        menu();
    }
}