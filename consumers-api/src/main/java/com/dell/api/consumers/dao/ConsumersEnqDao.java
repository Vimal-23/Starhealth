package com.dell.api.consumers.dao;

import com.dell.api.consumers.entity.Consumers;

import java.util.List;

public interface ConsumersEnqDao {
    List<Consumers> selectAllConsumers();
}
