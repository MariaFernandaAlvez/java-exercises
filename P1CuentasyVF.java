//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class P1CuentasyVF {

    public static void main(String[] args) {

        String name = "Maria";
        System.out.println ("Hello " + name);

        // String = tipo de variable, name = nombre de variable y "Maria = valor de variable

        int a;
        int b = 2;
        a = 3;
        int addition = a + b;
        int subtract = a - b;
        int multiply = a * b;
        float split = (float) a / b;

        //float = para que de numeros con decimales

        System.out.println (addition);
        System.out.println (subtract);
        System.out.println (multiply);
        System.out.println (split);

        // sout = pega mismo codigo

        boolean weekend = true;
        boolean takesun = true;
        boolean weGoToTheBeach = weekend && takesun;
        System.out.println (weGoToTheBeach);

        // && = AND
        // true && true = true
        // true && false / false && true = false
        // false && false + false

        // || = OR
        // true || true = true
        // true || false = true
        // false || false = false

        String message = weekend ? "it's weekend" : "it's not the weekend";
        System.out.println (message);

        // Operador Ternario
        // 1. item logico, interrogacion
        // 2. valor verdadero
        // 3. valor falso
    }


}









