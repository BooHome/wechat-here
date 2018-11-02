package club.ihere.common.api.entity;

import club.ihere.common.util.current.fastjson.JSONUtil;

/**
 * 抽象实体类
 *
 * @author
 */
public abstract class BaseModel implements Model {
    @Override
    public String toJsonString() {
        return JSONUtil.toJson(this);
    }
}
