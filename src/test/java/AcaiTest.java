import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcaiTest {

    @Test
    void deveRetornarCustoAcaiPuro(){
        Acai acai = new AcaiPuro();
        assertEquals(10.0f, acai.getCusto());

    }

    @Test
    void deveRetornarCustoAcaiComFruta(){
        Acai acai = new Fruta(new AcaiPuro(), "banana");
        assertEquals(12.0f, acai.getCusto());
    }

    @Test
    void deveRetornarCustoAcaiComFrutaEComplementoBasico(){
        Acai acai = new ComplementoBasico(new Fruta( new AcaiPuro(), "morango"), "ninho");
        assertEquals(13.5f, acai.getCusto());
    }

    @Test
    void deveRetornarCustoAcaiComFrutaEComplementoBasicoEPremium(){
        Acai acai = new ComplementoPremium(new ComplementoBasico(new Fruta( new AcaiPuro(), "morango"), "ninho"), "bombom");
        assertEquals(18.5f, acai.getCusto());
    }

}