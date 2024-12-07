package Evaluacion_TecnicaPIL;
public class EvaluacionTecnicaPIL{
    public static void main(String[] args){ 
        // creacion e inicializacion de variables
        //double numeroDecimal = 0.4;
        //boolean esCasado = true;
        
        

        
        // verificar que el numero es o no par
          int numeroEsPar = 7;
          if ((numeroEsPar % 2 == 0)) {
            System.out.println("El numero es par: " + (numeroEsPar/2));
          }else{
            System.out.println("Error: el numero ingresado no es par");
        }

        // b. Incrementar el valor hasta el doble

          int valorInicial = 2;
          System.out.println("Valor inicial a modificar por medio de una variable: " + valorInicial);
          while (valorInicial < valorInicial*2) {
                valorInicial++;
                System.out.println("El valor final es: " + valorInicial);
          }
          
        

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
