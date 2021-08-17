package ruanko.newspublish.action.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.UserBiz;
import ruanko.newspublish.entity.User;

public class UserShowList extends HttpServlet {

    /**
     * 只允许了get方式访问
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //创建业务逻辑对象，取出所有文章
        UserBiz userBiz = new UserBiz();
        List<User> users = userBiz.getUserAll();

        //将取出的用户添加到request里，以便在跳转到jsp之后可以取出这些用户
        request.setAttribute("users", users);

        //跳转到显示新闻的列表页
        /**
         * 待修改*/
        request.getRequestDispatcher("shownews.jsp").forward(request, response);
    }
}
