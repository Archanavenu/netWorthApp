//package com.archana.demospringboot16thdec.controller;
//
//import com.archana.demospringboot16thdec.model.User;
//import com.archana.demospringboot16thdec.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@Controller
//public class HomeController {
//
//    @Autowired
//    UserService userService;
//
//    @RequestMapping("/welcome")
//    public ModelAndView welcome() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("mode", "MODE_HOME");
//        mv.setViewName("welcomepage");
//        return mv;
//    }
//
//    @RequestMapping("/register")
//    public ModelAndView registration() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("mode", "MODE_REGISTER");
//        mv.setViewName("welcomepage");
//        return mv;
//    }
//
//    @PostMapping("/save-user")
//    public ModelAndView createUser(@ModelAttribute User user, BindingResult bindingResult) {
//        ModelAndView mv = new ModelAndView();
//        System.out.println(user);
//        userService.CreateUser(user);
//        mv.addObject("mode", "MODE_HOME");
//        mv.setViewName("welcomepage");
//        return mv;
//    }
//
//    @GetMapping("/show-users")
//    public ModelAndView showall() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("users", userService.showAllUsers());
//        mv.addObject("mode", "ALL_USERS");
//        mv.setViewName("welcomepage");
//        return mv;
//    }
//
//
//    @PostMapping("/update-user")
//    public ModelAndView updateUser(@RequestParam int userid) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("users", userService.updateUser(userid, 20));
//        mv.addObject("mode", "MODE_UPDATE");
//        mv.setViewName("welcomepage");
//        return mv;
//    }
//
//    @RequestMapping("/delete-user")
//    public ModelAndView deleteUser(@RequestParam int userid) {
//        ModelAndView mv = new ModelAndView();
//        userService.deleteUserById(userid);
//        mv.addObject("users", userService.showAllUsers());
//        mv.addObject("mode", "ALL_USERS");
//        mv.setViewName("welcomepage");
//        return mv;
//    }
//
//    @RequestMapping("/login")
//    public ModelAndView loginUser() {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("mode", "MODE_LOGIN");
//        mv.setViewName("welcomepage");
//        return mv;
//    }
//
//    @RequestMapping("/login-user")
//    public ModelAndView loginUser(@ModelAttribute User user) {
//        ModelAndView mv = new ModelAndView();
//        if (userService.findByUserNameAndPassword(user.getUsername(), user.getPassword()) != null) {
//            mv.addObject("mode", "MODE_HOME");
//            mv.setViewName("welcomepage");
//            return mv;
//        } else {
//            mv.addObject("error", "Invalid Username or Password");
//            mv.addObject("mode", "MODE_LOGIN");
//            mv.setViewName("welcomepage");
//            return mv;
//
//        }
//    }
//
//
//    //       @ResponseBody // this helps to return the string as it is in the method without a jsp page
////        @RequestMapping("/homepage")
////        public String greeting(){
////            return "Hello";
////        }
//
//
////        @RequestMapping("/home") // this takes a parameter name and displays, jsp page is linked
////        public ModelAndView home(@RequestParam("name") String myName){
////            ModelAndView mv= new ModelAndView();
////            mv.addObject("name", myName); // this is the data which is called model , its key and value pair
////            mv.setViewName("home"); // this is the view name
////            return mv;
////        }
//
//}
//
