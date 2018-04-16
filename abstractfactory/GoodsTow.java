package com.issc.dw.abstractfactory;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 14:42 2018/4/16
 */

//产品接口二
public interface GoodsTow {
    void displa();
}

//具体产品实现 1
class GoodsTow_one implements GoodsTow{

    @Override
    public void displa() {
        System.out.println("产品类型2：第一个具体产品");
    }
}

//具体产品实现 2
class GoodsTow_tow implements GoodsTow{

    @Override
    public void displa() {
        System.out.println("产品类型2：第二个具体产品");
    }
}