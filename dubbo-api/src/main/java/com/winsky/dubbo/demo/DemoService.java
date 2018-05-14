package com.winsky.dubbo.demo;

import java.util.List;

/**
 * author: winsky
 * date: 2018/5/14
 * description:
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
