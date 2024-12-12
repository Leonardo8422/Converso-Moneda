import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Map;

public class ConvercionDeMonedas {

    public  void cambioMoneda(double cantidad,
                              String base,
                              String conversor,
                              //Date fecha,
                              Map<String,String> moneda){
        LocalDate fecha = LocalDate.now();
        DecimalFormat formatoDecimal = new DecimalFormat("#.######");
        moneda.forEach((key, value)->{
            if (key.equals(conversor)){
                double tasaDeConvercion =Double.parseDouble(value);
                double resultado = tasaDeConvercion * cantidad;
                System.out.println("Fecha: " + fecha + " Valor ingresado: " + cantidad + " [" + base + "] Se ajusta al monto global de = " + formatoDecimal.format(resultado) + " [" + conversor + "]");
            }
        });
    }

    public void valorAConvertir(double cantidad,
                                String monedaBase,
                                String conversor){
        ConsultaMoneda consulta = new ConsultaMoneda();
        ConvercionDeMonedas convertirMoneda = new ConvercionDeMonedas();
        Moneda moneda = consulta.buscarMoneda(monedaBase);
        convertirMoneda.cambioMoneda(cantidad, monedaBase, conversor,moneda.conversion_rates());
    }
}
