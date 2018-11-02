package club.ihere.common.api.response;

import club.ihere.common.api.entity.UserSummary;

import java.util.List;

/**
 * @author
 */
public class GetUserSummaryResponse extends BaseResponse {

    private List<UserSummary> list;

    public List<UserSummary> getList() {
        return list;
    }

    public void setList(List<UserSummary> list) {
        this.list = list;
    }
}
