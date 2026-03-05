import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();

        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        objestantes[][] estantes = m.l(filas, columnas, sc);
        objestantes[][] disponibles = m.disponible(estantes);

        System.out.println("\nProductos disponibles:");
        for (int i = 0; i < disponibles.length; i++) {
            for (int j = 0; j < disponibles[i].length; j++) {
                if (disponibles[i][j] != null) {
                    System.out.println("Producto: " + disponibles[i][j].getNombre() +
                            ", Precio: " + disponibles[i][j].getPrecio());
                }
            }
        }

        sc.close();
    }
    
}
