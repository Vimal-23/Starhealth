package com.dell.api.consumers.service;


import com.dell.api.consumers.dao.ConsumersEnqDao;
import com.dell.api.consumers.entity.Consumers;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ConsumersEnqServiceImpl implements ConsumersEnqService {

    @Autowired
    ConsumersEnqDao dao;

    @Override
    public List<Consumers> selectAllConsumers() {
        return dao.selectAllConsumers();
    }


}
