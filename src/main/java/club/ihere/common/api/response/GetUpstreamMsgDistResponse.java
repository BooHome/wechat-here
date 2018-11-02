package club.ihere.common.api.response;

import club.ihere.common.api.entity.UpstreamMsgDist;

import java.util.List;

/**
 * @author
 */
public class GetUpstreamMsgDistResponse extends BaseResponse {

    private List<UpstreamMsgDist> list;

    public List<UpstreamMsgDist> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgDist> list) {
        this.list = list;
    }
}
