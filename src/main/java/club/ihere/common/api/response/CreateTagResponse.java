package club.ihere.common.api.response;

import club.ihere.common.api.entity.Tag;

/**
 * @author
 * @since 1.3.9
 */
public class CreateTagResponse extends BaseResponse {

    private Tag tag;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
