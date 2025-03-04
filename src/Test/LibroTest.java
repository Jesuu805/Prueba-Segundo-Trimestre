package Test;

import Main.Libro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void getTitulo() {
        Libro libro = new Libro("Java para principiantes", "Juan Pérez", 2020);
        assertEquals("Java para principiantes", libro.getTitulo(), "El título del libro debería ser 'Java para principiantes'.");
    }

    @Test
    void setTitulo() {
        Libro libro = new Libro("Java para principiantes", "Juan Pérez", 2020);
        libro.setTitulo("Aprendiendo Java");
        assertEquals("Aprendiendo Java", libro.getTitulo(), "El título debería haber sido actualizado a 'Aprendiendo Java'.");
    }

    @Test
    void getAutor() {
        Libro libro = new Libro("Java para principiantes", "Juan Pérez", 2020);
        assertEquals("Juan Pérez", libro.getAutor(), "El autor debería ser 'Juan Pérez'.");
    }

    @Test
    void setAutor() {
        Libro libro = new Libro("Java para principiantes", "Juan Pérez", 2020);
        libro.setAutor("Carlos García");
        assertEquals("Carlos García", libro.getAutor(), "El autor debería haber sido actualizado a 'Carlos García'.");
    }

    @Test
    void getAnioPublicacion() {
        Libro libro = new Libro("Java para principiantes", "Juan Pérez", 2020);
        assertEquals(2020, libro.getAnioPublicacion(), "El año de publicación debería ser 2020.");
    }

    @Test
    void setAnioPublicacion() {
        Libro libro = new Libro("Java para principiantes", "Juan Pérez", 2020);
        libro.setAnioPublicacion(2021);
        assertEquals(2021, libro.getAnioPublicacion(), "El año de publicación debería haber sido actualizado a 2021.");
    }
}
