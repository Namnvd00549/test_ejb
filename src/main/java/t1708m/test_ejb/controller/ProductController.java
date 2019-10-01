package t1708m.test_ejb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708m.test_ejb.entity.Product;
import t1708m.test_ejb.service.ProductService;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/detail")
    public String showStudentDetail(Model model, Authentication authentication){
        model.addAttribute("product", productService.finByprodID(authentication.getName()));
        return "detail";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String showLoginPage() {
        return "login";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String createAccount(Model model) {
        model.addAttribute("student", new Product());
        return "form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String storeAccount(@Valid Product student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        productService.register(student);
        return "redirect:/students/login";
    }
}
