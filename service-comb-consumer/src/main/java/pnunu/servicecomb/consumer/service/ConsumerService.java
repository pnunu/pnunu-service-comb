package pnunu.servicecomb.consumer.service;

import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Component;
import pnunu.servicecomb.api.PnunuServiceI;

/**
 * @Author: pnunu
 * @Date: 2019/10/10 9:26
 * @Description: TODO
 */
@Component
public class ConsumerService {
    /**
     * 从注册中心获取
     * 从APPLICATION_ID获取id；从service_description.name获取name
     * schemaId来自于服务提供者
     **/
    @RpcReference(microserviceName = "start.pnunu:PnunuProvider", schemaId = "pnunu")
    private PnunuServiceI pnunuServiceI;

    public String helloServiceComb() {
        String re = pnunuServiceI.helloServiceComb();
        System.out.println(re);
        return re;
    }
}
