import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;


final class TextAreaText {
  @BeforeEach
  void openTestPage() {
    browser = "chrome";
    Path sampleFile = Paths.get("src/test/java/resources/PageExample.html");
    Selenide.open(sampleFile.toUri().toString());
  }

  @Test
  void snapshotDoesNotReloadElements() {
    SelenideElement cryptoAddressInput = $(By.id("crypto-address"));
    String text = "12Nddmbe1SycQMnj3M6zjKR1iMEPCC3Ca";
    cryptoAddressInput.sendKeys(text);
  }

}
