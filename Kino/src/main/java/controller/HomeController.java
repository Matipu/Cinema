/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Przemek
 */
@Controller
public class HomeController {

    protected Logger logger = Logger.getLogger(getClass());

    @RequestMapping("/") 
    public String home(Model model) {

        logger.debug("MyController.home()");
        return "index";
    }
}
