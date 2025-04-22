import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {

    @Test
    public void cpfCom11DigitosDeveRetornarTrue() {
        assertTrue(ValidadorCpf.validarTamanhoCpf("12345678901"));
    }

    @Test
    public void cpfComMenosDe11DigitosDeveRetornarFalse() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("12345678"));
    }

    @Test
    public void cpfComMaisDe11DigitosDeveRetornarFalse() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("123456789012"));
    }

    @Test
    public void cpfComLetrasDeveRetornarFalse() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("12345abc901"));
    }

    @Test
    public void cpfNuloDeveRetornarFalse() {
        assertFalse(ValidadorCpf.validarTamanhoCpf(null));
    }
}
