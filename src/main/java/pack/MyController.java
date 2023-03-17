package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    private MyBean myBean;

    @Autowired
    public MyController(MyBean myBean) {
        this.myBean = myBean;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getInfo(Model model) {
        System.out.println(myBean);
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/show")
    public String getInfoOtherWay(Model model) {
        System.out.println(myBean);
        return "index";
    }

}
