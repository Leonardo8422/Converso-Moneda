
public class Principal {
    public static void main(String[] args) {

        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = consulta.buscarMoneda("USD");
        System.out.println(moneda);
    }
}
