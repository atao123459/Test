package com.even.wj.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * result类主要是为了构造response响应
 */
@Data
@AllArgsConstructor
public class Result {
    private int code;//响应码，200为正常，400为异常


}
