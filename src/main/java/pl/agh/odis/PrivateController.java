package pl.agh.odis;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/private/first/**")
@Controller
public class PrivateController {

    @RequestMapping(method = RequestMethod.POST, value = "submit")
    public String post(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        return "success";
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
