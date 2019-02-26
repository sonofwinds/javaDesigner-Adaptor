# javaDesigner-Adaptor
适配器模式应用场景

 1 你想使用一个已经存在的类，而它的接口不符合你的需求(可以采用继承和对象组合方式)。 
 
 2 你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那些接口可能不一定兼容的类）协同工作（Spring MVC Adaptor就是为了解决这样的场景）。 
 
 3 （仅适用于组合方式）你想使用一些已经存在的子类，但是不可能对每一个都进行子类化以匹配它们的接口。对象适配器可以适配它的父类接口。即仅仅引入一个对象，并不需要额外的指针以间接取得被适配接口。
