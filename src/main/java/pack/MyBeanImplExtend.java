package pack;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MyBeanImplExtend extends MyBeanImpl {
    public MyBeanImplExtend() {
        super("extend");
    }
}
