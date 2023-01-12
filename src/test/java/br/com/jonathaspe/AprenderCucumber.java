package br.com.jonathaspe;

import io.cucumber.java.en.*;

public class AprenderCucumber {
    @Given("que criei um arquivo corretamente")
    public void que_criei_um_arquivo_corretamente() {
        System.out.println("Passou aqui!");
    }
    @When("executá-lo")
    public void executá_lo() {
        System.out.println("Passou aqui também!");
    }
    @Then("a especificação deve finalizar com sucesso")
    public void a_especificação_deve_finalizar_com_sucesso() {
        System.out.println("E passou aqui também!");
    }
}
