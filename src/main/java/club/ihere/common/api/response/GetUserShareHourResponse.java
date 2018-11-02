package club.ihere.common.api.response;

import club.ihere.common.api.entity.UserShareHour;

import java.util.List;

/**
 * @author
 */
public class GetUserShareHourResponse extends BaseResponse {

    private List<UserShareHour> list;

    public List<UserShareHour> getList() {
        return list;
    }

    public void setList(List<UserShareHour> list) {
        this.list = list;
    }
}
