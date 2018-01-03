package HorasMinSeg;

import java.util.Scanner;

public class Hora {
    Scanner tc=new Scanner(System.in);

    public int validaTempo(int hora, int min, int seg){
        if (hora<0||hora>23){
            do {
                System.out.println("Hora invalida");
                System.out.println("Digite um tempo valido: ");
                hora=tc.nextInt();
            }while (hora<0||hora>23);
            return hora;
        }
        if (min<0||min>59){
            do {
                System.out.println("Minuto invalido");
                System.out.println("Digite um tempo valido: ");
                min=tc.nextInt();
            }while (min<0||min>59);
            return min;
        }
        if (seg<0||seg>59){
            do {
                System.out.println("Segundo invalido");
                System.out.println("Digite um tempo valido: ");
                seg=tc.nextInt();
            }while (seg<0||seg>59);
        }
        return seg;
    }
}
