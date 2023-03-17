package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithFields {

    private MyBean myBean;

    @Autowired
    public BeanWithFields(MyBean myBean) {
        this.myBean = myBean;
    }
}
