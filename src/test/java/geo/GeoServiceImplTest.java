package geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.*;


class GeoServiceImplTest {

    @Test
        //Тест для проверки определения локации по ip (класс GeoServiceImpl)
        // IP должно вернуть корректную локацию
    void testCorrectLocation() {
        GeoService geoService = new GeoServiceImpl();
        //Страна для теста = Россия
        Country testCountry = Country.RUSSIA;
        //Страна по полученному IP - Россия
        Country result = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        //Сравнение страны тестовой со страной, прлученной по IP
        Assertions.assertEquals(testCountry, result);
    }
}