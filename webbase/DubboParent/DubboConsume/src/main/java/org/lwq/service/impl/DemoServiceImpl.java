package org.lwq.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.lwq.service.DemoDubboService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoDubboService {

    @DubboReference
    private DemoDubboService demoService;

    @Override
    public String consumeDemoService() {
        return demoService.consumeDemoService();
    }
}
