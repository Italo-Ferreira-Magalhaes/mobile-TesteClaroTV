package br.com.italoferreira.TesteClaroTV_MOBILE;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class Screen {

    public Screen(AppiumDriver<RemoteWebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "android_field_first_number")
    @iOSFindBy(accessibility = "")
    private RemoteWebElement campoFirstNumber;

    @AndroidFindBy(id = "android_field_second_number")
    @iOSFindBy(accessibility = "")
    private RemoteWebElement campoSecondNumber;

    @AndroidFindBy(id = "android_button_sum")
    @iOSFindBy(accessibility = "")
    private RemoteWebElement botaoSoma;

    @AndroidFindBy(id = "android_button_sub")
    @iOSFindBy(accessibility = "")
    private RemoteWebElement botaoSubtracao;

    @AndroidFindBy(id = "android_button_mult")
    @iOSFindBy(accessibility = "")
    private RemoteWebElement botaoMultiplicacao;

    @AndroidFindBy(id = "android_button_div")
    @iOSFindBy(accessibility = "")
    private RemoteWebElement botaoDivisao;

    @AndroidFindBy(id = "android_result_text")
    @iOSFindBy(accessibility = "")
    private RemoteWebElement resultadoCalculo;

    public void realizarSoma(String num1, String num2) {
        campoFirstNumber.sendKeys(num1);
        campoSecondNumber.sendKeys(num2);
        botaoSoma.click();
    }

    public void validarSoma(String validarResultado) {
        String resultado = resultadoCalculo.getText();
        Assert.assertEquals(validarResultado, resultado);
    }

    public void realizarSubtracao(String num1, String num2) {
        campoFirstNumber.sendKeys(num1);
        campoSecondNumber.sendKeys(num2);
        botaoSubtracao.click();
    }

    public void validarSubtracao(String validarResultado) {
        String resultado = resultadoCalculo.getText();
        Assert.assertEquals(validarResultado, resultado);
    }

    public void realizarMultiplicacao(String num1, String num2) {
        campoFirstNumber.sendKeys(num1);
        campoSecondNumber.sendKeys(num2);
        botaoMultiplicacao.click();
    }

    public void validarMultiplicacao(String validarResultado) {
        String resultado = resultadoCalculo.getText();
        Assert.assertEquals(validarResultado, resultado);
    }

    public void realizarDivisao(String num1, String num2) {
        campoFirstNumber.sendKeys(num1);
        campoSecondNumber.sendKeys(num2);
        botaoDivisao.click();
    }

    public void validarDivisao(String validarResultado) {
        String resultado = resultadoCalculo.getText();
        Assert.assertEquals(validarResultado, resultado);
    }



}
