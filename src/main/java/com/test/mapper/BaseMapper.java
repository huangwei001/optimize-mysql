package com.test.mapper;


public interface BaseMapper<T> {


    public void insert(T t);

    public void delete(T t);

    public void update(T t);
}
