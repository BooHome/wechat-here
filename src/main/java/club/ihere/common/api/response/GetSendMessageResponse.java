package club.ihere.common.api.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *  获取群发消息结果
 *  ====================================================================
 *
 *  --------------------------------------------------------------------
 *  @author
 *  @version 1.0.beta
 *  ====================================================================
 */
public class GetSendMessageResponse extends BaseResponse {

    @JSONField(name="msg_id")
    private String msgId;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }
}
