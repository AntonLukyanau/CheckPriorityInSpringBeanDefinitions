package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.inject.Inject;

@Controller
public class MyController {
    //type > field name
    //type > qualifier
    //P.S.When type conflicts with qualifier then NoSuchBeanDefinitionException
    //type > primary
    //qualifier > field name
    //qualifier > primary
    //primary > field name
    //type > qualifier > primary > field name  for @Inject and @Autowired
    // subtype with qualifier > type of field
//    @Autowired
//    @MySecondQualifier
//    private MyBeanImpl myBeanImpl;

    // field name > primary
    // field name > qualifier
    // field name > type
    // qualifier > primary
    /*
    with field name > type
    private MyBeanSecondImpl myBeanImpl then we receive EXCEPTION:
        Caused by: org.springframework.beans.factory.BeanNotOfRequiredTypeException:
            Bean named 'myBeanImpl' is expected to be of type 'pack.MyBeanSecondImpl'
            but was actually of type 'pack.MyBeanImpl'
     */
    /*
    When type conflicts with qualifier then NoSuchBeanDefinitionException
     */
    // subtype with qualifier > type of field
    // field name > subtype with qualifier > primary on subclass > type of field
    @Resource
    private MyBeanSecondImpl MyBeanImpl;


    @RequestMapping(method = RequestMethod.GET)
    public String getInfo(Model model) {
        System.out.println();
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/show")
    public String getInfoOtherWay(Model model) {
        System.out.println();
        return "index";
    }

}
