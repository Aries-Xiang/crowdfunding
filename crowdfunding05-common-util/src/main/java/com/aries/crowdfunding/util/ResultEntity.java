package com.aries.crowdfunding.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: crowdfunding
 * @description: 用来封装返回信息
 * @author: Aries
 * @create: 2020-04-28 15:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultEntity<T> {

    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";
    // 封装当前请求结果
    private String result;

    // 请求失败时返回的错误信息
    private String message;

    // 要返回的数据
    private T data;

    /**
     * 请求处理成功且不需返回数据时使用的方法
     *
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithoutData() {
        return new ResultEntity<>(SUCCESS, null, null);
    }

    /**
     * 请求处理成功且需要返回数据时使用的方法
     *
     * @param data
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithData(Type data) {
        return new ResultEntity<>(SUCCESS, null, data);
    }

    public static <Type> ResultEntity<Type> failed(String message) {
        return new ResultEntity<>(FAILED, message, null);
    }


}
