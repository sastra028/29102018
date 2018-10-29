package APITest.controller;


import APITest.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@RequestMapping("/home")
public class APITestController {

    @Autowired
    private ApiService apiService;
    @GetMapping(value = "/EndPoint")
    public String helloApi(){
        return apiService.getDataFromTableA1All();
    }
//@GetMapping
//public String home(Model model) {
//    return "forward:/index.html";
//}
}
