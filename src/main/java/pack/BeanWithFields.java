package pack;

import org.springframework.context.annotation.Bean;

//@Component
public class BeanWithFields {

    private MyBean myBean;

    //@Autowired
    public BeanWithFields(MyBean myBean) {
        this.myBean = myBean;
    }

    @Bean
    public MyBeanImpl myBeanLightWeight() {
        return new MyBeanImpl("config light weight");
    }

}
