import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConvercionDeMonedas valor = new ConvercionDeMonedas();
        double cantidad;
        String monedaBase;
        String conversor;
        var salir = "Has decidido cerrar la sesión.....";

        var menu = """
                
               |*********************************************************|
               |                                                         |
               |    :::::> COVERSOR DE MONEDAS BIENVENIDO <::::          |
               |                                                         |              
               | ... Por favor, introduzca el valor y luego las divisas  |
               |     de origen y destino (USD, COP, BRL, )...................... |                                  
               |                                                         |
               |   >> Para salir del programa ingrese -1 en el monto <<  |
               |                                                         |
               |******************************************************** |
                
                """;

        try {
            while (true){
                System.out.println(menu);
                System.out.println("Digite el valor: ");
                cantidad = Double.parseDouble(scanner.nextLine());
                if (cantidad == -1){
                    System.out.println(salir);
                    return;
                }
                System.out.println("Especifique la moneda inicial: ");
                monedaBase = scanner.nextLine().toUpperCase().strip();

                System.out.print("Especifique la moneda final: ");
                conversor = scanner.nextLine().toUpperCase().strip();

                valor.valorAConvertir(cantidad,monedaBase, conversor);


            }

        }catch (Exception e) {
            System.out.println("Ingrese la moneda destino: " + e.getMessage());
        }
    }
}
