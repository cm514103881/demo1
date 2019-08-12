package cn.itcast.web;

import cn.itcast.domain.User;
import cn.itcast.service.Impl.UserServiceImpl;
import cn.itcast.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findUserServlet/*")
public class FindUserServlet extends BaseServlet {

    private UserService userService = new UserServiceImpl();

    public void findUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        User user1 = userService.findUser(user);


        request.getSession().setAttribute("user",user1);

        writeValue(user1,response);
    }

}
