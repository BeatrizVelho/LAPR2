package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author G01
 */
public class EventoTest {

    private Evento evento;

    public EventoTest() {
        this.evento = new Evento("titulo", "descricao", new Local("local"),
                new Data(2016, 6, 8), new Data(2016, 6, 20),
                new Data(2016, 7, 7), new Data(2016, 8, 1),
                new Data(2017, 6, 10));
    }

    /**
     * Teste dos metodos set e get do titulo, da classe Evento.
     */
    @Test
    public void testSetAndGetTitulo() {
        System.out.println("setAngetTitulo");
        Evento instance = this.evento;
        String expResult = "titulo";
        instance.setTitulo(expResult);
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da descricao, da classe Evento..
     */
    @Test
    public void testSetAndGetDescricao() {
        System.out.println("setAndGetDescricao");
        Evento instance = this.evento;
        String expResult = "descricao";
        instance.setDescricao(expResult);
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get do local, da classe Evento.
     */
    @Test
    public void testSetAndGetLocal() {
        System.out.println("setAndGetLocal");
        Evento instance = this.evento;
        Local expResult = new Local("isep");
        instance.setLocal(expResult);
        Local result = instance.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio, da classe Evento.
     */
    @Test
    public void testSetAndGetDataInicio() {
        System.out.println("setAndGetDataInicio");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataInicio(expResult);
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de fim, da classe Evento.
     */
    @Test
    public void testSetAndGetDataFim() {
        System.out.println("setAndGetDataFim");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataFim(expResult);
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio de submissao, da classe
     * Evento.
     */
    @Test
    public void testSetAndGetDataInicioSubmissao() {
        System.out.println("setAndGetDataInicioSubmissao");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataInicioSubmissao(expResult);
        Data result = instance.getDataInicioSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de fim de submissao, da classe Evento.
     */
    @Test
    public void testSetAndGetDataFimSubmissao() {
        System.out.println("setAndGetDataFimSubmissao");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataFimSubmissao(expResult);
        Data result = instance.getDataFimSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio de distribuicao, da classe
     * Evento.
     */
    @Test
    public void testSetAndGetDataInicioDistribuicao() {
        System.out.println("gsetAndGetDataInicioDistribuicao");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataInicioDistribuicao(expResult);
        Data result = instance.getDataInicioDistribuicao();
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do metodo setTitulo, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetTituloEmpty() {
        System.out.println("setTituloEmpty");
        String titulo = "";
        Evento instance = this.evento;
        instance.setTitulo(titulo);
    }

    /**
     * Teste do metodo setDescricao, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDescricaoEmpty() {
        System.out.println("setDescricaoEmpty");
        String descricao = "";
        Evento instance = this.evento;
        instance.setTitulo(descricao);
    }

    /**
     * Teste do método setDataInicio, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioNull() {
        System.out.println("setDataInicioNull");
        Data dataInicio = null;
        Evento instance = this.evento;
        instance.setDataInicio(dataInicio);
    }

    /**
     * Teste do método setDataFim, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimNull() {
        System.out.println("setDataFimNull");
        Data dataFim = null;
        Evento instance = this.evento;
        instance.setDataFim(dataFim);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioSubmissaoNull() {
        System.out.println("setDataInicioSubmissaoNull");
        Data dataInicioSubmissao = null;
        Evento instance = this.evento;
        instance.setDataInicioSubmissao(dataInicioSubmissao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataInicioSubmissaoDatePassed() {
        System.out.println("setDataInicioSubmissaoDatePassed");
        Data dataInicioSubmissao = new Data(1, 1, 1);
        Evento instance = this.evento;
        instance.setDataInicioSubmissao(dataInicioSubmissao);
    }

    /**
     * Teste do método setDataFimSubmissao, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimSubmissaoNull() {
        System.out.println("setDataFimSubmissaoNull");
        Data dataFimSubmissao = null;
        Evento instance = this.evento;
        instance.setDataFimSubmissao(dataFimSubmissao);
    }

    /**
     * Teste do método setDataFimSubmissao, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataFimSubmissaoDatePassed() {
        System.out.println("setDataFimSubmissaoDatePassed");
        Data dataFimSubmissao = new Data(2015, 6, 8);
        Evento instance = this.evento;
        instance.setDataFimSubmissao(dataFimSubmissao);
    }

    /**
     * Teste do método setDataInicioDistribuicao, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioDistribuicaoNull() {
        System.out.println("setDataInicioDistribuicaoNull");
        Data dataInicioDistribuicao = null;
        Evento instance = this.evento;
        instance.setDataInicioDistribuicao(dataInicioDistribuicao);
    }

    /**
     * Teste do método setDataInicioDistribuicao, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataInicioDistribuicaoDatePassed() {
        System.out.println("setDataInicioDistribuicaoDatePassed");
        Data dataInicioDistribuicao = new Data(2015, 6, 8);
        Evento instance = this.evento;
        instance.setDataInicioDistribuicao(dataInicioDistribuicao);
    }

    /**
     * Teste do método equals, da classe Evento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = this.evento;
        Evento instance = this.evento;
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe Evento.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new Evento("Sem titulo", "Sem descricao",
                new Local("local"),
                new Data(2016, 6, 8), new Data(2016, 6, 20),
                new Data(2016, 7, 7), new Data(2016, 8, 1),
                new Data(2017, 6, 10));
        Evento instance = this.evento;
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoOrganizador, da classe Evento.
     */
    @Test
    public void testNovoOrganizador() {
        System.out.println("novoOrganizador");
        Evento instance = this.evento;
        boolean expResult = true;
        boolean result = instance.novoOrganizador(new Utilizador("Bea",
                "1140587@isep.ipp.pt", "beatriz", "111"));
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoOrganizador, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNovoOrganizadorExists() {
        System.out.println("novoOrganizadorExists");
        Evento instance = this.evento;
        instance.novoOrganizador(new Utilizador(
                "Beatriz", "1140587@isep.ipp.pt", "bea", "1234"));
        instance.novoOrganizador(new Utilizador(
                "Beatriz", "1140587@isep.ipp.pt", "bea", "1234"));
    }

    /**
     * Teste do método validarEvento, da classe Evento.
     */
    @Test
    public void testValidarEvento() {
        System.out.println("validarEvento");
        Evento instance = this.evento;
        boolean expResult = true;
        boolean result = instance.validarEvento();
        assertEquals(expResult, result);
    }

}
