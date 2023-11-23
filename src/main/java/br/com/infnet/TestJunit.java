package br.com.infnet;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.opentest4j.AssertionFailedError;

public class TestJunit {
    public static void main(String[] args) {
//        Uma Excecao foi lancado entao o assertThrows passou pelo Teste
     assertThrows(AssertionError.class,() -> assertEquals(1,0));
//     Nenhuma Excecao foi lancada entao o assertTheows falhou no Teste
     assertThrows(AssertionError.class,() -> assertEquals(1,1),
             "Esperado Erro pois nenhuma Excecao foi lancada");

    }
}
