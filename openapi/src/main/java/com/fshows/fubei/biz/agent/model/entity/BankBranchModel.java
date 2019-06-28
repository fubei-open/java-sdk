package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 支行代码Model
 *
 * @author John (linwei@fshows.com)
 * @version $Id BankBranchModel.java, v1.0 2019-06-28 10:17 John Exp$
 */
@SuppressWarnings("unused")
public class BankBranchModel implements BaseModel {
    /**
     * 大小额联行号
     */
    @JSONField(name = "unionpay_code")
    private String unionpayCode;

    /**
     * 支行名称
     */
    @JSONField(name = "branch_name")
    private String branchName;

    public String getUnionpayCode() {
        return unionpayCode;
    }

    public void setUnionpayCode(String unionpayCode) {
        this.unionpayCode = unionpayCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
