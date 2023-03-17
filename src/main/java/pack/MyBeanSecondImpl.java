package pack;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@MySecondQualifier
//@Primary
public class MyBeanSecondImpl implements MyBean {

    private String field;

    public MyBeanSecondImpl() {
        field = "annotation 2";
    }

    public MyBeanSecondImpl(String value) {
        field = value;
    }

    @Override
    public String toString() {
        return "MyBeanSecondImpl{" +
                "field='" + field + '\'' +
                '}';
    }

}
