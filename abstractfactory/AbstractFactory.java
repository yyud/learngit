package com.issc.dw.abstractfactory;

/**
 * @author yyud
 * @version V1.0
 * @Description:  抽象工厂：将产品生产方法抽象化，让具体工厂按需求具体实现，
 *                            从而使得工厂生产产品更加多样化
 *
 *              优点：1）具有工厂方法模式解耦的优点
 *                    2）工厂模式针对的是一个产品等级结构，抽象工厂模式针对的是面向多个产品等级结构的。
 *                      最主要的是可以在类内部对产品族的关联关系进行定义和描述。从而对产品进行多样化生产
 *
 *              缺点：1）产品族的扩展将是一件十分费力的事情，
 *                       假如产品族中需要增加一个新的产品，则几乎所有的工厂类都需要进行修改。
 *                    2）在具体工厂类的方法中，对于同一产品族里的产品，只能使用其中一个。
 *
 *
 * @Date 14:46 2018/4/16
 */

//抽象工厂接口
//抽象工厂接口----生产不同产品工厂的公共接口
public interface AbstractFactory {
    public GoodsOne produce1();  //产品1 的生产
    public GoodsTow produce2();  //产品2 的生产

    // add more goods....
}

//具体工厂实现 1
class AbstractFactory_one implements AbstractFactory{

    @Override
    public GoodsOne produce1() {
        System.out.println("具体工厂实现1");
        return new GoodsOne_one();
    }

    @Override
    public GoodsTow produce2() {
        System.out.println("具体工厂实现1");
        return new GoodsTow_one();
    }
}

//具体工厂实现 2
class AbstractFactory_tow implements AbstractFactory{

    @Override
    public GoodsOne produce1() {
        System.out.println("具体工厂实现2");
        return new GoodsOne_tow();
    }

    @Override
    public GoodsTow produce2() {
        System.out.println("具体工厂实现2");
        return new GoodsTow_tow();
    }
}
