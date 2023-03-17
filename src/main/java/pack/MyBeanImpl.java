package pack;

import org.springframework.stereotype.Component;

@Component
@MyFirstQualifier
public class MyBeanImpl implements MyBean {
    private String field;
    private String secondValue;

    public MyBeanImpl() {
        field = "annotation";
    }

    public MyBeanImpl(String value) {
        field = value;
    }

    @Override
    public String toString() {
        return "MyBeanImpl{" +
                "field='" + field + '\'' +
                '}';
    }
}
