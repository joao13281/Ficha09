package com.company;

public class TestaErro {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        try {
        metodo1();
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("Erro: " + b);
        }
        System.out.println("fim do main");
    }
    static void metodo1() {
        System.out.println("inicio do metodo1");

            metodo2();

        System.out.println("fim do metodo1");
    }
    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
        }
    }
}
