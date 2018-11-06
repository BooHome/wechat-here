package club.ihere.common.constant;

import java.nio.charset.Charset;

/**
 * 常量
 * 
 * @author
 */
public class Constant {

	/** utf-8 */
	public static final String CHARSET_UTF8_NAME = "utf-8";

	/** utf-8 */
	public static final Charset CHARSET_UTF8 = Charset.forName(CHARSET_UTF8_NAME);

	/**图片分割数量*/
	public  static final int IMAGE_CUT_ROWS=3;
	public  static final int IMAGE_CUT_COLS=3;

	/**
	 * 分割图片路径
	 */
	public  static final String IMAGE_CUT_PATH="/www/wwwroot/file.ihere.club/";
	/**
	 * 合并图片后缀
	 */
	public  static final String IMAGE_CUT_FINAL_NAME="final";

}
