package com.issc.dw.abstractfactory;

/**
 * @author yyud
 * @version V1.0
 * @Description: 产品接口
 * @Date 14:31 2018/4/16
 */
//产品类型1接口
public interface GoodsOne {
    public abstract void display();
}


//具体产品实现 1
class GoodsOne_one implements GoodsOne{
    @Override
    public void display() {
        System.out.println("产品类型1：第一个具体产品");
    }
}

//具体产品实现 2
class GoodsOne_tow implements GoodsOne{
    @Override
    public void display() {
        System.out.println("产品类型1：第二个具体产品");
    }
}