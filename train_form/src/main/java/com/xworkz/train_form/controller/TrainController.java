package com.xworkz.train_form.controller;

import com.xworkz.train_form.dto.TrainDto;
import com.xworkz.train_form.entity.TrainEntity;
import com.xworkz.train_form.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class TrainController {

    @Autowired
    TrainService trainService;

    @RequestMapping("bookTicket")
    public String booking(TrainDto trainDto){
        trainService.validDateAndSave(trainDto);
        return "Response.jsp";
    }

    @RequestMapping
    public String getDetails(Model model){
        List<TrainDto> dtoList = trainService.getAll();
        System.out.println(dtoList);
        model.addAttribute("list",dtoList);
        return "GetAllDetails.jsp";
    }

    @RequestMapping("remove")
    public RedirectView deleteData(@RequestParam("id") int id , HttpServletRequest request){
        trainService.removeData(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/getDetails");
        return redirectView;
    }
    @RequestMapping("editData")
    public String findData(@RequestParam("id") int id, Model model){
        TrainEntity trainBooking =trainService.findAll(id);
        model.addAttribute("value", trainBooking);
        return "Update.jsp";
    }
    @RequestMapping("updateTicket")
    public String updateData(TrainDto bookingDto){
        trainService.updateData(bookingDto);

        return "UpdateResponse.jsp";
    }



}
