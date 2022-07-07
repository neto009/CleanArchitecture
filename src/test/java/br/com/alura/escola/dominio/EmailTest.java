package br.com.alura.escola.dominio;

import br.com.alura.escola.dominio.Aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailComEnderoInvalido(){
        assertThrows(IllegalArgumentException.class, ()-> new Email(null));
        assertThrows(IllegalArgumentException.class, ()-> new Email(""));
        assertThrows(IllegalArgumentException.class, ()-> new Email("E-mail invalido!"));
    }

    @Test
    void deveriaCriarEmailComEnderoValido(){
        Email email = new Email("solange_freitas01@gmail.com");
        assertEquals("solange_freitas01@gmail.com", email.getEndereco());
    }

}