package com.issc.dw.singleton;

/**
 * @author yyud
 * @version V1.0
 * @Date 19:34 2018/4/12
 * @Description: 单例模式模型
 *          懒汉模式：第一次用到的时候才去创建
 *          优点：程序初始化快速
 *          缺点：线程不安全，在多线程情况下很可能就创建了多个实例
 *
 *
 */
public class SingletonModel {
    //为什么将属性声明为静态私有的？
    //私有：维护了类良好的封装性
    //静态：静态成员变量属于一个类所有，在类加载的时候就被声明定义并默认初始化为null，
    //      接着我们才能创建一个对象给我们的静态变量singletonModle
    private static SingletonModel singletonModel;

    /**
     * 外部不可见、不可调用故定义为private
     */
    private SingletonModel(){}

    public static SingletonModel getSingletonModel(){
        if(singletonModel==null){
            singletonModel = new SingletonModel();
        }
        return singletonModel;
    }
}

/**
 * 线程安全的懒汉模式
 *
 *   优点：简单直接解决了线程安全问题
 *
 *   缺点：方式不优雅。这种方式过于强硬不能权变，在大多数情况下非常消耗资源
 */
class SingletonModelTow{
    private static SingletonModelTow singletonModelTow;
    private SingletonModelTow(){}

    /*
    在方法中假如同步锁，限制在同一时刻访问此方法的线程只有一个
    直到该线程执行完此方法
     */
    public static synchronized SingletonModelTow getSingletonModel(){
        if(singletonModelTow==null){
            singletonModelTow = new SingletonModelTow();
        }
        return singletonModelTow;
    }
}


