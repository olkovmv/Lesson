package lesson16.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassConfig {
    // в качестве парасетов можно использовать строки
    // примитивы, enum
    // Обязательно указать значение при использовании анотации
    String prefix();
    long version() default  1;




}
