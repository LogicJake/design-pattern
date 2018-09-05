提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
## 优点：
* 客户端与子系统解耦
* 减少系统相互依赖
* 提高灵活性
* 提高了安全性
## 缺点：
* 不符合开闭原则，如果要改东西很麻烦
## OO原则
“最少知识”原则  
对于对象 O 中的一个方法 m ，m 方法仅能访问如下这些类型的对象：
* O 对象自身
* m 方法的参数对象
* 任何在 m 方法内创建的对象
* O 对象直接依赖的对象  
具体点儿就是，对象应尽可能地避免调用由另一个方法返回的对象的方法