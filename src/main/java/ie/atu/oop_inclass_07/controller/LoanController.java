package ie.atu.oop_inclass_07.controller;

import ie.atu.oop_inclass_07.service.LoanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")

public class LoanController {
    private final LoanService service;


}
