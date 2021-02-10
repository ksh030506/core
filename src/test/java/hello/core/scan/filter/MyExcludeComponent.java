package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 어디에 붙나라는 것을 지정 => 클래스 레벨에 사용된다
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {



}
