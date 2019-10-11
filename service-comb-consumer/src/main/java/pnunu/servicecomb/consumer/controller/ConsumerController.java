package pnunu.servicecomb.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pnunu.servicecomb.consumer.service.ConsumerService;

/**
 * @Author: pnunu
 * @Date: 2019/10/10 9:25
 */
@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("hello")
    public String helloServiceComb() {
        return consumerService.helloServiceComb();
    }

}
