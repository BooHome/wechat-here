package club.ihere.common.api.response;

import club.ihere.common.api.entity.UpstreamMsgMonth;

import java.util.List;

/**
 * @author
 */
public class GetUpstreamMsgMonthResponse extends BaseResponse {

    private List<UpstreamMsgMonth> list;

    public List<UpstreamMsgMonth> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgMonth> list) {
        this.list = list;
    }
}
