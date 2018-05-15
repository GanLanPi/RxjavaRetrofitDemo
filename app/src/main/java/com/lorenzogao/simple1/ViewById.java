package com.lorenzogao.simple1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 作者：Lorenzo Gao
 * Date: 2018/5/14
 * Time: 14:32
 * 邮箱：2508719070@qq.com
 * Description:
 */


//上面有两个标识
@Target(ElementType.FIELD)   //target 放在哪里 哪里就可以使用 FIELD 代表了属性 METHOD 属性 TYPE 类上
//什么时候起作用 RUNTIME 运行时 程序运用的中   CLASS 编译时 打包    SOURCE（用的比较少） 编程阶段
@Retention(RetentionPolicy.RUNTIME)
public @interface ViewById {
    int value();
    //放两个参数
//int [] value();
}
