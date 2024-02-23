package com.example.Assignment3JEvans;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author Justin Evans
 * 
 */
@Controller
@RequestMapping("/speedy")
public class MainController {


    /**
     * methods below call my html files, making them available at specific urls
     * 
     * @return json array
     */
    
    @GetMapping({"/index", "/", ""})
    public String getHome() {
        return "Homepage";
    }
    
        @GetMapping({"/cycling", "/racing"})
    public String getStreetRace() {
        return "Cycling";
    }
    
        @GetMapping({"/contact", "/contacts"})
    public String getContact() {
        return "ContactUs";
    }
    
}
