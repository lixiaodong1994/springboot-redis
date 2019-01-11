package com.dong.demo.redis;

/**
 * @ClassName BasePrefix
 * @Description
 * @Author admin
 * @Date 2019/1/11 15:18
 **/
public abstract class BasePrefix implements KeyPrefix {

    private int expireSeconds;
    private String prefix;

    public BasePrefix(String prefix) {
        this(0,prefix);
    }

    public BasePrefix(int expireSeconds, String prefix) {
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    @Override
    public int expireSeconds() {
        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        String clazzName = getClass().getSimpleName();
        return clazzName + ":" + prefix;
    }
}
