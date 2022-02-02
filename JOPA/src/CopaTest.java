import static org.junit.jupiter.api.Assertions.*;

class CopaTest {

    @org.junit.jupiter.api.Test
    void getTipoLiquido() {
        Copa c= new Copa("zumo naranja",85.5 );
        assertEquals("zumo naranja", c.getTipoLiquido());
    }

    @org.junit.jupiter.api.Test
    void setTipoLiquido() {
        Copa c= new Copa("zumo naranja",85.5 );
        assertEquals("ron", c.getTipoLiquido());

    }

    @org.junit.jupiter.api.Test
    void getPorcentajeLlena() {
        Copa c= new Copa("zumo naranja",85.5 );
        assertEquals(85.05, c.getPorcentajeLlena());
    }

    @org.junit.jupiter.api.Test
    void setPorcentajeLlena() {
        Copa c= new Copa("zumo naranja",85.5 );
        assertEquals(85.5, c.getPorcentajeLlena());
    }
}