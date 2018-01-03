package HorasMinSeg;

import java.util.Scanner;

public class TestaTempo {
    public static void main(String[] args) {
        Hora hora=new Hora();
        int h=0;
        int m=0;
        int s=0;
        Scanner tc=new Scanner(System.in);
        System.out.println("Digite as horas: ");
        h=tc.nextInt();
        if (h<0||h>23) {
            h = hora.validaTempo(h, m, s);
        }
        System.out.println("Digite os minutos:");
        m = tc.nextInt();
        if (m < 0||m > 58) {
            m = hora.validaTempo(h, m, s);
        }
        System.out.println("Digite os segundos");
        s = tc.nextInt();
        if (s < 0 || s > 58) {
            s = hora.validaTempo(h, m, s);
        }
        System.out.println("Hora " + h);
        System.out.println("Min " + m);
        System.out.println("Seg " + s);
    }
}