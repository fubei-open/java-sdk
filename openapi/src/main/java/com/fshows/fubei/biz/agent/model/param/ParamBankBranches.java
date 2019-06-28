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
public class ParamBankBranches extends BaseBizContentModel {
    /**
     * 城市代码
     * 代码详见：v2.0 银行区域编号列表
     * http://docs.51fubei.com/agent-api/other/bank_areas_v2.html
     */
    @JSONField(name = "city_code")
    private String cityCode;

    /**
     * 根据openapi.cate.base.banks接口返回的bank_name传值
     */
    @JSONField(name = "bank_name")
    private String bankName;

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
