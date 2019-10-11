package pnunu.servicecomb.provider.service;

import org.apache.servicecomb.provider.pojo.RpcSchema;
import pnunu.servicecomb.api.PnunuServiceI;

/**
 * @Author: pnunu
 * @Date: 2019/10/10 9:03
 */
@RpcSchema(schemaId = "pnunu")
public class ProviderService implements PnunuServiceI {

    @Override
    public String helloServiceComb() {
        System.out.println("1111111111111111");
        return "helloServiceComb";
    }
}
