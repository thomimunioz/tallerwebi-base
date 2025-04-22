package com.tallerwebi.TDD;
import org.junit.jupiter.api.Test;
import org.hamcrest.core.IsEqual;
import org.hamcrest.text.IsEqualIgnoringCase;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ClasificadorDeTemperaturasTest {


    @Test
    void queLaClasificacionSeaFriaSiEsMenorOIgualACero(){
        ClasificadorDeTempraturas clasificador = new ClasificadorDeTemperaturas(temperatura);
        clasificador.setTemperatura = -3;
        assertEquals("CONGELANTE", clasificador.clasificarTemperatura(temperatura));
    }


}

