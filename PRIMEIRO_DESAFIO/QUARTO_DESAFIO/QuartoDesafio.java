package PRIMEIRO_DESAFIO.QUARTO_DESAFIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {

    public static String desembaralharFrase(String frase) {
        StringBuilder desembaralhada = new StringBuilder(frase);
        return desembaralhada.reverse().toString();

    }

    public static void readString(int n) {
        Scanner scan = new Scanner(System.in);
        String lines = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Frase:  ");
            lines = scan.nextLine();
            System.out.println("Correto: " + desembaralharFrase(lines));

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String desembaralhada;

        System.out.println("Quantidade de linhas: ");
        n = scan.nextInt();
        readString(n);
    }
}