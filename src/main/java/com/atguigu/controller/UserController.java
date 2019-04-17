package com.atguigu.controller;


import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value="CRUD",method=RequestMethod.GET)
    public ModelAndView crud() {
        ModelAndView mv = new ModelAndView("CRUD");
        return mv;
    }


    @RequestMapping(value = "select",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<User> queryById(@Param("id") Long id){
        try {
            User user = this.userService.queryByid(id);
            return ResponseEntity.status(HttpStatus.OK).body(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }


    @RequestMapping(value = "userlist", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<User>> queryAll(){

        try {
            List<User> user = this.userService.queryAll();
            return ResponseEntity.status(HttpStatus.OK).body(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    @RequestMapping(value = "name",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<User> queryByName(@RequestParam("username") String username
            ) {
        try {
            User name = this.userService.queryByName(username);
            return ResponseEntity.status(HttpStatus.OK).body(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteById(@RequestParam("id") Long id){
        try {
            this.userService.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public ResponseEntity<Void> addUser(User user){
        try {
            this.userService.addUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT)
    public ResponseEntity<Void> updateUser(User user){
        try {
            this.userService.updateUser(user);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

}
