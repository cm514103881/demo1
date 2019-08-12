package cn.itcast.web;

import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import cn.itcast.service.Impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/bookServlet/*")
public class BookServlet extends BaseServlet {
    private BookService bookService = new BookServiceImpl();

    public void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        List<Book> list = bookService.findAll();


        writeValue(list,response);
    }


}
