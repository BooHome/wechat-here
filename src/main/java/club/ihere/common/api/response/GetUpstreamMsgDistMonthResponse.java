package club.ihere.common.api.response;

import club.ihere.common.api.entity.UpstreamMsgDistMonth;

import java.util.List;

/**
 * @author
 */
public class GetUpstreamMsgDistMonthResponse extends BaseResponse {

    private List<UpstreamMsgDistMonth> list;

    public List<UpstreamMsgDistMonth> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgDistMonth> list) {
        this.list = list;
    }
}
