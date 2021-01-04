package com.zking.ssm.mapper;

import com.zking.ssm.model.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictMapper {
    int deleteByPrimaryKey(String dictId);

    /**
     * 新增信息
     * @param record
     * @return
     */
    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(String dictId);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);

    /**
     * 查询所有
     * @param dict
     * @return
     */
    List<Dict> listPermissionsByUserName(Dict dict);


}