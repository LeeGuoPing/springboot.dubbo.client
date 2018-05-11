package springboot.dubbo.server.dubbo.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import springboot.dubbo.server.domain.City;
import springboot.dubbo.server.dubbo.CityDubboService;

/**
 * 城市 Dubbo 服务消费者
 *
 * Created by bysocket on 28/02/2017.
 */
@Component
public class CityDubboConsumerService {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
