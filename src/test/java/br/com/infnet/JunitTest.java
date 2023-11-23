package br.com.infnet;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.opentest4j.AssertionFailedError;

public class JunitTest {
    @Test
    public static void ErroTest() {
//     Nenhuma Excecao foi lancada entao o assertTheows falhou no Teste
        assertThrows(AssertionError.class,() -> assertEquals(1,1),
                "Esperado Erro pois nenhuma Excecao foi lancada");
    }
    @Test
    public static void NoErroTest(){
//        Uma Excecao foi lancado entao o assertThrows passou pelo Teste
        assertThrows(AssertionError.class,() -> assertEquals(1,0));
    }
}
