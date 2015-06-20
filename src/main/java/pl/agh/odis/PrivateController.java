package pl.agh.odis;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.agh.odis.domain.UserData;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/private/first/**")
@Controller
public class PrivateController {

    @RequestMapping(method = RequestMethod.POST, value = "submit")
    public ModelAndView post(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        UserData userData = new UserData();
        userData.setName(name);
        userData.setLastname(lastName);
        userData.persist();
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("users", UserData.findAllUserDatas());
        return modelAndView;
    }


    @RequestMapping(value="form", method = RequestMethod.GET)
    public String get(HttpServletRequest request, HttpServletResponse response) {
        return "form";
    }

    @RequestMapping
    public String index() {
        return "private_index";
    }
}
