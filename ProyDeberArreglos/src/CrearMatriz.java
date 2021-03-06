import java.util.InputMismatchException;
import java.util.Scanner;

public class CrearMatriz {

	public static void main(String[] args) {
		int m,n,op;
		Scanner sc = new Scanner(System.in);
		System.out.println("=== BIENVENIDO ===");
		System.out.println("Ingrese las dimensiones de la matriz a crear");
		//validación de entradas
		while(true) {//iteramos hasta romper el bucle
			try {
				System.out.print("Cantidad de filas: ");
				m=sc.nextInt();
				break;//rompemos el bucle
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El valor ingresado no es un número entero ");
				sc.next();//limpiamos buffer de scanner
			}
		}
		while(true) {//iteramos hasta romper el bucle
			try {
				System.out.print("Cantidad de columnas: ");
				n=sc.nextInt();
				break;//rompemos el bucle
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El valor ingresado no es un número entero ");
				sc.next();//limpiamos buffer de scanner
			}
		}
		//creamos matriz de la dimensión deseada
		int[][] matriz2 = new int[m][n];
		int filas=matriz2.length, columnas=matriz2[0].length;
		//menu
		System.out.println("\n1) Rellenar matriz con elementos aleatorios\n2) Rellenar matriz con 1");
		while(true) {//iteramos hasta romper el bucle
			try {
				System.out.print("Ingrese una opción (1-2): ");
				op=sc.nextInt();
				break;//rompemos el bucle
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El valor ingresado no es un número entero ");
				sc.next();//limpiamos buffer de scanner
			}
		}
		sc.close();
		switch(op) {
		case 1:
			System.out.println("\n=== MATRIZ GENERADA ===\n");
			for(int i=0;i<filas;i++) {
				for(int j=0;j<columnas;j++) {
					matriz2[i][j]=(int)(Math.random()*50);
					System.out.print(matriz2[i][j]+"\t");
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("\n=== MATRIZ GENERADA ===\n");
			for(int i=0;i<filas;i++) {
				for(int j=0;j<columnas;j++) {
					matriz2[i][j]=1;
					System.out.print(matriz2[i][j]+"\t");
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("ERROR: La opción seleccionada no existe");
		}
	}

}
