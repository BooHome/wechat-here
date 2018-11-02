package club.ihere.common.api.response;

import club.ihere.common.api.entity.Menu;

/**
 * @author
 */
public class GetMenuResponse extends BaseResponse {

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
