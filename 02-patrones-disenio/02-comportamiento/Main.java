import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    float resultado = 0;
    boolean salir = false;

    Scanner sc = new Scanner(System.in);
    Stack<Comando> pila = new Stack<>();

    while (!salir) {
      System.out.println("\nRESULTADO = " + resultado);
      System.out.println("a. Sumar");
      System.out.println("b. Restar");
      System.out.println("c. Multiplicar");
      System.out.println("d. Deshacer último cambio");
      System.out.println("e. Salir");

      String opcion = sc.nextLine();

      float entrada;

      switch (opcion) {
        case "a":
          System.out.println("Ingresa un número:");
          entrada = sc.nextFloat();
          Comando comando = new ComandoSumar(resultado, entrada);
          resultado = comando.ejecutar();
          pila.add(comando);
          break;

        case "b":
          System.out.println("Ingresa un número:");
          entrada = sc.nextFloat();
          Comando comando2 = new ComandoRestar(resultado, entrada);
          resultado = comando2.ejecutar();
          pila.add(comando2);
          break;

        case "c":
          System.out.println("Ingresa un número:");
          entrada = sc.nextFloat();
          Comando comando3 = new ComandoMultiplicar(resultado, entrada);
          resultado = comando3.ejecutar();
          pila.add(comando3);
          break;

        case "d":
          if (!pila.isEmpty()) {
            Comando ultimo = pila.pop();
            resultado = ultimo.deshacer();
          } else {
            System.out.println("No hay nada por deshacer");
          }
          break;

        case "e":
          salir = true;
          break;

        default:
          System.out.println("Opción inválida...");
      }
    }

    System.out.println("\nRESULTADO FINAL = " + resultado);
  }
}