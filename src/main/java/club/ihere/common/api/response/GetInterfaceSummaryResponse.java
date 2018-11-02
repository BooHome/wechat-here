package club.ihere.common.api.response;

import club.ihere.common.api.entity.InterfaceSummary;

import java.util.List;

/**
 * @author
 */
public class GetInterfaceSummaryResponse extends BaseResponse {

    private List<InterfaceSummary> list;

    public List<InterfaceSummary> getList() {
        return list;
    }

    public void setList(List<InterfaceSummary> list) {
        this.list = list;
    }
}
