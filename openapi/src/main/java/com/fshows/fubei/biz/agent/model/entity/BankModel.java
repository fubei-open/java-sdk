package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 开户行查询结果
 *
 * @author John (linwei@fshows.com)
 * @version $Id BankModel.java, v1.0 2019-06-28 10:27 John Exp$
 */
@SuppressWarnings("unused")
public class BankModel implements BaseModel {
    /**
     * 校验结果
     */
    @JSONField(name = "legal_flag")
    private boolean legalFlag;

    /**
     * 返回信息
     */
    @JSONField(name = "message")
    private String message;

    /**
     * 卡bin表主键Id
     */
    @JSONField(name = "bank_id")
    private Integer bankId;

    /**
     * 银行名称
     */
    @JSONField(name = "bank_name")
    private String bankName;

    /**
     * 银行代码
     */
    @JSONField(name = "bank_code")
    private String bankCode;

    public boolean isLegalFlag() {
        return legalFlag;
    }

    public void setLegalFlag(boolean legalFlag) {
        this.legalFlag = legalFlag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
