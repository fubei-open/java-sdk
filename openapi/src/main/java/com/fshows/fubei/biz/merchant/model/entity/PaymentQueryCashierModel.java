package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 收银员ID查询接口返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentQueryCashierModel.java, v1.0 2019-06-11 00:54 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentQueryCashierModel implements BaseModel {
    /**
     * 收银员所属门店ID 多个用,相隔
     */
    @JSONField(name = "store_id")
    private String storeId;

    /**
     * 收银员ID
     */
    @JSONField(name = "cashier_id")
    private String cashierId;

    /**
     * 收银员姓名
     */
    @JSONField(name = "cashier_name")
    private String cashierName;

    /**
     * 收银员账号
     */
    @JSONField(name = "cashier_account")
    private String cashierAccount;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierAccount() {
        return cashierAccount;
    }

    public void setCashierAccount(String cashierAccount) {
        this.cashierAccount = cashierAccount;
    }
}
