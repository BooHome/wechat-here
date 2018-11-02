package club.ihere.common.api;

import club.ihere.common.api.config.ApiConfig;
import club.ihere.common.api.enums.ResultType;
import club.ihere.common.api.response.BaseResponse;
import club.ihere.common.util.current.BeanUtil;
import club.ihere.common.util.current.CollectionUtil;
import club.ihere.common.util.http.HttpClientUtil;


import java.io.File;
import java.util.List;

/**
 * API基类，提供一些通用方法
 * 包含自动刷新token、通用get post请求等
 *
 * @author peiyu
 * @since 1.2
 */
public abstract class BaseAPI {

    protected static final String BASE_API_URL = "https://api.weixin.qq.com/";

    protected final ApiConfig config;

    /**
     * 构造方法，设置apiConfig
     *
     * @param config 微信API配置对象
     */
    protected BaseAPI(ApiConfig config) {
        this.config = config;
    }


    /**
     * 通用post请求
     *
     * @param url  地址，其中token用#代替
     * @param json 参数，json格式
     * @return 请求结果
     */
    protected BaseResponse executePost(String url, String json) {
        return executePost(url, json, null);
    }

    /**
     * 通用post请求
     *
     * @param url  地址，其中token用#代替
     * @param json 参数，json格式
     * @param file 上传的文件
     * @return 请求结果
     */
    protected BaseResponse executePost(String url, String json, File file) {
        BaseResponse response;
        BeanUtil.requireNonNull(url, "url is null");
        List<File> files = null;
        if (null != file) {
            files = CollectionUtil.newArrayList(file);
        }
        //需要传token
        String postUrl = url.replace("#", config.getAccessToken());
        response = HttpClientUtil.post(postUrl, json, files);
        return response;
    }


    /**
     * 通用get请求
     *
     * @param url 地址，其中token用#代替
     * @return 请求结果
     */
    protected BaseResponse executeGet(String url) {
        BaseResponse response;
        BeanUtil.requireNonNull(url, "url is null");
        //需要传token
        String getUrl = url.replace("#", config.getAccessToken());
        response = HttpClientUtil.get(getUrl);
        return response;
    }

    /**
     * 判断本次请求是否成功
     *
     * @param errCode 错误码
     * @return 是否成功
     */
    protected boolean isSuccess(String errCode) {
        return ResultType.SUCCESS.getCode().toString().equals(errCode);
    }
}
