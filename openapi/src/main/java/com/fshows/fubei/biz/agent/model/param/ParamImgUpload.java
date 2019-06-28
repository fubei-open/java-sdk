package com.fshows.fubei.biz.agent.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.biz.agent.enums.ImageBusType;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 上传图片请求
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamImgUpload.java, v1.0 2019-06-28 13:22 John Exp$
 */
@SuppressWarnings("unused")
public class ParamImgUpload extends BaseBizContentModel {
    /**
     * 图片类型
     * "bankCard" 银行卡
     * "idCard" 身份证
     * "license" 营业执照/证明函
     * "store" 门店
     * "other" 其他
     */
    @JSONField(name = "bus_type")
    private ImageBusType busType;

    /**
     * 图片Base64编码
     */
    @JSONField(name = "file_data")
    private String fileData;

    public ImageBusType getBusType() {
        return busType;
    }

    public void setBusType(ImageBusType busType) {
        this.busType = busType;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }
}
