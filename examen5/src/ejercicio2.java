import java.util.Scanner;

public class ejercicio2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("creando una matriz:");
        System.out.println("Cuantas filas tendra: ");
        int num1 = validaInt();
        System.out.println("cuantas columna tendra:");
        int num2 = validaInt();

        double [][] matriz = new double[num1][num2];
        int num3 = 2;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                matriz[i][j] = (int)Math.random()*20+1;
            }

        }
        System.out.println("LA matriz es :");
        System.out.print("[");
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " " );
            }
            System.out.println();
        }



        System.out.println("ingresa un valor v ");
        int v = validaInt();
        System.out.println("Valor buscado es: " + v);











        }
    private static double validaDouble() {
        while (!sc.hasNextDouble()){
            System.out.println("Eso no es un entero, intentalo nuevamente");
            sc.next();
        }
        return sc.nextDouble();
    }
    private static int validaInt() {
        while (!sc.hasNextInt()){
            System.out.println("Eso no es un entero, intentalo nuevamente");
            sc.next();
        }
        return sc.nextInt();
    }


}
