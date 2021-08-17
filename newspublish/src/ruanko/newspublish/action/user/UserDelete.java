package ruanko.newspublish.action.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.UserBiz;

public class UserDelete extends HttpServlet {
//    private static final long serialVersionUID = -6612127874269742897L;

    /**
     * 删用户毕竟是一个危险操作，不能想删就删啊，所以用了post方式，给删除增加了一小点点难度
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //得到要删除id
        int id = Integer.parseInt(request.getParameter("id"));

        //创建业务逻辑对象，删除该用户
        UserBiz userBiz = new UserBiz ();
        userBiz.deleteUser(id);

        //跳转到主页
        /**
         待修改*/
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
