package com.youlai.common.redis.distributeLock.lua.lock;

/**
 * @author: xiezhiyan
 * @createTime: 2022/02/23 20:43
 * @description: lua锁接口
 */
public interface ILuaBaseLock {

    /**
     * 获取锁
     * @param lock
     * @param lockProperties
     * @return String
     */
    String lock(String lock);



    /**
     * 解锁
     * @param lock
     * @param lockProperties
     * @return String
     */
    String unlock(String lock);
}
