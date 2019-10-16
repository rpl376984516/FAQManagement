package com.t87.FAQManagement.controller;

import com.t87.FAQManagement.pojo.Classes;
import com.t87.FAQManagement.pojo.Faqs;
import com.t87.FAQManagement.service.ClassesService;
import com.t87.FAQManagement.service.FaqsService;
import com.t87.FAQManagement.tools.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 常见问题
 */
@Controller
public class FaqsController {

    @Resource
    private FaqsService faqsService;
    @Resource
    private ClassesService classesService;

    /**
     * 分页查询常见问题并按时间降序排列
     */
    @RequestMapping(value = "/faqsList")
    public String faqsList(Model model,
                           @RequestParam(value = "pageIndex",required =false)Integer pageIndex){

        //页大小
        int pageSize=4;
        //当前页
        int currentlyPage=1;
        if (pageIndex!=null){
            currentlyPage=pageIndex;
        }
        //总记录数
        int sum=faqsService.count();

        //分页javaBean
        PageSupport support=new PageSupport();
        support.setCurrentPageNo(currentlyPage);
        support.setPageSize(pageSize);
        support.setTotalCount(sum);
        //分页查询
        List<Faqs> faqsList=faqsService.faqsList(currentlyPage,pageSize);
        model.addAttribute("faqsList",faqsList);
        model.addAttribute("page",support);
        return "faqslist";
    }

    /**
     * 删除常见问题
     */
    @RequestMapping(value = "/deleteFaqs")
    public String deleteFaqs(@RequestParam("id")Integer id){
        faqsService.deleteFaqs(id);
        return "redirect:faqsList";
    }

    /**
     * 跳转到 添加常见问题
     */
    @RequestMapping("/faqsadd")
    public String faqsadd(@RequestParam(value = "flag",required =false)String flag,
                          @ModelAttribute("Faqs")Faqs faqs, Model model,
                          HttpServletRequest request){
        //所有分类
        List<Classes> classes=classesService.ClassesList();
        model.addAttribute("classes",classes);
        request.setAttribute("flag",flag);
        return "faqsadd";
    }

    /**
     * 保存添加常见问题
     */
    @RequestMapping("/saveFaqs")
    public String saveFaqs(Faqs faqs){
        //创建时间
        faqs.setCreatedate(new Date());
        if(faqsService.addFaqs(faqs)){
            return "redirect:faqsList";
        }
        return "redirect:faqsadd?flag=sb";
    }

}
