package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;
import com.imooc.collection.Course;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TestGenerator;

/**
 * Created by zishaofei on 2017/8/24.
 */
public class testGeneric {
    public List<Course> course;

    /**
     * 实例化
     */
    public testGeneric(){
        this.course=new ArrayList<Course>();
    }

    /**
     * 添加
     * @param agrs
     */
    public void add(){
        Course cr1 = new Course("1","语文");
        course.add(cr1);
        Course cr2 = new Course("2","java");
        course.add(cr2);

    }

    /**
     * 测试循环
     * @param agrs
     */
    public void testForEach(){
        for(Course cr:course){
            System.out.print(cr.id+cr.name+"\n");
        }
    }

    /**
     * 泛型集合可以添加泛型的子类型的对象实例
     * @param agrs
     */
    public void TestChild(){
        ChildCourse ccr = new ChildCourse();
        ccr.id="3";
        ccr.name="C#";
        course.add(ccr);
    }
    public static void main(String[] agrs){
        testGeneric tg =new testGeneric();
        tg.add();
        tg.TestChild();
        tg.testForEach();
    }
}
