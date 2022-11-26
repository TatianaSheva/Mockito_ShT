package i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.*;

class LocalizationServiceImplTest {

    @Test
    //Тест для проверки возвращаемого текста (класс LocalizationServiceImpl)
    void testCorrectMessage() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        //Текст, который выводим, если страна локации - Россия
        String testText = "Добро пожаловать";
        //Тест текст = тексту, если страна - Россия
        Assertions.assertEquals(testText, localizationService.locale(Country.RUSSIA));
    }
}