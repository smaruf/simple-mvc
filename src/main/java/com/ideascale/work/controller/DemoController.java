package com.ideascale.work.controller;

import com.ideascale.work.dao.CommentDao;
import com.ideascale.work.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * User: nowshad
 * Date: 7/13/17
 * Time: 10:09 AM
 */
@Controller
@SessionAttributes("comment")
public class DemoController {
    @Autowired
    CommentDao commentDao;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String home(ModelMap modelMap) {
        System.out.println("go to");
        Comment commentSave = new Comment();
        commentSave.setText("Hi there");
        commentDao.save(commentSave);
        Comment commentGet = commentDao.findAll().stream().findAny().get();

        modelMap.addAttribute("comment", commentGet);
        return "home";
    }


    @RequestMapping(value = "/demo/die", method = RequestMethod.GET)
    public String die(ModelMap modelMap) {
        System.out.println("die");
        return "home";
    }
}
