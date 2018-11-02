package club.ihere.common.api.response;

import club.ihere.common.api.entity.UserReadHour;

import java.util.List;

/**
 * @author
 */
public class GetUserReadHourResponse extends BaseResponse {

    private List<UserReadHour> list;

    public List<UserReadHour> getList() {
        return list;
    }

    public void setList(List<UserReadHour> list) {
        this.list = list;
    }
}
