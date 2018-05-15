
### 1.反射
  概念:反射主要是指程序可以访问、检测和修改它本身状态或行为的一种能力。在计算机科学领域，反射是一类应用，它们能够自描述和自控制。这类应用通过某种机制来实现对自己行为的描述和检测，并能根据自身行为的状态和结果，调整或修改应用所描述行为的状态和相关的语义。
  个人总结:  做一些做不了的事情  一些不正规的手段  。 所有的功能都是基于我们的字节码（class） 一个类的class在内存中应该只有一份 而且class 其实也是一个对象

代码示例:
写一个测试的 TestBean.class
```
 public class TestBean {
 private TestBean() {

    }
}
```
在代码new 一个TestBean 是爆错的 因为已经私有化了
 ```
TestBean testBean=new TestBean()
```
然而你又非得用 那就的用反射了
```
  try {
            TestBean testBean=TestBean.class.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
```

 1.1 获取构造函数
``class.getDeclaredConstructor``
  1.2.获取方法
``class.getDeclaredMethod``
 执行方法
``invoke()``
  1.3.获取属性
``class.getDeclaredField``

### 2.注解
 只是一个标识、标记，没有具体功能逻辑代码

 ```
//上面有两个标识
@Target(ElementType.FIELD)   //target 放在哪里 哪里就可以使用 FIELD 代表了属性 METHOD 属性 TYPE 类上
//什么时候起作用 RUNTIME 运行时 程序运用的中   CLASS 编译时 打包    SOURCE（用的比较少） 编程阶段
@Retention(RetentionPolicy.RUNTIME)
public @interface ViewById {
    int value();//代表能不能放参数
//放两个参数
//int [] value();
}
```
使用
```
    @ViewById(R.id.tv)
    public  TextView tv;
```
### 3.泛型

类泛型   在任何地方出现的代表同一类型

方法泛型

泛型的上限

泛型的下限





