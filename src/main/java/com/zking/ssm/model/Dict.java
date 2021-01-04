package com.zking.ssm.model;

import lombok.ToString;

@ToString
public class Dict {
    private String dictId;

    private String dictCode;

    private String dictValue;

    private String dictType;

    private String dictRemark;

    public Dict(String dictId, String dictCode, String dictValue, String dictType, String dictRemark) {
        this.dictId = dictId;
        this.dictCode = dictCode;
        this.dictValue = dictValue;
        this.dictType = dictType;
        this.dictRemark = dictRemark;
    }

    public Dict() {
        super();
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictRemark() {
        return dictRemark;
    }

    public void setDictRemark(String dictRemark) {
        this.dictRemark = dictRemark;
    }
}