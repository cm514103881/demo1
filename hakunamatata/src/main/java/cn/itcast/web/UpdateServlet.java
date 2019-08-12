package cn.itcast.web;

import cn.itcast.domain.Book;
import cn.itcast.service.Impl.UpdateServiceImpl;
import cn.itcast.service.UpdateService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/updateServlet/*")
public class UpdateServlet extends BaseServlet {

    private UpdateService updateService = new UpdateServiceImpl();

    public void queryBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        Book book = new Book();
        book.setId(Integer.parseInt(id));

        Book book1 = updateService.queryBook(book);


        writeValue(book1, response);

    }


    public void UpdateBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Book book = new Book();
        try {
            BeanUtils.populate(book,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        Boolean flag = updateService.updateBook(book);

        writeValue(flag,response);


    }
}
