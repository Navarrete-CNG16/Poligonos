package trabajo_poligonos;
import java.util.Scanner;
public class Trabajo_Poligonos {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
	double n,ta;
	int nn;
	System.out.println("Escribe el total de grados (multiplo de 180°) ");
	ta = S.nextDouble();
	n = (ta/180)+2;
	System.out.println(" "+n);	
	nn = (int) n;
	System.out.println("NUMERO DE LADOS "+nn);
	switch(nn){
            case 3:
		System.out.println("El poligono es un Triangulo.");
                break;
            case 4:
		System.out.println("El poligono es un Cuadrilatero.");
                break;
            case 5:
		System.out.println("El poligono es un Pentagono.");
                        break;
            case 6:
		System.out.println("El poligono es un Hexagono.");
                        break;
            case 7:
		System.out.println("El poligono es un Heptagono.");
                        break;
            case 8:
		System.out.println("El poligono es un Octagono.");
                        break;
            case 9:
		System.out.println("El poligono es un Eneágono.");
                        break;
            case 10:
		System.out.println("El poligono es un Decágono.");
                        break;
            case 11:
		System.out.println("El poligono es un Endecágono.");
                        break;
            case 12:
		System.out.println("El poligono es un Dodecágono.");
                        break;
            case 13:
		System.out.println("El poligono es un Tetradecágono.");
                        break;
            case 14:
		System.out.println("El poligono es un Cuadradecágono");
                        break;
            case 15:
		System.out.println("El poligono es un Pentedecágono.");
                        break;
		default:
		System.out.println("Se trata de un poligono de: "+nn+"lados");
        }
    }
}