package club.ihere.common.api.response;

import club.ihere.common.api.entity.InterfaceSummaryHour;

import java.util.List;

/**
 * @author
 */
public class GetInterfaceSummaryHourResponse extends BaseResponse {

    private List<InterfaceSummaryHour> list;

    public List<InterfaceSummaryHour> getList() {
        return list;
    }

    public void setList(List<InterfaceSummaryHour> list) {
        this.list = list;
    }
}
