package com.fshows.fubei.biz.agent.enums;

/**
 * 上传图片类型
 *
 * @author John (linwei@fshows.com)
 * @version $Id ImageBusType.java, v1.0 2019-06-28 13:22 John Exp$
 */
@SuppressWarnings("unused")
public enum ImageBusType {
    /**
     * 银行卡
     */
    BANK_CARD("bank_card", "银行卡"),
    /**
     * 身份证
     */
    ID_CARD("id_card", "身份证"),
    /**
     * 营业执照/证明函
     */
    LICENSE("license", "营业执照/证明函"),
    /**
     * 门店
     */
    STORE("store", "门店"),
    /**
     * 其他
     */
    OTHER("other", "其他");

    ImageBusType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    /**
     * 名称
     */
    private String type;
    /**
     * 类型
     */
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return type;
    }
}
