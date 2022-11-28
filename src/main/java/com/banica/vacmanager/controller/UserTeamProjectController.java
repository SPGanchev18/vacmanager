package com.banica.vacmanager.controllers;

import com.banica.vacmanager.dao.UserTeamProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserTeamProjectController {

    @Autowired
    UserTeamProjectRepository userTeamProjectRepository;


}