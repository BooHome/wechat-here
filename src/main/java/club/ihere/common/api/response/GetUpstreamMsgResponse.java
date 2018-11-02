package club.ihere.common.api.response;

import club.ihere.common.api.entity.UpstreamMsg;

import java.util.List;

/**
 * @author
 */
public class GetUpstreamMsgResponse extends BaseResponse {

    private List<UpstreamMsg> list;

    public List<UpstreamMsg> getList() {
        return list;
    }

    public void setList(List<UpstreamMsg> list) {
        this.list = list;
    }
}
