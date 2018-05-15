package com.lorenzogao.simple1;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

/**
 * 作者：Lorenzo Gao
 * Date: 2018/5/14
 * Time: 14:47
 * 邮箱：2508719070@qq.com
 * Description:
 */

public class ViewUtils {

    public static void inject(Activity activity) {

// 1.获取所有的属性
        Field[] fields = activity.getClass().getDeclaredFields();

        //2.过滤关于ViewById的属性
        for (Field field : fields) {
            ViewById viewById = field.getAnnotation(ViewById.class);
            if (viewById != null) {
                //3.findViewByID
                View view = activity.findViewById(viewById.value());
                //4.反射注入
                field.setAccessible(true);

                try {
                    //属性所在类 view代表属性的值
                    field.set(activity,view);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
