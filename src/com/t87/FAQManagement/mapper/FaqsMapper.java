package com.t87.FAQManagement.mapper;

import com.t87.FAQManagement.pojo.Faqs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 常见问题
 */
public interface FaqsMapper {

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
    public int addFaqs(Faqs faqs);


    /**
     * 删除常见问题
     */
    public int deleteFaqs(@Param("id") Integer id);


}
