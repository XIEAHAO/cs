package com.zking.ssm.service;

import com.zking.ssm.model.Dict;

import java.util.List;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2021-01-02 18:49
 */
public interface IDict {
    /**
     * 查询所有
     * @param dict
     * @return
     */
    List querry (Dict dict);

    /**
     * 新增信息
     * @param record
     * @return
     */
    int insert(Dict record);

}
