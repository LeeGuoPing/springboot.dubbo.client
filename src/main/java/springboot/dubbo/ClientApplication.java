package springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import springboot.dubbo.server.dubbo.impl.CityDubboConsumerService;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        CityDubboConsumerService cityCosumerService = run.getBean(CityDubboConsumerService.class);
        cityCosumerService.printCity();


    }
}






