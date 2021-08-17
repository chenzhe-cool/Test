package ruanko.newspublish.action.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.UserBiz;
import ruanko.newspublish.entity.User;
import ruanko.newspublish.util.*;


public class UserLogin extends HttpServlet {
//    private static final long serialVersionUID = 8814713545848991778L;

    /**
     * 只允许post方式添加
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //解决中文乱码问题，这取决于前台jsp页面上设置的编码格式
        request.setCharacterEncoding("gb2312");

        //采集用户信息
        /*User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));*/

        UserBiz userBiz = new UserBiz();
        User user = new User();
        user = userBiz.getByName(request.getParameter("username"));



        if((user.getPassword()).equals(Encrypt.encodeMD5(request.getParameter("password")))){
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("userlogin.jsp").forward(request, response);
        }


    }
}