public class P5VectoresArrays {

    public static void main(String[] args) {

        // 1. Puedo definir el rango de indices
        // Si tengo un rango de indices hasta n (5): el limite es n-1

//        int[] numeros = new int[5];
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println (numeros[i]);
//        }

//        String[] letras = new String[5];
//        letras[0] = "A";
//        letras[1] = "B";
//        letras[2] = "C";
//        letras[3] = "X";
//        letras[4] = "J";
//        for (int i = 0; i < letras.length; i++) {
//            System.out.println (letras[i]);
//        }

        // 2. No es necesario definir el rango de indices

//        String[] letras = {"A", "B", "C", "X", "J"};
//        for (int i=0; i < letras.length; i++) {
//            System.out.println (letras[i]);
//        }

//        System.out.println (Arrays.toString (letras));
//    }

            int[] numbers = { 9, 10, 12, 25, 2};
            int bigger = numbers[0];
            int smaller = numbers[0];
            float average = (float) 0;

            // average (media) = suma de todos los elementos dividido la cantidad de elementos

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > bigger) {
                    bigger = numbers[i];
                }
                if (numbers[i] < smaller) {
                    smaller = numbers[i];
                }
                average += numbers[i];
            }

            System.out.println ("Bigger: " + bigger);
            System.out.println ("Smaller: " + smaller);
            System.out.println ("Average: " + average/numbers.length);

    }
}
