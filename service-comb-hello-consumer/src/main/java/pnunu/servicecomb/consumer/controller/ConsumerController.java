package pnunu.servicecomb.consumer.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import pnunu.servicecomb.consumer.service.ConsumerService;

/**
 * @Author: pnunu
 * @Date: 2019/10/10 14:34
 */
@RequestMapping("/")
@RestSchema(schemaId = "pnunu-demo-consumer")
public class ConsumerController {
    /* 定义远程访问的RestTemplate */
    private final RestTemplate restTemplate = RestTemplateBuilder.create();

    @GetMapping("demo")
    public String demo(String name) {
        //service url is : cse://serviceName/operation
        // provider是 serviceprovider项目中的microservice.yaml 里面的name 微服务名称
        String serviceName = "DemoProvider";
        String result = restTemplate.getForObject("cse://" + serviceName + "/demo?name=" + name, String.class);
        System.out.println(result);
        return result;
    }

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("hello")
    public String hello() {
        String result = consumerService.helloServiceComb();
        System.out.println(result);
        return result;
    }
}
