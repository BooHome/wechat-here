package club.ihere.common.api.response;

import club.ihere.common.api.entity.UserShare;

import java.util.List;

/**
 * @author
 */
public class GetUserShareResponse extends BaseResponse {

    private List<UserShare> list;

    public List<UserShare> getList() {
        return list;
    }

    public void setList(List<UserShare> list) {
        this.list = list;
    }
}
