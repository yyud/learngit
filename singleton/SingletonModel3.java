package com.issc.dw.singleton;

/**
 * @author yyud
 * @version V1.0
 * @Date 20:48 2018/4/12
 *  @Description:单例模式模型
 *          静态内部类：用静态内部类对单例进行包装
 *          优点：优雅解决线程安全和程序启动时耗费资源问题
 *          缺点：
 */
public class SingletonModel3 {
    private static class SingletonDemo{
        private static SingletonDemo singletonDemo = new SingletonDemo();
    }

    private SingletonModel3(){}

    public static SingletonDemo getSingletDemo(){
        return SingletonDemo.singletonDemo;
    }
}
