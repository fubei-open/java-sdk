package com.fshows.fubei.biz.agent.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 商户结算卡信息修改请求参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamBankUpdate.java, v1.0 2019-07-02 09:31 John Exp$
 */
@SuppressWarnings("unused")
public class ParamBankUpdate extends BaseBizContentModel {

    /**
     * 付呗商户号
     */
    @JSONField(name = "merchant_id")
    private Integer merchantId;

    /**
     * 商户号
     */
    @JSONField(name = "merchant_code")
    private String merchantCode;

    /**
     * 银行卡号
     */
    @JSONField(name = "bank_card_no")
    private String bankCardNo;

    /**
     * 银行卡照片地址
     */
    @JSONField(name = "bank_card_image")
    private String bankCardImage;
    /**
     * 银行预留手机号
     */
    @JSONField(name = "bank_cell_phone")
    private String bankCellPhone;
    /**
     * 所属银行编码
     */
    @JSONField(name = "bank_code")
    private String bankCode;

    /**
     * 大小额联行号
     */
    @JSONField(name = "unionpay_code")
    private String unionpayCode;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankCardImage() {
        return bankCardImage;
    }

    public void setBankCardImage(String bankCardImage) {
        this.bankCardImage = bankCardImage;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getUnionpayCode() {
        return unionpayCode;
    }

    public void setUnionpayCode(String unionpayCode) {
        this.unionpayCode = unionpayCode;
    }

    /**
     * Getter method for property <tt>bankCellPhone</tt>.
     *
     * @return property value of bankCellPhone
     */
    public String getBankCellPhone() {
        return bankCellPhone;
    }

    /**
     * Setter method for property <tt>bankCellPhone</tt>.
     *
     * @param bankCellPhone value to be assigned to property bankCellPhone
     */
    public void setBankCellPhone(String bankCellPhone) {
        this.bankCellPhone = bankCellPhone;
    }
}
