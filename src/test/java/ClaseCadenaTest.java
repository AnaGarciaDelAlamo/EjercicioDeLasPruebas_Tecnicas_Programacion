import static org.junit.jupiter.api.Assertions.*;

class ClaseCadenaTest {

    @org.junit.jupiter.api.Test
    void devuelveIniciales() {
        String iniciales = ClaseCadena.DevuelveIniciales("Juan Carlos");
        assertEquals("J.C.", iniciales);

        iniciales = ClaseCadena.DevuelveIniciales("Juan Carlos   ");
        assertEquals("J.C.", iniciales);

        iniciales = ClaseCadena.DevuelveIniciales("   Juan Carlos   ");
        assertEquals("J.C.", iniciales);

        iniciales = ClaseCadena.DevuelveIniciales("");
        assertEquals("", iniciales);

        iniciales = ClaseCadena.DevuelveIniciales(null);
        assertEquals("", iniciales);
    }

}