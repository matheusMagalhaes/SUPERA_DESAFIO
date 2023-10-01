package TERCEIRO_DESAFIO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerceiroDesafio {

    public static int countPairsWithDifferece(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int qtd = 0;

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        for (int num : arr) {
            int complement = num + k;

            if ((k != 0 && map.containsKey(complement)) ||
                    (k == 0 && map.get(num) > 1)) {
                qtd++;
            }
        }

        return qtd;
    }

    public static void readArrayAndTargetValue(int n) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int[] arr = new int[n];
        int k = 0;
        int count;

        for (int i = 0; i < n; i++) {
            System.out.println("Insira um valor: ");
            num = scan.nextInt();

            arr[i] = num;
        }

        if (arr.length > 0 && num != 0) {
            System.out.println("Insira um valor alvo: ");
            k = scan.nextInt();
            count = countPairsWithDifferece(arr, k);
            System.out.println("Quantidade de pares: " + count);

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("Tamanho do array: ");
        n = scan.nextInt();

        readArrayAndTargetValue(n);
        scan.close();

    }
}
