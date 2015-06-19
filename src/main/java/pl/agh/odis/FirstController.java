package pl.agh.odis;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/public/first/**")
@Controller
public class FirstController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(value="jeden", method = RequestMethod.GET)
     public String get(HttpServletRequest request, HttpServletResponse response) {
        return "public_index";
    }

    @RequestMapping
    public String index() {
        return "public/first/index";
    }
}
