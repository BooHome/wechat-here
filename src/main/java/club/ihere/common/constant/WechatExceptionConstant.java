package club.ihere.common.constant;

/**
 * @author: fengshibo
 * @date: 2018/11/2 15:26
 * @description:
 */
public class WechatExceptionConstant {

    public final static String OK = "SUCCESS";

    public final static String ValidateSignatureError = "签名验证错误";

    public final static String ParseXmlError = "xml解析失败";

    public final static String ComputeSignatureError = "sha加密生成签名失败";

    public final static String IllegalAesKey = "SymmetricKey非法";

    public final static String ValidateAppidError = "appid校验失败";

    public final static String EncryptAESError = "aes加密失败";

    public final static String DecryptAESError = "aes解密失败";

    public final static String IllegalBuffer = "解密后得到的buffer非法";

}
