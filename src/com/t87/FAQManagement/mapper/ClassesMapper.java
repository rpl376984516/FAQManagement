package com.t87.FAQManagement.mapper;

import com.t87.FAQManagement.pojo.Classes;

import java.util.List;

/**
 * 类别信息
 */
public interface ClassesMapper {

    /**
     * 查询所有分类
     */
    public List<Classes> ClassesList();

}
