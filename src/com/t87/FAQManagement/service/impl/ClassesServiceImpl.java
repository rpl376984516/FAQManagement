package com.t87.FAQManagement.service.impl;

import com.t87.FAQManagement.mapper.ClassesMapper;
import com.t87.FAQManagement.pojo.Classes;
import com.t87.FAQManagement.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类别信息
 */
@Service
public class ClassesServiceImpl implements ClassesService {

    @Resource
    private ClassesMapper classesMapper;

    /**
     * 查询所有分类
     */
    @Override
    public List<Classes> ClassesList() {
        return classesMapper.ClassesList();
    }

}
