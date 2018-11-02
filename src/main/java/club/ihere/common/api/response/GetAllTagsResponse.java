package club.ihere.common.api.response;

import club.ihere.common.api.entity.Tag;

import java.util.List;

/**
 * @author
 * @since 1.3.9
 */
public class GetAllTagsResponse extends BaseResponse {

    private List<Tag> tags;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
