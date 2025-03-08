package com.xworkz.user_form.cotroller;

import com.xworkz.user_form.dto.UserFormDto;
import com.xworkz.user_form.service.UserFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserFormController {
    @Autowired
    UserFormService userFormService;

    public UserFormController(){
        System.out.println("No-Args Const of UserFormController");
    }
    @PostMapping("userPage")
    public String getUserFrom(UserFormDto userFormDto, Model model){
        userFormService.validateSave(userFormDto);
        model.addAttribute("name",userFormDto.getFirstName());
        return "response.jsp";

    }

    @GetMapping("getAll")
    public String getAllDetails(Model model) {
        List<UserFormDto> dto = userFormService.getAll();
        System.out.println(dto);
        model.addAttribute("list", dto);
        return "getAllDetails.jsp";
    }
    @RequestMapping("deleteUser")
    public RedirectView deleteById(@RequestParam("id")String id, HttpServletRequest req){
            userFormService.deleteUserById(Integer.parseInt(id));
            RedirectView redirectView = new RedirectView();
            redirectView.setUrl(req.getContextPath()+"/getAll");
            return redirectView;
    }

    @RequestMapping("editUser")
    public String findById(@RequestParam("id")int id,Model model){
        UserFormDto userFormDto = userFormService.findById(id);
        System.out.println("controller :"+userFormDto);
        model.addAttribute("item",userFormDto);
        return "updatePage.jsp";
    }

    @RequestMapping("updateData")
    public String updateUser(UserFormDto userFormDto,Model model){
        userFormService.updateUser(userFormDto);
        model.addAttribute("name",userFormDto.getFirstName());
        return "updateResponse.jsp";
    }
}
