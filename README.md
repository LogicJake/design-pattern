# design-pattern
动手实现设计模式
# [策略模式](https://github.com/LogicJake/design-pattern/tree/master/src/com/scy/strategy)   
策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。策略模式通常把一个系列的算法包装到一系列的策略类里面，作为一个抽象策略类的子类。用一句话来说，就是：“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。
## 优点： 
* 算法可以自由切换
* 避免使用多重条件判断
* 扩展性良好。

## 缺点：
* 策略类会增多
* 所有策略类都需要对外暴露

# [观察者模式](https://github.com/LogicJake/design-pattern/tree/master/src/com/scy/observer)
观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。
## 优点：
* 观察者和被观察者是抽象耦合的
* 建立一套触发机制。

## 缺点：
* 如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间
* 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃
* 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化

# [装饰器模式](https://github.com/LogicJake/design-pattern/tree/master/src/com/scy/decorator)
装饰器模式允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。  
## 优点：
* 装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能

## 缺点：
* 多层装饰比较复杂

# 工厂模式
* [简单工厂模式](https://github.com/LogicJake/design-pattern/tree/master/src/com/scy/factory/simplyFactor)
* [工厂方法模式](https://github.com/LogicJake/design-pattern/tree/master/src/com/scy/factory/factoryMethod)
* [抽象工厂模式](https://github.com/LogicJake/design-pattern/tree/master/src/com/scy/factory/abstractFactory)
