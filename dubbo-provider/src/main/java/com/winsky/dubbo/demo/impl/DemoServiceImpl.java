package com.winsky.dubbo.demo.impl;

import com.winsky.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * author: winsky
 * date: 2018/5/14
 * description:
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
