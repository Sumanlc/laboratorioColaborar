import java.util.Scanner;

public class ejercicio1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Primir cambio desde el archivo clonado de suman");
        System.out.println("Segunde cambio desde el archivo clonado de angel, cambiando la misma linea que Suman");

        System.out.println("PRUEBA ERROR CONFLICTO GIT MERGE");



        String nombre, apellido1, apellido2, year;

        int num;
        final int minaprobatorio = 5;
        boolean encontrado;

        System.out.println("ingresa el nombre del alumno");
        nombre = sc.nextLine();
        System.out.println("ingresa el apellido 1");
        apellido1 = sc.nextLine();
        System.out.println("ingresa el apellido 2");
        apellido2 = sc.nextLine();
        System.out.println("Año nacimiento");
        year = sc.nextLine();

        String cod = codigo(nombre, apellido1,apellido2,year);
        System.out.println("el codigo es: " + cod);


        System.out.println("Cuantos modulos has cursado");
        num = validaInt();

        System.out.println("A continuacion ingresa las calificaciones de cada modulo ");
        int [] moduloCalificados = creaModulos(num);

       suma(moduloCalificados);
       int aprobadas =  mayores(moduloCalificados, minaprobatorio);


        System.out.println("modulos aprobados : " + aprobadas);
        int aprobadas1 = mayores( moduloCalificados, minaprobatorio);
        System.out.println("mayores a 5: " + aprobadas1);


        System.out.println("Buscado calificacion:");

        boolean cero = existe(moduloCalificados,0);
        System.out.println("Existe algun 0?: " + cero);

        boolean diez = existe(moduloCalificados,10);
        System.out.println("Existe algun 10?: " +  diez);

        double media = suma(moduloCalificados)/ moduloCalificados.length;
        System.out.println("la media de las calificaciones es: " + media );







    }

    private static boolean existe(int[] moduloCalificados, int numPedido) {
        boolean encontrado = false;
        for (int i = 0; i < moduloCalificados.length ; i++) {
            if (moduloCalificados[i] == numPedido){
                encontrado = true;
            }else {
                encontrado = false;
            }
        }
        return encontrado;
    }

    private static int mayores(int[] moduloCalificados, int minaprobatorio) {
        int cont =  0;

        for (int i = 0; i < moduloCalificados.length ; i++) {
            if (moduloCalificados[i] <= 5){
                cont++;
            }
        }
        return cont;
    }

    private static int suma(int [] modulosCalificados) {
        int suma = 0;
        for (int i = 0; i < modulosCalificados.length ; i++) {
            suma += modulosCalificados[i];
        }
        return suma;

    }


    private static int [] creaModulos(int num) {
        int [] modulos = new int[num];
        for (int i = 0; i < modulos.length ; i++) {
            System.out.println("calificacion modulo "+ (i+1));
            modulos[i]= validaInt();
        }
        return modulos;

    }

    private static int validaInt() {
        while (!sc.hasNextInt()){
            System.out.println("Eso no es un entero, intentalo nuevamente");
            sc.next();
        }
        return sc.nextInt();
    }
    private static double validaDouble() {
        while (!sc.hasNextDouble()){
            System.out.println("Eso no es un entero, intentalo nuevamente");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static String codigo(String nombre, String apellido1, String apellido2, String year ) {
        String n = nombre.toUpperCase().substring(0,3);
        String ap1 = apellido1.toUpperCase().substring(0,3);
        String ap2 = apellido2.toUpperCase().substring(0,3);

        n = n.concat(ap1).concat(ap2).concat(year);
        return n;
    }
}