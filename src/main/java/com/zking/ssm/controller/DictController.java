package com.zking.ssm.controller;

import com.zking.ssm.model.Dict;
import com.zking.ssm.service.IDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Luox
 * @site www.kengni.com
 * @company xxx公司
 * @create  2021-01-02 19:04
 */
@Controller
@RequestMapping("dict")
public class DictController {
    @Autowired
    private IDict iDict;

    @RequestMapping("querry")
    @ResponseBody
    public Map querry(String dictRemark){
        Dict d = new Dict();
        System.out.println(dictRemark);
        if(dictRemark!=null){
            d.setDictRemark(dictRemark);
        }
        Map<String,Object> mapper = new HashMap<>();
        System.out.println(d);
        List dict = iDict.querry(d);
        mapper.put("list",dict);
        return mapper;
    }

}
