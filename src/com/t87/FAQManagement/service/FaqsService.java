package com.t87.FAQManagement.service;

import com.t87.FAQManagement.pojo.Faqs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 常见问题
 */
public interface FaqsService {

    /**
     * 总记录数
     */
    public int count();

    /**
     * 分页查询常见问题并按时间降序排列
     */
    public List<Faqs> faqsList(@Param("currentlyPage") Integer currentlyPage, @Param("pageSize") Integer pageSize);


    /**
     * 保存常见问题
     */
    public boolean addFaqs(Faqs faqs);


    /**
     * 删除常见问题
     */
    public boolean deleteFaqs(@Param("id") Integer id);


}
