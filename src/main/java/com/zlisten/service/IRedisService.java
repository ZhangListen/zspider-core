package com.zlisten.service;

import java.util.List;

/**
 * Created by ZListen on 17/7/28.
 */
public interface IRedisService {

     boolean set(String key, String value);

     String get(String key);

     boolean expire(String key,long expire);

     <T> boolean setList(String key ,List<T> list);

     <T> List<T> getList(String key,Class<T> clz);

     long lpush(String key,Object obj);

     long rpush(String key,Object obj);

     String lpop(String key);
}
