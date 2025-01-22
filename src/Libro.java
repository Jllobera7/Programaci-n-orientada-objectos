import java.util.Scanner;
import java.util.ArrayList;

public class Libro{

    //Atributos

    private int ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private int copiasTotales;
    private int copiasDisponibles;

    private static int contador=0;

    //Constructores

    public Libro(int ISBN, String titulo, String autor, String editorial, int copiasTotales, int copiasDisponibles) {
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.editorial=editorial;
        this.copiasTotales=copiasTotales;
        this.copiasDisponibles=copiasDisponibles;
        this.contador=contador;
    }

    public Libro(){
        this.setCopiasTotales(0);
        this.setCopiasDisponibles(0);
        this.setContador();
    }

    public Libro(Libro libro){  //Contructor que hace copias de un Libro
        this.setISBN(libro.getISBN());
        this.setAutor(libro.getAutor());
        this.setTitulo(libro.getTitulo());
        this.setEditorial(libro.getEditorial());
        this.setCopiasDisponibles(libro.getCopiasDisponibles());
        this.setCopiasTotales(libro.getCopiasTotales());
        this.setContador();
    }

    //Getters y Setters

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCopiasTotales() {
        return this.copiasTotales;
    }

    public void setCopiasTotales(int copiasTotales) {
        this.copiasTotales = copiasTotales;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCopiasDisponibles() {
        return this.copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }
    public int getContador(){
        return this.contador;
        }
    public void setContador(){
        this.contador=this.contador++;
    }

    //Métodos

    public String toString(){ /*Método toString*/
        return "Libro [ISBN=" + this.ISBN + ", titulo=" + this.titulo + ", autor=" + this.autor +
                ", editorial=" + this.editorial
                + ", copiasTotales=" + this.copiasTotales + ", copiasDisponibles=" + this.copiasDisponibles + "]";
    }



    //Añadir un objecto del tipo libro a un ArrayList

    public static void addLibro(ArrayList<Libro> lista) {
        Scanner teclat = new Scanner(System.in); // Crear un objeto Scanner para leer entrada del teclado
        Libro lib = new Libro(); // Crear un nuevo objeto de la clase Libro

        // Leer datos del libro y establecerlos en el objeto "lib"
        System.out.println("Introduce ISBN: ");
        lib.setISBN(teclat.nextInt()); // Leer y establecer el ISBN
        teclat.nextLine();// Consumir el salto de línea que queda pendiente después de `nextInt()`

        System.out.println("Introduce Autor: ");
        lib.setAutor(teclat.nextLine()); // Leer y establecer el autor

        System.out.println("Introduce Titulo: ");
        lib.setTitulo(teclat.nextLine()); // Leer y establecer el título

        System.out.println("Introduce Editorial: ");
        lib.setEditorial(teclat.nextLine()); // Leer y establecer la editorial

        System.out.println("Introduce Copias Totales: ");
        lib.setCopiasTotales(teclat.nextInt()); // Leer y establecer el total de copias
        teclat.nextLine(); // Consumir el salto de línea que queda pendiente después de `nextInt()`

        System.out.println("Introduce Copias Disponibles: ");
        lib.setCopiasDisponibles(teclat.nextInt()); // Leer y establecer las copias disponibles
        teclat.nextLine(); // Consumir el salto de línea que queda pendiente después de `nextInt()`

        // Añadir el objeto "lib" a la lista
        lista.add(lib);
    }


}