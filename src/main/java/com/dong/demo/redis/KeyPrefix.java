package com.dong.demo.redis;

public interface KeyPrefix {

    int expireSeconds();

    String getPrefix();
}
