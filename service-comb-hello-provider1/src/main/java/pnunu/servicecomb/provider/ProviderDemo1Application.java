package pnunu.servicecomb.provider;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: pnunu
 * @Date: 2019/10/10 17:19
 */
@SpringBootApplication
@EnableServiceComb
public class ProviderDemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDemo1Application.class, args);
    }
}

