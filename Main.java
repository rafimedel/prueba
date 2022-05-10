public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        suma(a, b);



       }

        public static int suma(int a, int b){
        int resultado = a+b;
        System.out.println(resultado);
        return suma(a, resultado);



        }

    }





