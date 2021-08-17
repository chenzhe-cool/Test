package ruanko.newspublish.action.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.UserBiz;
import ruanko.newspublish.entity.User;

public class UserShow extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //得到网址中包含的新闻id
        int id = Integer.parseInt(request.getParameter("id"));
//        String username = request.getParameter("username");

        //创建业务逻辑对象获取该新闻
        UserBiz userBiz = new UserBiz();
        User user = userBiz.get(id);

        //将该新闻添加到request里，供jsp页面显示
        request.setAttribute("user", user);

        //跳转到显示一篇新闻的页面
        request.getRequestDispatcher("showdetail.jsp").forward(request, response);
    }
}
