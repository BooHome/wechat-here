package club.ihere.common.api.response;

import java.util.List;

/**
 * @author
 */
public class GetUserInfoListResponse extends  BaseResponse{
    private List<GetUserInfoResponse> user_info_list;

    public List<GetUserInfoResponse> getUser_info_list() {
        return user_info_list;
    }

    public void setUser_info_list(List<GetUserInfoResponse> user_info_list) {
        this.user_info_list = user_info_list;
    }
}
