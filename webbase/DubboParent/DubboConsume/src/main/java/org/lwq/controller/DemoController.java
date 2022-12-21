package org.lwq.controller;

import org.lwq.service.DemoDubboService;
import org.lwq.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @Autowired
    private DemoDubboService demoService;

    @ResponseBody
    @RequestMapping("/demo")
    public String demo(){
        return  demoService.consumeDemoService();
    }
}
