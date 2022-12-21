package org.lwq.service.imp;

import org.apache.dubbo.config.annotation.DubboService;
import org.lwq.service.DemoService;

/**
 * @author Administrator
 */
@DubboService
public class DemoDubboServiceImpl implements DemoService {

    @Override
    public String demo() {
        System.out.println("Demo方法");
        return "demo方法";
    }
}
