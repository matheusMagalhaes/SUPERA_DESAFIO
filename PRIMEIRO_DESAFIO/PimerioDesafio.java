import java.util.Scanner

public class PrimerioDesafio {

	void readAndOrderNumber(int n) {
		Scanner scan = new Scanner(System.in);
		int readNumber;

		if (n > 0) {
			System.out.println("Quantidade:" + n);
			for (int i = 0; i <= n; i++) {
				System.out.println("Insira um número: " + readNumber);
				readNumber = scan.nextInt();
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantity;

		System.out.println("Insira uma quantidade: ");
		quantity = scan.nextInt();
		this.readAndOrderNumber(quantity);

	}

}
