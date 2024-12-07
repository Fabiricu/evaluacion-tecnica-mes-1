package Evaluacion_TecnicaPIL;

class EvaluacionTecnicaPIL2 {

    public static void main(String[]args){
        // creacion e inicializacion de variables
        int numero = 5;
        int otroNumero = 9;
        int resultado = numero + otroNumero;

        //Comprobar si un numero es positivo(Primera condicion logica)

        if(resultado > 0){
            System.out.println("La suma de ambos numeros es :" + resultado + "el resultado es positivo");
        }else{
            System.out.println("El resultado no es correcto");
        }
        
          // b. Incrementar el valor hasta el doble

          int valorInicial = 2;
          System.out.println("Valor inicial a modificar por medio de una variable: " + valorInicial);
          while (valorInicial < valorInicial*2) {
                valorInicial++;

          }
          System.out.println("El valor final es: " + valorInicial);


          // c. Iteracion --> Realiza n cantidad de impresiones, siendo N un tercio del valor de la variable
        // del punto b
        int valorInicial2 = 13;
        int nImpresiones = valorInicial2 / 3;
        //System.out.println("El valor inicial  es: " + valorInicial);

        for (int n = 0; n < nImpresiones; n++){
            System.out.println("N impresiones");
        }

    }
}