package service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ReajusteTributavel extends Reajuste{

    BigDecimal valorImpostoDeRenda();
}
