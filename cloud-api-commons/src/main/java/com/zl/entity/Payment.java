package com.zl.entity;

import java.io.Serializable;

/**
 * @ClassName: Payment
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/18 22:21
 * @Version: 1.0
 **/
public class Payment implements Serializable {
    private Integer id;
    private String serial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}
