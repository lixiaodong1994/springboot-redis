package com.dong.demo.redis;

/**
 * @ClassName TestKey
 * @Description
 * @Author
 * @Date 2019/1/11 16:03
 **/

public class TestKey extends BasePrefix {

    private TestKey(int expireSeconds, String prefix) {
        super(expireSeconds,prefix);
    }

    public static TestKey keyList = new TestKey(600,"kl");

}
