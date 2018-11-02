package club.ihere.common.api.response;

import club.ihere.common.api.entity.UpstreamMsgHour;

import java.util.List;

/**
 * @author
 */
public class GetUpstreamMsgHourResponse extends BaseResponse {

    private List<UpstreamMsgHour> list;

    public List<UpstreamMsgHour> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgHour> list) {
        this.list = list;
    }
}
