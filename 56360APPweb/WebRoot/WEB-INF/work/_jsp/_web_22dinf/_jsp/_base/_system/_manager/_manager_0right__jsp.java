/*
 * JSP generated by Resin Professional 3.1.3 (built Sun, 07 Oct 2007 06:30:19 PDT)
 */

package _jsp._web_22dinf._jsp._base._system._manager;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;

public class _manager_0right__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      pageContext.defaultSetOrRemove("ctx", _caucho_expr_0.evalObject(_jsp_env));
      out.write(_jsp_string1, 0, _jsp_string1.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string2, 0, _jsp_string2.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string3, 0, _jsp_string3.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string4, 0, _jsp_string4.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string5, 0, _jsp_string5.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string6, 0, _jsp_string6.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string7, 0, _jsp_string7.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string8, 0, _jsp_string8.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string9, 0, _jsp_string9.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string10, 0, _jsp_string10.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string11, 0, _jsp_string11.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string8, 0, _jsp_string8.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string12, 0, _jsp_string12.length);
      _caucho_expr_1.print(out, _jsp_env, false);
      out.write(_jsp_string13, 0, _jsp_string13.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != -5493130486421572921L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jsp/jstl/core");
    manager.addTaglibFunctions(_jsp_functionMap, "pagetag", "/WEB-INF/tlds/PageAdminTag.tld");
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
    _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${pageContext.request.contextPath}");
    _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${ctx}");
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/jsp/base/system/manager/manager_right.jsp"), -2132645950405979590L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;

  private final static char []_jsp_string6;
  private final static char []_jsp_string5;
  private final static char []_jsp_string13;
  private final static char []_jsp_string3;
  private final static char []_jsp_string10;
  private final static char []_jsp_string12;
  private final static char []_jsp_string7;
  private final static char []_jsp_string1;
  private final static char []_jsp_string4;
  private final static char []_jsp_string8;
  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  private final static char []_jsp_string9;
  private final static char []_jsp_string11;
  static {
    _jsp_string6 = "/file/script/config.js\"></script>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    _jsp_string5 = "/lang/zh-cn/lang.js\"></script>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    _jsp_string13 = "/member/message.php\" target=\"_blank\">\u6536\u4ef6\u7bb1[0]</a></td>\r\n<td class=\"tl\">\u767b\u5f55\u65f6\u95f4</td>\r\n<td>&nbsp;2017-03-19 10:39 </td>\r\n</tr>\r\n<tr>\r\n<td class=\"tl\">\u8d26\u6237\u4f59\u989d</td>\r\n<td>&nbsp;0.00</td>\r\n<td class=\"tl\">\u4f1a\u5458\u79ef\u5206</td>\r\n<td>&nbsp;11 </td>\r\n</tr>\r\n<form action=\"?\">\r\n<tr>\r\n<td class=\"tl\">\u540e\u53f0\u641c\u7d22</td>\r\n<td colspan=\"2\">\r\n<input type=\"hidden\" name=\"file\" value=\"search\"/>\r\n<input type=\"text\" style=\"width:98%;color:#444444;\" name=\"kw\" value=\"\u8bf7\u8f93\u5165\u5173\u952e\u8bcd\" onfocus=\"if(this.value=='\u8bf7\u8f93\u5165\u5173\u952e\u8bcd')this.value='';\"/></td>\r\n<td>&nbsp;<input type=\"submit\" name=\"submit\" value=\"\u641c \u7d22\" class=\"btn\"/>\r\n</td>\r\n</tr>\r\n</form>\r\n<form method=\"post\" action=\"?\">\r\n<tr>\r\n<td class=\"tl\">\u5de5\u4f5c\u4fbf\u7b3a</td>\r\n<td colspan=\"2\">\r\n<input type=\"hidden\" name=\"action\" value=\"main\"/>\r\n<textarea name=\"note\" style=\"width:98%;height:50px;overflow:visible;color:#444444;\"></textarea></td>\r\n<td>&nbsp;<input type=\"submit\" name=\"submit\" value=\"\u4fdd \u5b58\" class=\"btn\"/>\r\n</td>\r\n</tr>\r\n</form>\r\n</table>\r\n\r\n	<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" class=\"mainlist\">\r\n		<tr>\r\n			<td width=\"47%\">\u7ba1\u7406\u5458\u767b\u5f55\u7528\u6237\u540d\uff1aadmin </td>\r\n			<td width=\"53%\">\u767b\u5f55\u65f6\u95f4\uff1a 2017-03-19 10:39 \u767b\u5f55ip\uff1a111.37.28.134</td>\r\n		</tr>\r\n		<tr>\r\n			<td>\u670d\u52a1\u5668\u65f6\u95f4\uff1a 2017-03-19 10:56:04 Sunday</td>\r\n			<td>\u670d\u52a1\u5668\u4fe1\u606f\uff1a WINNT&nbsp;Apache/2.2.25 (Win32) PHP/5.3.3 [121.42.161.59:80] <a href=\"?file=doctor\" class=\"t\">[\u7cfb\u7edf\u4f53\u68c0]</a></td>\r\n		</tr>\r\n		<tr>\r\n			<td>\u6570\u636e\u5e93\u7248\u672c\uff1a MySQL 5.5.31</td>\r\n			<td>\u5b89\u88c5\u65f6\u95f4\uff1a 2017-02-22 22:41</td>\r\n		</tr>\r\n      \r\n        <tr>\r\n			<td>\u662f\u5426\u652f\u6301\u56fe\u5f62\u5904\u7406\uff1a \u652f\u6301GD\u56fe\u5f62\u5904\u7406\u5e93</td>\r\n			<td>\u4e0a\u6b21\u5907\u4efd\uff1a <a href=\"?file=database\" title=\"\u70b9\u51fb\u5907\u4efd\u6570\u636e\u5e93\">2017-02-22 22:41:36 (<span class=\"f_red\">24</span>\u5929\u4ee5\u524d)</a></td>\r\n		</tr>\r\n		\r\n    </table> \r\n		</div>\r\n    \r\n    \r\n<div class=\"tab\">\r\n		<ul>\r\n			<li><a href=\"javascript:void(0);\" class=\"on\" onclick=\"$('#main-lang-2').toggle();\">\u8865\u4e01\u4fe1\u606f</a></li>			\r\n		</ul>\r\n	</div>\r\n	<div class=\"main\" id=\"main-lang-2\">\r\n	<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" class=\"mainlist\">\r\n	\r\n          <tr>\r\n            <td colspan=\"2\"><script type=\"text/javascript\" src=\"http://bbs.aijiacms.com/api.php?mod=js&bid=4\"></script></td>\r\n          </tr>\r\n		  \r\n    </table>\r\n	</div>\r\n	\r\n\r\n		<div class=\"tab\">\r\n		<ul>\r\n			<li><a href=\"javascript:void(0);\" class=\"on\" onclick=\"$('#main-lang-3').toggle();\">\u7248\u6743\u4fe1\u606f</a></li>			\r\n		</ul>\r\n	</div>\r\n        <div class=\"main\" id=\"main-lang-3\">\r\n	<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" class=\"mainlist\">\r\n		<tr>\r\n			<td width=\"14%\">\u8f6f\u4ef6\u7248\u672c</td>\r\n			<td width=\"86%\"><span id=\"copyright\" style=\"color:#FF0000\"></span> aijiacms Version 7.28 Release 20161111 UTF-8 ZH-CN			\r\n         </td>\r\n		</tr>\r\n		\r\n		\r\n		<tr>\r\n			<td>\u5b98\u65b9\u7f51\u7ad9</td>\r\n			<td><a href=\"http://www.aijiacms.com\" target=\"_blank\">http://www.aijiacms.com</a> <a href=\"http://bbs.aijiacms.com\" target=\"_blank\">\u6280\u672f\u652f\u6301</a> </td>\r\n		</tr>\r\n	</table>\r\n	</div>\r\n	</div>\r\n\r\n\r\n\r\n\r\n<script type=\"text/javascript\" src=\"http://www.aijiacms.com/update.php?action=notice&product=house&version=7.28&release=20161111&lang=zh-cn&charset=UTF-8&domain=&install=1487774499&os=WINNT&soft=Apache%2F2.2.25+%28Win32%29+PHP%2F5.3.3&php=5.3.3&mysql=5.5.31&url=http%3A%2F%2Ft8.yuandongguanggao.com%2Fadmin.php%3Faction%3Dmain&site=AIJIACMS%E6%88%BF%E4%BA%A7%E7%BD%91%E7%AB%99&auth=74C2B92B7D65E8256223584E1F60F9CE\"></script>\r\n<script type=\"text/javascript\">\r\nvar aijiacms_release = 20161111;\r\nvar aijiacms_version = 7.28;\r\nif(typeof aijiacms_lastrelease != 'undefined') {\r\n	var lastrelease = parseInt(aijiacms_lastrelease.replace('-', '').replace('-', ''));\r\n	if(aijiacms_lastversion >= aijiacms_version && aijiacms_release < lastrelease) {\r\n		Dd('tips_update').style.display = '';\r\n		Dd('last_v').innerHTML = aijiacms_lastversion;\r\n		Dd('last_r').innerHTML = aijiacms_lastrelease;\r\n	}\r\n}\r\n</script>\r\n</body>\r\n</html>".toCharArray();
    _jsp_string3 = "/favicon.ico\"/>\r\n<script type=\"text/javascript\">window.onerror= function(){return true;}</script><link rel=\"stylesheet\" href=\"".toCharArray();
    _jsp_string10 = "/admin/template/css/style.css\" />\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    _jsp_string12 = "/file/script/config.js\"></script>\r\n</head>\r\n<body oncontextmenu=\"return false\" ondragstart=\"return false\" onSelectStart=\"return false\">\r\n<div id=\"tips_update\" style=\"display:none;\">\r\n\r\n<table cellpadding=\"2\" cellspacing=\"1\" class=\"tb\">\r\n<tr>\r\n<td><div style=\"padding:20px 30px 20px 20px;\" title=\"\u5f53\u524d\u7248\u672cV7.28 \u66f4\u65b0\u65f6\u95f420161111\"><img src=\"admin/image/tips_update.gif\" width=\"32\" height=\"32\" align=\"absmiddle\"/>&nbsp;&nbsp; <span class=\"f_red\">\u60a8\u7684\u5f53\u524d\u8f6f\u4ef6\u7248\u672c\u6709\u65b0\u7684\u66f4\u65b0\uff0c\u8bf7\u6ce8\u610f\u5347\u7ea7</span>&nbsp;&nbsp;\u6700\u65b0\u7248\u672c\uff1aV<span id=\"last_v\">7.28</span> \u66f4\u65b0\u65f6\u95f4\uff1a<span id=\"last_r\">20161111</span>&nbsp;&nbsp;\r\n<input type=\"button\" value=\"\u68c0\u67e5\u66f4\u65b0\" class=\"btn\" onclick=\"window.open('http://bbs.aijiacms.com')\"> </div></td>\r\n</tr>\r\n</table>\r\n</div>\r\n<div id=\"wrap\">\r\n	<div class=\"tab\">\r\n		<ul>\r\n			<li><a href=\"javascript:void(0);\" class=\"on\" onclick=\"$('#main-lang-1').toggle();\">\u7cfb\u7edf\u4fe1\u606f</a></li>			\r\n		</ul>\r\n	</div>\r\n	<div class=\"main\" id=\"main-lang-1\">\r\n	<table cellpadding=\"2\" cellspacing=\"1\" class=\"tb\">\r\n<tr>\r\n<td class=\"tl\">\u7ba1\u7406\u7ea7\u522b</td>\r\n<td width=\"30%\">&nbsp;\u7f51\u7ad9\u521b\u59cb\u4eba</td>\r\n<td class=\"tl\">\u767b\u5f55\u6b21\u6570</td>\r\n<td width=\"30%\">&nbsp;15 \u6b21</td>\r\n</tr>\r\n<tr>\r\n<td class=\"tl\">\u7ad9\u5185\u4fe1\u4ef6</td>\r\n<td>&nbsp;<a href=\"".toCharArray();
    _jsp_string7 = "/file/script/jquery.js\"></script>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    _jsp_string1 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\"/>\r\n<title>\u7ba1\u7406\u4e2d\u5fc3 - AIJIACMS\u623f\u4ea7\u7f51\u7ad9 - Powered By AIJIACMS   V7.28 R20161111</title>\r\n<meta name=\"robots\" content=\"noindex,nofollow\"/>\r\n<meta name=\"generator\" content=\"AIJIACMS - www.aijiacms.com\"/>\r\n<meta http-equiv=\"x-ua-compatible\" content=\"IE=8\"/>\r\n<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"".toCharArray();
    _jsp_string4 = "/admin/image/style.css\" type=\"text/css\"/>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    _jsp_string8 = "/file/script/common.js\"></script>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n  \r\n".toCharArray();
    _jsp_string2 = "/favicon.ico\"/>\r\n<link rel=\"bookmark\" type=\"image/x-icon\" href=\"".toCharArray();
    _jsp_string9 = "/file/script/admin.js\"></script>\r\n</head>\r\n<body>\r\n<div id=\"msgbox\" onmouseover=\"closemsg();\" style=\"display:none;\"></div>\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<title>\u7ba1\u7406\u9996\u9875</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE7\" />\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"".toCharArray();
    _jsp_string11 = "/images/js/jquery.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
  }
}