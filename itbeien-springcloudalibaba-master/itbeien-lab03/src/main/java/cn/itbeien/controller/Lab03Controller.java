package cn.itbeien.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author beien
 * @date 2024-04-13 16:56
 * Copyright© 2024 beien
 */
@RestController
public class Lab03Controller {

    /**
     * 用于消费预付卡交易系统卡消费功能
     * @return
     */
    @PostMapping("/api/card")
    public String callCard(){
        return "success";
    }
}
