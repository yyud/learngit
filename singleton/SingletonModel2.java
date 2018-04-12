package com.issc.dw.singleton;

/**
 * @author yyud
 * @version V1.0
 * @Date 20:11 2018/4/12
 * @Description: 单例模式模型
 *
 *     饿汉模式：类加载时就初始化
 *     优点：优雅得解决了线程安全问题
 *     缺点：程序启动耗费更多资源
 */
public class SingletonModel2 {
    private static SingletonModel2 singletonModel2 = new SingletonModel2();
    private SingletonModel2(){}
    public static SingletonModel2 getSingletonModel2(){
        return singletonModel2;
    }
}
