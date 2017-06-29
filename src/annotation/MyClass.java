package annotation;

import java.lang.annotation.Annotation;

/**
 * Created by Вадим on 08.05.2017.
 */
@MyAnno (name = "Hello",value = 10)
public class MyClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
 //       String name = myClass.getClass().getAnnotation(MyAnno.class).name();

        Annotation [] annotations = myClass.getClass().getAnnotations();
        for (Annotation annotation1 : annotations) {
            System.out.println(annotation1);
        }
    }
}
