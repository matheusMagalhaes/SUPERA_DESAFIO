package primerioDesafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeiroDesafio {

  static List<Integer> arraySort(int n) {
    Scanner scan = new Scanner(System.in);
    int numbers = 0;
    int[] arr = new int[n];
    List<Integer> sortedArray = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      System.out.println("Insira um numero: ");
      numbers = scan.nextInt();

      arr[i] = numbers;
      sortedArray.add(arr[i]);
    }

    return sortedArray
      .stream()
      .sorted(
        Comparator
          .comparingInt((Integer num) -> num % 2)
          .thenComparingInt(num -> num)
      )
      .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n;
    List<Integer> sortedArray = new ArrayList<Integer>();

    System.out.println("Quantidade: ");
    n = scan.nextInt();
    sortedArray = arraySort(n);
    System.out.println(sortedArray);
  }
}
