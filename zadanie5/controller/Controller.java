package geekbrains_course.oop_course.Seminar5_oop.controller;

import java.util.List;

import geekbrains_course.oop_course.Seminar5_oop.model.User;
import geekbrains_course.oop_course.Seminar5_oop.service.DataService;

public class Controller {
    
    DataService service = new DataService();


    public void addUserList(User user){
        service.addUserList(user);        
    }

    public List<User> getUserList(String type){
        return service.getUserList(type);
    }
}