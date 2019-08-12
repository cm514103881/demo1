package cn.itcast.web;

import cn.itcast.domain.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class UserFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest hsr = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String uri = hsr.getRequestURI();

        if (uri.contains("login") || uri.contains("js") || uri.contains("findUserServlet")) {
            chain.doFilter(req, resp);
        } else {

            if (uri.contains("update.html")) {
                try {
                    User user = (User) hsr.getSession().getAttribute("user");
                    System.out.println(user);
                    if (user.getId() != 0) {
                        chain.doFilter(req, resp);
                    } else {
                        response.sendRedirect("http://localhost/login.html");
                    }
                } catch (NullPointerException e) {
                    response.sendRedirect("http://localhost/login.html");
                }
            } else {
                chain.doFilter(req, resp);
            }
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}

