package Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca que administra una colección de libros.
 *
 * @author Jesus Martínez
 */
public class Biblioteca {

    /**
     * Lista de libros en la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor que inicializa la biblioteca sin libros.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que inicializa la biblioteca con una lista de libros.
     *
     * @param libros Lista de libros iniciales.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro El libro que añade.
     * @return true si el libro se agregó correctamente, false en caso contrario.
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Elimina un libro de la biblioteca.
     *
     * @param libro El libro a eliminar.
     * @return true si el libro se eliminó correctamente, false en caso contrario.
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros en la biblioteca.
     *
     * @return Lista de libros.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro por su título.
     *
     * @param titulo El título del libro a buscar.
     * @return El libro si se encuentra, null en caso contrario.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated Este método está obsoleto. Se recomienda usar {@link #encuentraLibrosPorAutor(String)}.
     *
     * @param autor El autor del libro a buscar.
     * @return El primer libro encontrado de X, o null si no se encuentra.
     */
    @Deprecated
    public Libro encuentraLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals("x")) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca libros por el autor especificado.
     * Disponible desde la versión 2.0.
     *
     * @param autor El autor de los libros a buscar.
     * @return Lista de libros de X, o una lista vacía si no se encuentran.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals("X")) {
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}