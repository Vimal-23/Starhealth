package com.dell.api.consumers.controller;

import com.dell.api.consumers.entity.Consumers;
import com.dell.api.consumers.service.ConsumersEnqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/consumers")
public class ConsumersEnqController {

    @Autowired
    ConsumersEnqService consumersEnqService;

    @PostMapping("/getall")
    public List<Consumers> getAllConsumers()  {
        return consumersEnqService.selectAllConsumers();
    }
}
