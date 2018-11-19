package club.ihere.common.constant;

/**
 * 消息类型
 * 
 * @author
 * @date 下午5:30:07
 */
public class MessageConstant {

	/**
	 * 文本消息
	 */
	public static final String MESSAGE_TEXT = "text";

	/**
	 * 图片消息
	 */
	public static final String MESSAGE_IMAGE = "image";
	/**
	 * 图文消息
	 */
	public static final String MESSAGE_NEWS = "news";
	/**
	 * 语音消息
	 */
	public static final String MESSAGE_VOICE = "voice";

	/**
	 * 文件
	 */
	public static final String MESSAGE_FILE = "file";

	/**
	 * 视频消息
	 */
	public static final String MESSAGE_VIDEO = "video";

	/**
	 * 小视频消息
	 */
	public static final String MESSAGE_SHORTVIDEO = "shortvideo";

	/**
	 * 地理位置消息
	 */
	public static final String MESSAGE_LOCATION = "location";

	/**
	 * 链接消息
	 */
	public static final String MESSAGE_LINK = "link";

	/**
	 * 事件推送消息
	 */
	public static final String MESSAGE_EVENT = "event";

	/**
	 * 事件推送消息中,事件类型，subscribe(订阅)
	 */
	public static final String MESSAGE_EVENT_SUBSCRIBE = "subscribe";

	/**
	 * 事件推送消息中,事件类型，unsubscribe(取消订阅)
	 */
	public static final String MESSAGE_EVENT_UNSUBSCRIBE = "unsubscribe";

	/**
	 * 事件推送消息中,上报地理位置事件
	 */
	public static final String MESSAGE_EVENT_LOCATION_UP = "LOCATION";

	/**
	 * 事件推送消息中,自定义菜单事件,点击菜单拉取消息时的事件推送
	 */
	public static final String MESSAGE_EVENT_CLICK = "CLICK";

	/**
	 * 事件推送消息中,自定义菜单事件,点击菜单跳转链接时的事件推送
	 */
	public static final String MESSAGE_EVENT_VIEW = "VIEW";

	/**
	 * 事件推送消息中，用户扫描带参数二维码事件，已关注用户的事件推送
	 */
	public static final String MESSAGE_ENENT_SCAN = "SCAN";

	/**
	 * 模板消息发送后 推送的消息类型为Event. 事件为模板消息发送结束
	 */
	public static final String MESSAGE_EVENT_TEMPLATESEND = "TEMPLATESENDJOBFINISH";

	/**
	 * 模板消息发送结果状态(成功)
	 */
	public static final String MESSAGE_TEMPLATESEND_STATUS_SUCCESS = "success";

	/**
	 * 模板消息发送结果状态(用户拒绝)
	 */
	public static final String MESSAGE_TEMPLATESEND_STATUS_BLOCK = "failed:user block";

	/**
	 * 模板消息发送结果状态(用户拒绝之外的失败)
	 */
	public static final String MESSAGE_TEMPLATESEND_STATUS_FAILED = "failed: system failed";

}
