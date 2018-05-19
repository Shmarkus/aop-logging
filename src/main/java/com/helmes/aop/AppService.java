package com.helmes.aop;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    public void longRunningService() {
        for (int i = 0; i < 1000000; i++) {
            System.out.print('.');
        }
    }
}
