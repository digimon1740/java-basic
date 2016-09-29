package day6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 *  @Target에 들어가는 ElementType[]은 현재 어노테이션의 적용범위를 나타낸다
 *  
 *  @Retention은 현재 어노테이션의 유지 정책을 설정한다 
 *  보통은 RetentionPolicy.RUNTIME을 주로 사용
 * */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationName {
	String value(); // 기본 엘리먼트
	int elementName() default 5;
}
