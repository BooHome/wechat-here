package club.ihere.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: fengshibo
 * @date: 2018/11/2 11:37
 * @description:
 */
public abstract class BaseWechatController extends WechatSupport{

    /**
     * 绑定微信服务器
     *
     * @param request 请求
     * @return 响应内容
     */
    protected final String bind(HttpServletRequest request) {
        if (isLegal(request)) {
            //绑定微信服务器成功
            return request.getParameter("echostr");
        } else {
            //绑定微信服务器失败
            return "";
        }
    }

    /**
     * 微信消息交互处理
     *
     * @param request http 请求对象
     * @param response http 响应对象
     * @throws ServletException 异常
     * @throws IOException      IO异常
     */
    protected final void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isLegal(request)) {
            String result = processRequest(request);
            //设置正确的 content-type 以防止中文乱码
            response.setContentType("text/xml;charset=UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(result);
            writer.close();
        }
    }


}
