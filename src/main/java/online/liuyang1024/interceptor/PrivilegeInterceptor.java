package online.liuyang1024.interceptor;

import online.liuyang1024.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Create by LiuYang on 2022/5/6 00:40
 */
public class PrivilegeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //取得session
        HttpSession httpSession = request.getSession();
        //获取session中的user
        User user = (User) httpSession.getAttribute("user");
        // 如果user为空则重定向
        if (user == null) {
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return false;
        }
        // 放行
        return true;
    }
}
