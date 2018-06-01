package com.kuheng.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.kuheng.utils.PageView;



public class PageAdminTag extends TagSupport {
	private int currentpage;
	private int totalpage;
	private String pageurl;

	public int doEndTag() throws JspException {
		// TODO 自动生成方法存根
		PageView<Object> pageView = new PageView<Object>(20, currentpage);
		pageView.setTotalpage(totalpage);
		JspWriter out = pageContext.getOut();
		
		if(currentpage>=totalpage){currentpage=totalpage;}
		try {

			StringBuilder jpql = new StringBuilder();
			if (pageurl != null && pageurl.length() > 5) {
				if (pageurl.indexOf("?") <= 0) {
					pageurl = pageurl + "?pageno=";
				} else {
					pageurl = pageurl + "&pageno=";
				}

			} else {
				pageurl = "?pageno=";
			}
			int next = this.getCurrentpage() + 1;
			if(next>totalpage){next=totalpage;}
			
			int pre = this.getCurrentpage() - 1;
			if (pre <= 0) {
				pre = 1;
			}
			//jpql.append("<div class=\"message\">  共"+totalpage+"条记录，共"+totalpage+"页，当前显示第"+currentpage+" 页 </div>");
		    jpql.append("<ul class=\"paginList\">");
			jpql.append("<li class=\"paginItem\"><a  href='"+ pageurl+ "1'  >首页</a></li>");
			jpql.append("<li class=\"paginItem\"><a href='"+ pageurl + pre + "'  >上一页</a></li>");
			jpql.append("<li class=\"paginItem\"><a href='"+ pageurl + next + "'  class=\"next paginate_button\" tabindex=\"0\">下一页</a></li>");
			jpql.append("<li class=\"paginItem\"><a  href='"+ pageurl + totalpage + "' class=\"last paginate_button\" tabindex=\"0\">尾页</a></li>");
			jpql.append("<li class=\"paginItem\"> 第<input id=\"queryForm_toPage\" onBlur=\"javascript:gotourl();\" name=\"page\" type=\"number\" style=\"width:30px\" class=\"inputt\" value=\""+currentpage+"\" max=\""+totalpage+"\" min=\"1\" />页</li>");
			jpql.append("<input type=\"hidden\" name=\"pageurl\" id=\"pageurl\" value=\""+pageurl+"\">");
            jpql.append(" </ul>");
		out.print(jpql.toString());
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			System.out.print(e.getMessage());
		}

		return super.doEndTag();
	}

	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public String getPageurl() {
		return pageurl;
	}

	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}
}
