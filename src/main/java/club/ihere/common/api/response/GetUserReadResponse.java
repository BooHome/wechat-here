package club.ihere.common.api.response;

import club.ihere.common.api.entity.UserRead;

import java.util.List;

/**
 * @author
 */
public class GetUserReadResponse extends BaseResponse {

    private List<UserRead> list;

    public List<UserRead> getList() {
        return list;
    }

    public void setList(List<UserRead> list) {
        this.list = list;
    }
}
