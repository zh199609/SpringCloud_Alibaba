package com.zl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName: CommonResult
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/18 22:23
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommonResult<T> {
    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public static CommonResult success(Object t) {
        return new CommonResult(200, "success", t);
    }

    public static CommonResult error() {
        return new CommonResult(404, "error", null);
    }
}
