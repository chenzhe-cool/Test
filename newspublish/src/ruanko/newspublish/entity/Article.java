package ruanko.newspublish.entity;

/**
 * ��������<br>
 * ���ż����£����¼����ţ��е����
 * 
 * @author
 *
 */
public class Article {

	/**
	 * ���
	 */
	private int id;
	
	/**
	 * ����
	 */
	private String title;
	
	/**
	 * ����
	 */
	private String author;
	
	/**
	 * ����
	 */
	private String content;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
