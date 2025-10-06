public class ejercicio4 {
    //Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
    //Obtén la suma de todos ellos y la media.
        public static void main(String[] args) {
            int[] numeros = new int[100];
            int suma = 0;

            // Rellenar el array con los números del 1 al 100
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = i + 1;
                // Ir sumando cada número
                suma += numeros[i];
            }

            // Calcular la media
            double media = (double) suma / numeros.length;

            // Mostrar resultados
            System.out.println("La suma de los números introducidos del 1 al 100 es: " + suma);
            System.out.println("La media de los números introducidos del 1 al 100 es: " + media);
        }
    }



