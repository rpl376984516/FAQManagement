package com.t87.FAQManagement.service.impl;

import com.t87.FAQManagement.mapper.FaqsMapper;
import com.t87.FAQManagement.pojo.Faqs;
import com.t87.FAQManagement.service.FaqsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 常见问题
 */
@Service
public class FaqsServiceImpl implements FaqsService {

    @Resource
    private FaqsMapper faqsMapper;

    /**
     * 总记录数
     */
    @Override
    public int count() {
        return faqsMapper.count();
    }

    /**
     * 分页查询常见问题并按时间降序排列
     */
    @Override
    public List<Faqs> faqsList(Integer currentlyPage, Integer pageSize) {
        int currently = (currentlyPage - 1) * pageSize;
        return faqsMapper.faqsList(currently, pageSize);
    }

    /**
     * 保存常见问题
     */
    @Override
    public boolean addFaqs(Faqs faqs) {
        if(faqsMapper.addFaqs(faqs)>0){
            return true;
        }
        return false;
    }

    /**
     * 删除常见问题
     */
    @Override
    public boolean deleteFaqs(Integer id) {
        return faqsMapper.deleteFaqs(id)>0?true:false;
    }

}
