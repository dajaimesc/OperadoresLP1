/*
 * Lenguajes de programación I
 * Facultad de Ingeniería
 * Universidad Autónoma de Campeche
 */
package operadoreslp1;

/**
 *
 * @author danieljaimes
 */
public class OperadoresLP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int primerOperando = 7;
        int segundoOperando = 3;
        int resultado = 0;
        double resultadoFloat = 0;

        // OPERADORES Suma
        resultado = primerOperando + segundoOperando;
        System.out.println("Suma = " + resultado);

        //Resta 
        resultado = primerOperando - segundoOperando;
        System.out.println("Resta = " + resultado);

        // Multiplicación
        resultado = primerOperando * segundoOperando;
        System.out.println("Multiplicación = " + resultado);

        // División
        resultado = primerOperando / segundoOperando;
        System.out.println("División = " + resultado);

        // División El cast es necesario para que muestre los decimales
        resultadoFloat = (float) primerOperando / segundoOperando;
        System.out.println("División con decimales = " + resultadoFloat);

        // Módulo
        // Es el residuo entero de la división resultado = primerOperando % segundoOperando;
        System.out.println("Mod = " + resultado);

        // Operador ternario
        int valor1 = 5;
        int valor2 = 10;

        // Operadores unarios
        ++valor2;
        System.out.println("valor2 = " + valor2);

        --valor2;
        System.out.println("valor2 = " + valor2);

        resultado = (valor1 < valor2) ? (valor1 + valor2) : (valor1 - valor2);
        System.out.println("resultado = " + resultado);

        // Operador != 
        int valor11 = 10;
        int valor22 = 20;
        int resultado1 = 0;

        resultado1 = (valor11 != valor22) ? 33 : 66;

        System.out.println("resultado = " + resultado1);

        int valor3 = 6;         // 00000110 = 6
        int valor4 = 0;
        int valor5 = 0;
        int valor6 = 1;         // 00000001 = 1
        int valor7 = 0;

        valor4 = valor3 << 1;   // 00001100 = 12     
        valor5 = valor3 >> 1;   // 00000011 = 3
        valor7 = ~valor6;       // 11111110 = NO

        System.out.println("valor4 = " + valor4);
        System.out.println("valor5 = " + valor5);
        System.out.println("valor7 = " + valor7);

        // Precedencia
        int valor = 5;
        int resultado3 = 0;

        resultado3 = 3 * 2 / 6 + 5 - 3 + ++valor - --valor;

        System.out.println("resultado = " + resultado3);

    }

}
