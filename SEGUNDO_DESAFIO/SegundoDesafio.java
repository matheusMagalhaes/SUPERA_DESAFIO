package SEGUNDO_DESAFIO;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SegundoDesafio {

  public static void saque(Double valor) {
    double[] notas = { 100, 50, 20, 10, 5, 2 };
    double[] moedas = { 0.05, 0.10, 0.25, 0.50, 1.00 };

    System.out.println("NOTAS:  ");
    for (double nota : notas) {
      int qtdNotas = (int) (valor / nota);
      valor -= qtdNotas * nota;
      System.out.println(qtdNotas + " nota(s) de R$" + nota);
    }

    System.out.println("MOEDAS: ");
    for (double moeda : moedas) {
      int qtdMoeda = (int) (valor / moeda);
      valor -= qtdMoeda * moeda;
      System.out.println(qtdMoeda + " moeda(s) de R$" + moeda);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Valor de saque: ");
    double valor = scan.nextDouble();
    scan.close();
    saque(valor);
  }
}
