package com.courses.vesta;

//import com.courses.vesta.controller.crud.UserCrudControl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class AutosaloneApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AutosaloneApplication.class, args);

    }

    @RequestMapping("/welcomepage")
    public String showWelcomePage(){
        return "index.html";
    }
}
