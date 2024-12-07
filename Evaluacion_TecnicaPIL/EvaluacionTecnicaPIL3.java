package Evaluacion_TecnicaPIL;

public class EvaluacionTecnicaPIL3 {
    public static void main(String[]args){
        // creacion e inicializacion de variables
        double nota = 60.5;

        // Comprobar mediante una nota, en que rango(regular, promocional, se encuentra el alumno)
        if (nota >= 40 && nota <= 60) {
            System.out.println("El alumno regularizo la materia ");
      }else{
            if(nota >= 65 && nota <= 70){
                System.out.println("El alumno tiene notas satisfactorias");
            }
            else{
                if (nota >= 75 && nota <= 100) {
                    System.out.println("El alumno esta promocionado");
                }
            }
      }{
        System.out.println("El alumno no cumple con los estandares y esta desaprobado");
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
