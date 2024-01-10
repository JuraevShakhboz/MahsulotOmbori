package org.najot.controller;

import org.najot.service.MaxsulotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MaxsulotController {
    @Autowired
    private MaxsulotService maxsulotService;

    @RequestMapping("/maxsulotlar")
    public ModelAndView maxsulotList(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("maxsulot");
        mv.addObject("maxsulot", maxsulotService.getMaxsulotList());
        return mv;
    }

    @RequestMapping("/maxsulot/{id}")
    public ModelAndView maxsulot(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("maxsulot");
        mv.addObject("maxsulot", maxsulotService.getMaxsulotById(id));
        return mv;
    }

    @RequestMapping("/submitaddmaxsulot")
    public ModelAndView submitAddMaxsulot(@RequestParam("nomi") String nomi, @RequestParam("narxi") float narxi){
        maxsulotService.addMaxsulot(nomi, narxi);
        return maxsulotList();
    }

    @GetMapping("/addmaxsulot")
    public String addMaxsulot(){
        return "addmaxsulot";
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView deleteMaxsulot(@PathVariable("id") int id){
        maxsulotService.deleteMaxsulot(id);
        return maxsulotList();
    }

    @RequestMapping("/updatemaxsulot/{id}")
    public ModelAndView updateMaxsulot(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("updatemaxsulot");
        mv.addObject("maxsulot", maxsulotService.getMaxsulotById(id));
        return mv;
    }

    @RequestMapping("/submitupdatemaxsulot/{id}")
    public ModelAndView submitUpdateMaxsulot(@PathVariable("id") int id, @RequestParam("nomi") String nomi, @RequestParam("narxi") float narxi){
        maxsulotService.updateMaxsulot(id, nomi, narxi);
        return maxsulotList();
    }
}
