import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);


        double nf;
        System.out.println("Introduce la nota de teoria");
        float nt= lector.nextFloat();
        System.out.println("Introduce la nota de trabajos");
        float ntr = lector.nextFloat();
        System.out.println("Introduce la nota practica");
        String np = lector.next();

        if (np.equals("NoApto")){
            nf = 4;
        }else{
            if( nt < 4.5){
                nf = nt;
            }else{
                nf = nt*0.8 + ntr*0.2 ;
            }
        }
        if(nf >= 10){
            System.out.println("Nota final: Matricula de honor");
        }else{
            System.out.println("Nota final, "+ nf);
        }
    }
}
