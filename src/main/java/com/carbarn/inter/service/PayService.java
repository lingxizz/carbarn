package com.carbarn.inter.service;

import com.carbarn.inter.pojo.pay.PayCallBackPOJO;
import com.carbarn.inter.utils.AjaxResult;

public interface PayService {

    AjaxResult preorder();

    String callback(PayCallBackPOJO payCallBackDTO);
}