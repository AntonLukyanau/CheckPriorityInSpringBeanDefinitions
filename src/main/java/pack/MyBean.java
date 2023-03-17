package pack;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyBean {
    private String field;
    private String secondValue;

    public MyBean() {
        field = "annotation";
    }

    public MyBean(String value) {
        field = value;
    }

    public MyBean(String value, String secondValue) {
        this.field = value;
        this.secondValue = secondValue;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "field='" + field + '\'' +
                '}';
    }
}
