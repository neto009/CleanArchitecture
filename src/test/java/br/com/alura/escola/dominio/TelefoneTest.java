package br.com.alura.escola.dominio;

import br.com.alura.escola.dominio.Aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
    }

}