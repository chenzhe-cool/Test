package ruanko.newspublish.action.article;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ruanko.newspublish.biz.ArticleBiz;
import ruanko.newspublish.entity.Article;


/**
 * Ҫ�޸����ţ�����Ҫ��������ʾ���û������������޸ģ��������ڽ�������ʾ���û�
 * 
 * @author
 *
 */
public class ArticleUpdate extends HttpServlet {
	private static final long serialVersionUID = -7258058424002586258L;

	/**
	 * ������������postҲ������getû��̫������𣬲���Ϊ�˼����������ֻ������get����
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�õ�Ҫ�޸����ŵ�id
		int id = Integer.parseInt(request.getParameter("id"));
		
		//����ҵ���߼����󣬲�ȡ�ø�����
		ArticleBiz articleBiz = new ArticleBiz();
		Article article = articleBiz.get(id);
		
		//����������ӵ�request���jsp��ʾ��������������ʾ�ڱ༭���ﻹ��ʲô�ط��Ҿ͹ܲ����ˣ������Ҹ�����
		request.setAttribute("article", article);
		
		//��ת���޸�ҳ��
		request.getRequestDispatcher("updatedetail.jsp").forward(request, response);
	}
}
