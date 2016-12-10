package br.usp.icmc.teste;

import org.junit.*;

/*
 * Anotações com o JUnit
 *  
 * Referências
 * 
 * Exemplo tirado dos links:
 * https://www.mkyong.com/unittest/junit-4-tutorial-1-basic-usage/
 * http://www.vogella.com/tutorials/JUnit/article.html
 * 
 */ 

public class AnotacoesBasicasJUnit {

	 /*
	  * Este método é executado uma vez, antes do início de todos os testes. 
	  * Ele é usado para executar atividades intensivas em tempo, por exemplo, 
	  * para se conectar a um banco de dados. 
	  * Métodos marcados com esta anotação precisam ser definidos 
	  * como estáticos para trabalhar com JUnit.
	  * 
	  */
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }   

    /* 
     * Este método é executado antes de cada teste.
     * Ele é usado para preparar o ambiente de teste, por exemplo,
     * Pode ser usado para criar um objeto semelhante e compartilhando
     * para todos os @Test
     *  
     */
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }    

    // A anotação @Test identifica um método como um método de teste.
    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    // A anotação @Test identifica um método como um método de teste.
    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }
    
    /*
     *  Este método é executado após cada teste.
     *  Ele é usado para limpar o ambiente de teste 
     *  (por exemplo, excluir dados temporários)
     *   
     */
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
	
    /*
     * Este método é executado uma vez, 
     * depois de todos os testes terem sido concluídos. 
     * Ele é usado para executar atividades de limpeza, 
     * por exemplo, para desconectar de um banco de dados. 
     * Métodos anotados com esta anotação precisa ser definido 
     * como estático para trabalhar com JUnit.
     * 
     */
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }
    
}
