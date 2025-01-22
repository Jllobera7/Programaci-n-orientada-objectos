import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner teclat=new Scanner(System.in);
        ArrayList<Libro> lista = new ArrayList<>();
        boolean end = false;

        while (!end) {
            System.out.println("Menu:");
            System.out.println("1. Añadir Libro");
            System.out.println("2. Eliminar Libro");
            System.out.println("3. Ver lista de Libros");
            System.out.println("4. Salir");

            System.out.println("Introduce tu opcion: ");
            int option = teclat.nextInt();
            teclat.nextLine();

            if (option == 1) {
                Libro.addLibro(lista);
            }else if (option == 2) {
                deleteLibro();
                }

            }else if (option == 3) {
                for (int i=0;i<lista.size();i++) {
                    System.out.println(lista.get(i).toString());
                }
            }
            else if (option == 4) {
                end = true;
            }
        }
    }
}