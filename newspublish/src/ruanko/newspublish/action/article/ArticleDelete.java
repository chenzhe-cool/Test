package ruanko.newspublish.action.article;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.ArticleBiz;


/**
 * ɾ������
 * 
 * @author
 *
 */
public class ArticleDelete extends HttpServlet {
	private static final long serialVersionUID = -6612127874269742897L;

	/**
	 * ɾ���űϾ���һ��Σ�ղ�����������ɾ��ɾ������������post��ʽ����ɾ��������һС����Ѷ�
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�õ�Ҫɾ��id
		int id = Integer.parseInt(request.getParameter("id"));
		
		//����ҵ���߼�����ɾ��������
		ArticleBiz articleBiz = new ArticleBiz ();
		articleBiz.delete(id);
		
		//��ת����ҳ
		//��������������ת�������б�ҳ�������һЩ
		//Ҳ��������������һ��ġ���С���ŷ���ϵͳ���ڽ����
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
}
