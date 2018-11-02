package club.ihere.common.api.response;

import club.ihere.common.api.entity.UpstreamMsgWeek;

import java.util.List;

/**
 * @author
 */
public class GetUpstreamMsgWeekResponse extends BaseResponse {

    private List<UpstreamMsgWeek> list;

    public List<UpstreamMsgWeek> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgWeek> list) {
        this.list = list;
    }
}
