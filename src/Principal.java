import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConvercionDeMonedas valor = new ConvercionDeMonedas();
        double cantidad;
        String monedaBase;
        String conversor;
        var salir = "Elegiste salir del sistema.....";

        var menu = """
                
                *****************************************************
                
                :::::> COVERSOR DE MONEDAS BIENVENIDO <::::
                
                ||| Por favor ingresa el valor de dinero que deseas
                    covertir y despues moneda origen  y destino como
                    (ej. USD).                                      ||
                    
                   >> Para salir del programa ingrese -1 en el monto <<
                
                *******************************************************
                
                """;

        try {
            while (true){
                System.out.println(menu);
                System.out.println("Ingrese el monto: ");
                cantidad = Double.parseDouble(scanner.nextLine());
                if (cantidad == -1){
                    System.out.println(salir);
                    return;
                }
                System.out.println("Ingrese la monmeda de origen: ");
                monedaBase = scanner.nextLine().toUpperCase().strip();

                System.out.print("Ingrese la moneda destino: ");
                conversor = scanner.nextLine().toUpperCase().strip();

                valor.valorAConvertir(cantidad,monedaBase, conversor);


            }

        }catch (Exception e) {
            System.out.println("Ingrese la moneda destino: " + e.getMessage());
        }
    }
}
