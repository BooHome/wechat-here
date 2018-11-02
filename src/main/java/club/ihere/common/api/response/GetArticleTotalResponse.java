package club.ihere.common.api.response;

import club.ihere.common.api.entity.ArticleTotal;

import java.util.List;

/**
 * @author
 */
public class GetArticleTotalResponse extends BaseResponse {

    private List<ArticleTotal> list;

    public List<ArticleTotal> getList() {
        return list;
    }

    public void setList(List<ArticleTotal> list) {
        this.list = list;
    }
}
