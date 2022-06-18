package com.sistemabancario.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.common.NoopProcessorErrorHandler.instance;

public class ContaTest {

    @Test
    void testAddMovimentacao() {
        //TODO: Você precisa implementar este teste
    }

    @Test
    void testSetNumeroValido() {
        final Conta instance = new Conta();
        final String esperado = "12345-6";
        instance.setNumero(esperado);
        final String obtido = instance.getNumero();
        assertEquals(esperado, obtido);
    }
@Test
void testeSetNumeroInvalidoExcecao(){
final Conta instance = new Conta();
final String invalido = "123";
assertThrows(IllegalArgumentException.class, () -> instance.setNumero(invalido));

}
@Test
void testeSetNumeroInvalidoNaoArmazena(){
final Conta instance = new Conta();
final String invalido = "123";
assertThrows(IllegalArgumentException.class, () -> instance.setNumero(invalido));
final String obtido = instance.getNumero();
assertEquals(invalido, obtido);
}

@Test
void  testInstanciaPadraoPoupanca(){
assertFalse(instance.isPoupanca());
}

@Test
void testSetLimiteContaEspecial(){
final Conta instance = new Conta();
instance.setEspecial(true);
final double esperado = 1000;
instance.setLimite(esperado);
final double obtido = instance.getLimite();
assertEquals(esperado, obtido);
}

@Test
void testSetLimiteContNaoEspecial(){
final Conta instance = new Conta();
final double limite = 1000;
assertThrows(IllegalArgumentException.class, () -> instance.setLimite(limite));

}
@Test
void testHistoricoNotNull(){
final Conta instance =  new Conta();
assertNotNull(instance.getMovimentacoes());

}







}
