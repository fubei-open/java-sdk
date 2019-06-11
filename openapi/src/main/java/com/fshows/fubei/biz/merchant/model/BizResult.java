package com.fshows.fubei.biz.merchant.model;

import com.fshows.fubei.biz.merchant.model.entity.PaymentQueryCashierModel;
import com.fshows.fubei.biz.merchant.model.entity.PaymentReconciliationOrderModel;
import com.fshows.fubei.biz.merchant.model.entity.PaymentStoreCategoryModel;
import com.fshows.fubei.biz.merchant.model.entity.PaymentStoreQueryModel;

import java.util.ArrayList;

/**
 * 业务返回数据包装
 * 不同接口数据返回结构较多
 *
 * @author John (linwei@fshows.com)
 * @version $Id BizResult.java, v1.0 2019-06-07 18:13 John Exp$
 */
public class BizResult {
    public static class StoreQuery extends ListWrappedModel<PaymentStoreQueryModel> {}

    public static class StoreCategory extends ArrayList<PaymentStoreCategoryModel> {}

    public static class PaymentOrderReconciliation extends ListWrappedModel<PaymentReconciliationOrderModel> {}

    public static class PaymentCashierQuery extends ListWrappedModel<PaymentQueryCashierModel> {}
}
