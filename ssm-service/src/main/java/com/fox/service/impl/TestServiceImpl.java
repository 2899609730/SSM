package com.fox.service.impl;

import com.fox.dao.TestMapper;
import com.fox.domain.Test;
import com.fox.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> findAll() {
        return testMapper.findAllTest();
    }
}
