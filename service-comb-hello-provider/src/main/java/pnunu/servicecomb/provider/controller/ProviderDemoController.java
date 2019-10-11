package pnunu.servicecomb.provider.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pnunu.servicecomb.api.PnunuServiceI;

import java.util.Date;

/**
 * @Author: pnunu
 * @Date: 2019/10/10 14:16
 */
@RequestMapping("/")
@RestSchema(schemaId = "pnunu-demo-provider")
public class ProviderDemoController implements PnunuServiceI {

    @Override
    @RequestMapping(value = "demo", method = RequestMethod.GET)
    public String helloServiceComb() {
        System.out.println("demo: " + new Date().toString());
        return "请求成功，返回名称：demo";
    }
}
