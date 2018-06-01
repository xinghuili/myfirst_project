package com.kuheng.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class UrlTag extends TagSupport {

	@Override
	public void setPageContext(PageContext pageContext) {
		super.setPageContext(pageContext);
	}

	@Override
	public int doStartTag() throws JspException {
		try {
			pageContext.getResponse().getWriter().write("hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	
	
}
