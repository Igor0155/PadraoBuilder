package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PacienteBuilderTest {

    @Test
    void deveRetornarExcecaoParaPacienteSemProntuario() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setNome("Carlos Silva")
                    .setTipoSanguineo("O+")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de prontuário inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPacienteSemNome() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setNumeroProntuario(10542)
                    .setTipoSanguineo("O+")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPacienteValido() {
        PacienteBuilder pacienteBuilder = new PacienteBuilder();
        Paciente paciente = pacienteBuilder
                .setNumeroProntuario(10542)
                .setNome("Igor Gabriel")
                .setTipoSanguineo("A+")
                .setAlergias("Dipirona")
                .setContatoEmergencia("(32) 99999-9999")
                .build();

        assertNotNull(paciente);
        assertEquals(10542, paciente.getNumeroProntuario());
        assertEquals("Igor Gabriel", paciente.getNome());
        assertEquals("A+", paciente.getTipoSanguineo());
    }
}