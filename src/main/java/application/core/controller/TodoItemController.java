package application.core.controller;

import application.core.model.TodoData;
import application.core.util.Mappings;
import application.core.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {

    // == model attributes ==
    @ModelAttribute
    public TodoData todoData(){
        return new TodoData();
    }

    // == handler methods ==
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }



}
