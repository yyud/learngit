package com.issc.dw.singleton;

/**
 * @author yyud
 * @version V1.0
 * @Date 21:08 2018/4/12
 * @Description:单例模式模型
 *          双重校验锁：
 *          优点：巧妙的利用同步块，即达到了线程安全又减少了同步锁带来的大部分性能问题。
 *          （此种方式只在第一次同步访问该方法时才会被同步锁限制）
 *          缺点：volatile 关键字能控制内存模型，在应用时可能会出现不可思议的bug
 */
public class SingletonModel5 {


    // volatile 关键字:
    // 保证了不同线程对这个变量进行操作时的可见性，
    // 即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的
    private volatile static SingletonModel5 singletonModel5 ;
    private SingletonModel5(){}

    public static SingletonModel5 getSingletonModel5(){
        //第一次校验是否存在
        if(singletonModel5 == null){
            synchronized (SingletonModel5.class){
                //第二次校验是否存在
                if(singletonModel5 == null){
                    singletonModel5 = new SingletonModel5();
                }
            }
        }
        return  singletonModel5;
    }
}
