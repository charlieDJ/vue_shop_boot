package com.vivi.vue.shop.exception;

import lombok.Data;

/**
 * @author wangwei
 * 2021/2/8 21:31
 */
@Data
public class BizException extends RuntimeException {


    private int errCode;

    private String errMsg;

    public BizException() {
        super();
    }

    public BizException(CommonError commonError) {
        super(commonError.getErrMsg());
        this.errCode = commonError.getErrCode();
        this.errMsg = commonError.getErrMsg();
    }

    public BizException(CommonError commonError, String msg) {
        super(msg);
        this.errCode = commonError.getErrCode();
        this.errMsg = msg;
    }

    public BizException(int code, String msg) {
        super(msg);
        this.errCode = code;
        this.errMsg = msg;
    }
}
