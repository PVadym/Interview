package annotation;

import java.lang.annotation.*;

/**
 * Created by Вадим on 08.05.2017.
 */
//@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.LOCAL_VARIABLE,ElementType.PACKAGE,ElementType.TYPE})
@Inherited
@Documented
public @interface MyAnno {
    String name() default "Test";
    int value() default  -1;
}
