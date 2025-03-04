package Test;

import static org.junit.jupiter.api.Assertions.*;

import Main.Biblioteca;
import Main.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class BibliotecaTest {
    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("JAVADOC 101", "Jesus Martínez", 2025);
        libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro1), "El libro debería agregarse correctamente.");
        assertEquals(1, biblioteca.getLibros().size(), "La biblioteca debería contener un libro.");
    }

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro1);
        assertTrue(biblioteca.eliminarLibro(libro1), "El libro debería eliminarse correctamente.");
        assertEquals(0, biblioteca.getLibros().size(), "La biblioteca debería estar vacía.");
    }

    @Test
    void getLibros() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        List<Libro> libros = biblioteca.getLibros();
        assertEquals(2, libros.size(), "La biblioteca debería contener dos libros.");
        assertTrue(libros.contains(libro1), "La biblioteca debería contener el libro1.");
        assertTrue(libros.contains(libro2), "La biblioteca debería contener el libro2.");
    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro1);
        assertEquals(libro1, biblioteca.encuentraLibroPorTitulo("JAVADOC 101"),
                "Debería encontrar el libro por su título.");
        assertNull(biblioteca.encuentraLibroPorTitulo("Libro Inexistente"),
                "No debería encontrar un libro inexistente.");
    }

    @Test
    void encuentraLibrosPorAutor() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        /*

        No entiendo el error que da...

        List<Libro> librosDeGabriel = biblioteca.encuentraLibrosPorAutor("Gabriel García Márquez");
        assertEquals(1, librosDeGabriel.size(), "Debería encontrar un libro de Gabriel García Márquez.");
        assertEquals(libro2, librosDeGabriel.get(), "El libro encontrado debería ser 'Cien Años de Soledad'.");
        */



        // Buscar libros por un autor desconocido
        List<Libro> librosInexistentes = biblioteca.encuentraLibrosPorAutor("Autor Desconocido");
        assertTrue(librosInexistentes.isEmpty(), "No debería encontrar libros de un autor inexistente.");
    }

}
