package com.zking.ssm.service.Impl;

import com.zking.ssm.mapper.DictMapper;
import com.zking.ssm.model.Dict;
import com.zking.ssm.service.IDict;
import com.zking.ssm.service.IDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2021-01-02 18:55
 */
@Service
@Scope("prototype")
public class DictxImpl implements IDict {
    @Autowired
    private DictMapper dictMapper;


    @Override
    public List querry(Dict dict) {
        System.out.println(dict);
        return dictMapper.listPermissionsByUserName(dict);
    }

    @Override
    public int insert(Dict record) {
        return dictMapper.insert(record);
    }
}
