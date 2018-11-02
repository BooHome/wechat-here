package club.ihere.common.api.response;

import club.ihere.common.api.entity.ArticleSummary;

import java.util.List;

/**
 * @author
 */
public class GetArticleSummaryResponse extends BaseResponse {

    private List<ArticleSummary> list;

    public List<ArticleSummary> getList() {
        return list;
    }

    public void setList(List<ArticleSummary> list) {
        this.list = list;
    }
}
