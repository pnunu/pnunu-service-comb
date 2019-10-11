package pnunu.servicecomb.consumer;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: pnunu
 * @Date: 2019/10/10 16:57
 */
@SpringBootApplication
@EnableZuulProxy
@EnableServiceComb
public class ConsumerDemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemo1Application.class, args);
    }
}
