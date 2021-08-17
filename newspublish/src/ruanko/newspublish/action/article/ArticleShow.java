package ruanko.newspublish.action.article;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.ArticleBiz;
import ruanko.newspublish.entity.Article;



/**
 * ��ʾһƪ����
 * 
 * @author
 *
 */
public class ArticleShow extends HttpServlet {
	private static final long serialVersionUID = 5594987448931704969L;

	/**
	 * Ϊʲôֻ����get��ʽ<br>
	 * ���û����һ�����������ʱ��������������ѣ�����Ҫ����ַ�������������͸����ѣ���ʱ����ַ��Ӧ���ǰ���������Ϣ�ģ����磺���ŵ�id
	 * 
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�õ���ַ�а���������id
		int id = Integer.parseInt(request.getParameter("id"));
		
		//����ҵ���߼������ȡ������
		ArticleBiz articleBiz = new ArticleBiz();
		Article article = articleBiz.get(id);
		
		//����������ӵ�request���jspҳ����ʾ
		request.setAttribute("article", article);
		
		//��ת����ʾһƪ���ŵ�ҳ��
		request.getRequestDispatcher("showdetail.jsp").forward(request, response);
	}


}
