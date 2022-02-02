public class Mcd {
    private int divisor ;
    private int dividendo ;

    public void setDivisor(int divisor){
        this.divisor =  divisor;
    }
    public int getDividendo (){return dividendo;}
    public int getDivisor (){return divisor;}
    public void setDividendo (int dividendo){
        this.dividendo = dividendo;
    }
    // Algoritmo de Euclides
    public int mcd( int x, int y )
    {
        int a,b;

        a = x;
        b = y;
        while( a != b ) {
            if( a < b ) {
                b = b - a;
            } else {
                a = a - b;
            }
        }
        return(a);
    }
}

