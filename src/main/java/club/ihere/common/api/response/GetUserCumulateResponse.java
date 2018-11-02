package club.ihere.common.api.response;

import club.ihere.common.api.entity.UserCumulate;

import java.util.List;

/**
 * @author
 */
public class GetUserCumulateResponse extends BaseResponse {

    private List<UserCumulate> list;

    public List<UserCumulate> getList() {
        return list;
    }

    public void setList(List<UserCumulate> list) {
        this.list = list;
    }
}
