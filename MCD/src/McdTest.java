import static org.junit.jupiter.api.Assertions.*;

class McdTest {

    @org.junit.jupiter.api.Test
    void setDividendo() {
        Mcd m2 = new Mcd();
        m2.setDividendo(16);
        assertEquals(16,m2.getDividendo());
    }

    @org.junit.jupiter.api.Test
    void Mcd() {
        Mcd m1 = new Mcd();
        m1.setDividendo(72);
        m1.setDivisor(16);
        assertEquals(8,m1.mcd(72,16));
    }

    @org.junit.jupiter.api.Test
    void setDivisor() {
        Mcd m2 = new Mcd();
        m2.setDivisor(8);
        assertEquals(16,m2.getDivisor());
    }
}