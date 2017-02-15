package com.zuxia.util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * 实体映射类基本CRUD处理操作
 * Created by caitxj on 17-2-15.
 */
public class EntityManager<T,ID extends Serializable> {

    static Set<String> fieldTypes=new HashSet<>();
    static {
        fieldTypes.add("java.lang.Integer");
        fieldTypes.add("java.lang.String");
    }
    public  boolean save(T obj){
        StringBuilder sqlB=new StringBuilder("insert into "+obj.getClass().getSimpleName());
        StringBuilder sqlValue=new StringBuilder("");
        sqlB.append("(");
        Field[] field=obj.getClass().getDeclaredFields();
        Method[] methods=obj.getClass().getDeclaredMethods();
        for(Method method:methods){
            try {
               Object objs=method.invoke(obj);
               System.out.println(objs);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        for(Field field1:field){
            sqlB.append(field1.getName());
            sqlB.append(",");
            Type type=field1.getType();
            System.out.println(type.getTypeName());

//            sqlValue.append(field1.get);
        }
        sqlB.replace(sqlB.toString().lastIndexOf(","),sqlB.toString().lastIndexOf(",")+1,"");
        sqlB.append(")");
        return true;
    }

    public boolean delete(ID id){

        String deleteSql="delete from " ;

        return true;
    }




}
