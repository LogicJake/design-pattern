# design-pattern
动手实现设计模式
# 策略模式   
策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。策略模式通常把一个系列的算法包装到一系列的策略类里面，作为一个抽象策略类的子类。用一句话来说，就是：“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。
## 优点： 
* 算法可以自由切换
* 避免使用多重条件判断
* 扩展性良好。

## 缺点：
* 策略类会增多
* 所有策略类都需要对外暴露
