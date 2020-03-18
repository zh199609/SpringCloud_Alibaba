package com.zl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class CommonResult<T> {
    private Integer code;

    private String message;

    private T t;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
