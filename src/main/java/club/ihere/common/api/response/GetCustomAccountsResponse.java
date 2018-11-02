package club.ihere.common.api.response;

import com.alibaba.fastjson.annotation.JSONField;
import club.ihere.common.api.entity.CustomAccount;

import java.util.List;

/**
 * @author
 */
public class GetCustomAccountsResponse extends BaseResponse {

    @JSONField(name = "kf_list")
    private List<CustomAccount> customAccountList;

    public List<CustomAccount> getCustomAccountList() {
        return customAccountList;
    }

    public void setCustomAccountList(List<CustomAccount> customAccountList) {
        this.customAccountList = customAccountList;
    }
}
