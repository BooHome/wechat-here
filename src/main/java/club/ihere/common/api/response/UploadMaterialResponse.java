package club.ihere.common.api.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *  
 *  ====================================================================
 *
 *  --------------------------------------------------------------------
 *  @author
 *  @version 1.0.beta
 *  ====================================================================
 */
public class UploadMaterialResponse extends BaseResponse  {

    @JSONField(name = "media_id")
    private String mediaId;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}
