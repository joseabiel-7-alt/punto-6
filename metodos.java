
import java.util.Scanner;

public class metodos {

    public objestantes[][] l(int filas, int columnas, Scanner sc) {
        objestantes[][] estantes = new objestantes[filas][columnas];

        sc.nextLine(); // Limpiar el buffer después de leer el número de filas y columnas

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                estantes[i][j] = new objestantes();
                System.out.print("Nombre del producto: ");
                estantes[i][j].setNombre(sc.nextLine());
                System.out.print("Precio del producto: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Por favor, ingrese un número válido para el precio.");
                    sc.next();
                }
                estantes[i][j].setPrecio(sc.nextDouble());
                System.out.print("Disponibilidad del producto (true/false): ");
                while (!sc.hasNextBoolean()) {
                    System.out.println("Por favor, ingrese 'true' o 'false' para la disponibilidad.");
                    sc.next();
                }
                estantes[i][j].setDisponibilidad(sc.nextBoolean());
                sc.nextLine();

               
            }
        }
        return estantes;
    }
    public objestantes [][] disponible(objestantes[][] estante) {
        objestantes[][] disponibles = new objestantes[estante.length][estante[0].length];
        for (int i = 0; i < estante.length; i++) {
            for (int j = 0; j < estante[i].length; j++) {
                if (estante[i][j].isDisponibilidad()) {
                    disponibles[i][j] = estante[i][j];
                } else {
                    disponibles[i][j] = null; 
                }
            }
        }
        return disponibles;
    }
}

