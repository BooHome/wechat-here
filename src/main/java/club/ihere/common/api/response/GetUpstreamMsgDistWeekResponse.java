package club.ihere.common.api.response;

import club.ihere.common.api.entity.UpstreamMsgDistWeek;

import java.util.List;

/**
 * @author
 */
public class GetUpstreamMsgDistWeekResponse extends BaseResponse {

    private List<UpstreamMsgDistWeek> list;

    public List<UpstreamMsgDistWeek> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgDistWeek> list) {
        this.list = list;
    }
}
