import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Map;

public record Moneda(String result,
                     String target_code,
//                     Date time_last_update_utc,
                     String base_code, Map<String,
                     String> conversion_rates) {
}
