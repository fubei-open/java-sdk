package com.fshows.fubei.biz.agent.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 查询银行列表分支
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamBankBranches.java, v1.0 2019-06-28 10:21 John Exp$
 */
@SuppressWarnings("unused")
public class ParamBanks extends BaseBizContentModel {
    /**
     * 银行卡号
     */
    @JSONField(name = "bank_card")
    private String bankCard;

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }
}
