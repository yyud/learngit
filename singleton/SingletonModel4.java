package com.issc.dw.singleton;

/**
 * @author yyud
 * @version V1.0
 * @Date 20:58 2018/4/12
 * @Description:单例模式
 *          枚举模式：
 *          优点：优雅解决线程序安全，耗费资源等问题还可自由序列化（反序列化会生成对象）
 *          缺点：
 */


public class SingletonModel4 {
    //定义枚举常量
    enum SingletonDemo{
        SINGLETON_DEMO;
        public void function(){
            System.out.println("Something");
        }
    }

    public static SingletonDemo getSingletonDemo(){
        return SingletonDemo.SINGLETON_DEMO;
    }
}
