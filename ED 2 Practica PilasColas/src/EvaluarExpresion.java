import java.util.Stack;

/**
 * @author Estructuras de Datos
 */

public class EvaluarExpresion {

    /**
     * Indicar estructura de datos utilizada, así como las razones que le han llevado a tomar la decisión */

    public static double calcularResultado(String expresion) {
        double resultado = 0;
        //TODO
        return resultado;
    }

     public static void main(String[] arg) {
        String s1 = "5 6 -";
        String s2 = "6 5 -";
        String s3 = "8 4 3 + 2 * -";
        String s4 = "6 2 + 8 3 - * 4 / 3 * 5 *";
        String s5 = "9 2 + 7 2 - * 2 /";
        System.out.println(s1 + " = " + calcularResultado(s1));
        System.out.println(s2 + " = " + calcularResultado(s2));
        System.out.println(s3 + " = " + calcularResultado(s3));
        System.out.println(s4 + " = " + calcularResultado(s4));
        System.out.println(s5 + " = " + calcularResultado(s5));
        System.out.println("expresion vacia = "+ calcularResultado(""));
    }

}
