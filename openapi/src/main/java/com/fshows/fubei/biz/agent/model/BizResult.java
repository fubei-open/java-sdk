package com.fshows.fubei.biz.agent.model;

import com.fshows.fubei.biz.agent.model.entity.BankBranchModel;

import java.util.ArrayList;

/**
 * 业务返回数据包装
 * 不同接口数据返回结构较多
 *
 * @author John (linwei@fshows.com)
 * @version $Id BizResult.java, v1.0 2019-06-07 18:13 John Exp$
 */
public class BizResult {
    public static class BankBranches extends ArrayList<BankBranchModel> {}
}
