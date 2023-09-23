package eci.railway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/julian")

public class NameController {


    @GetMapping()
    public String getName(){
        return "Julian David Castillo Soto";
    }
}
