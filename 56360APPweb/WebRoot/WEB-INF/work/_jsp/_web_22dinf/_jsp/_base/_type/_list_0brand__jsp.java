/*
 * JSP generated by Resin Professional 3.1.3 (built Sun, 07 Oct 2007 06:30:19 PDT)
 */

package _jsp._web_22dinf._jsp._base._type;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _list_0brand__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, null, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
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
    long lastModified = 0;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      Object oDepend = _caucho_depends.get(i);
      if (oDepend instanceof com.caucho.vfs.Depend) {
        com.caucho.vfs.Depend depend = (com.caucho.vfs.Depend) oDepend;
        if (lastModified < depend.getLastModified())
          lastModified = depend.getLastModified();
      }
    }

    return lastModified;
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
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/jsp/base/type/list_brand.jsp"), -7887440259021675080L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "<!DOCTYPE HTML>\r\n<html>\r\n<head>\r\n<meta charset=\"utf-8\">\r\n<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n<!--[if lt IE 9]>\r\n<script type=\"text/javascript\" src=\"js/html5.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"js/PIE_IE678.js\"></script>\r\n<![endif]-->\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/H-ui.css\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/H-ui.admin.css\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"/font/font-awesome.min.css\"/>\r\n<!--[if IE 7]>\r\n<link href=\"font/font-awesome-ie7.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<![endif]-->\r\n<title>\u54c1\u724c\u7ba1\u7406</title>\r\n</head>\r\n<body>\r\n<nav class=\"Hui-breadcrumb\"><i class=\"icon-home\"></i> \u9996\u9875 <span class=\"c-gray en\">&gt;</span>\u8d22\u52a1\u7ba1\u7406 <span class=\"c-gray en\">&gt;</span> \u4f9b\u5e94\u5546\u7ed3\u8d26 <a class=\"btn btn-success radius r mr-20\" style=\"line-height:1.6em;margin-top:3px\" href=\"javascript:location.replace(location.href);\" title=\"\u5237\u65b0\" ><i class=\"icon-refresh\"></i></a></nav>\r\n<div class=\"pd-20\">\r\n<div class=\"text-c\">\u540d\u79f0\uff1a\r\n    <input type=\"text\" class=\"input-text\" style=\"width:200px\" placeholder=\"\u8f93\u5165\u540d\u79f0\" id=\"\" name=\"\"><button type=\"submit\" class=\"btn btn-success ml-15\" id=\"\" name=\"\"><i class=\"icon-search\"></i> \u641c\u7d22</button>\r\n\r\n  </div>\r\n  \r\n  <div class=\"cl pd-5 bg-1 bk-gray mt-20\">\r\n   <span class=\"l\">\r\n      <a href=\"javascript:;\" onClick=\"datadel()\" class=\"btn btn-danger radius\"><i class=\"icon-trash\"></i> \u6279\u91cf\u5220\u9664</a>\r\n      <a class=\"btn btn-primary radius\" href=\"javascript:;\" onClick=\"product_in_add('750','','\u5546\u54c1\u5f55\u5165','/base/type/add_brand.do')\"><i class=\"icon-plus\"></i> \u6dfb\u52a0</a>\r\n    </span>\r\n    <span class=\"r\">\u5171\u6709\u6570\u636e\uff1a<strong>54</strong> \u6761</span>\r\n  </div>\r\n  <table class=\"table table-border table-bordered table-hover table-bg\">\r\n    <thead>\r\n      <tr class=\"text-c\">\r\n        <th width=\"41\">ID</th>\r\n        <th width=\"138\">\u540d\u79f0</th>\r\n        <th width=\"75\">\u6392\u5e8f</th>\r\n        <th width=\"75\">logo</th>\r\n        <th width=\"162\">\u7236\u7c7b</th>\r\n       \r\n        <th width=\"87\">\u64cd\u4f5c</th>\r\n      </tr>\r\n    </thead>\r\n    <tbody>\r\n      <tr class=\"text-c\">\r\n        <td>1</td>\r\n        <td>\u5927\u5954</td>\r\n        <td>2</td>\r\n        <td><img src=\"/images/dongpeng.jpeg\"></td>\r\n        <td>\u5954\u9a70</td>\r\n        <td>  <a title=\"\u751f\u6210\u8d26\u5355\" href=\"javascript:;\"class=\"mr-10\"><i class=\"icon-file-alt\"></i></a> <a title=\"\u7ed3\u8d26\" href=\"javascript:;\"><i class=\"icon-check\"></i></a> <a title=\"\u5220\u9664\" href=\"javascript:;\" onClick=\"checkout_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"icon-trash\"></i></a></td>\r\n      </tr>\r\n       <tr class=\"text-c\">\r\n        <td>1</td>\r\n        <td>\u5927\u5954</td>\r\n        <td>2</td>\r\n        <td><img src=\"/images/dongpeng.jpeg\"></td>\r\n        <td>\u5954\u9a70</td>\r\n        <td>  <a title=\"\u751f\u6210\u8d26\u5355\" href=\"javascript:;\"class=\"mr-10\"><i class=\"icon-file-alt\"></i></a> <a title=\"\u7ed3\u8d26\" href=\"javascript:;\"><i class=\"icon-check\"></i></a> <a title=\"\u5220\u9664\" href=\"javascript:;\" onClick=\"checkout_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"icon-trash\"></i></a></td>\r\n      </tr>\r\n	   <tr class=\"text-c\">\r\n        <td>1</td>\r\n        <td>\u5927\u5954</td>\r\n        <td>2</td>\r\n        <td><img src=\"/images/dongpeng.jpeg\"></td>\r\n        <td>\u5954\u9a70</td>\r\n\r\n        <td>  <a title=\"\u751f\u6210\u8d26\u5355\" href=\"javascript:;\"class=\"mr-10\"><i class=\"icon-file-alt\"></i></a> <a title=\"\u7ed3\u8d26\" href=\"javascript:;\"><i class=\"icon-check\"></i></a> <a title=\"\u5220\u9664\" href=\"javascript:;\" onClick=\"checkout_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"icon-trash\"></i></a></td>\r\n      </tr>\r\n	   <tr class=\"text-c\">\r\n        <td>1</td>\r\n        <td>\u5927\u5954</td>\r\n        <td>2</td>\r\n        <td><img src=\"/images/dongpeng.jpeg\"></td>\r\n        <td>\u5954\u9a70</td>\r\n       \r\n       \r\n        <td>  <a title=\"\u751f\u6210\u8d26\u5355\" href=\"javascript:;\"class=\"mr-10\"><i class=\"icon-file-alt\"></i></a> <a title=\"\u7ed3\u8d26\" href=\"javascript:;\"><i class=\"icon-check\"></i></a> <a title=\"\u5220\u9664\" href=\"javascript:;\" onClick=\"checkout_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"icon-trash\"></i></a></td>\r\n      </tr>\r\n	   <tr class=\"text-c\">\r\n        <td>1</td>\r\n        <td>\u5927\u5954</td>\r\n        <td>2</td>\r\n        <td><img src=\"/images/dongpeng.jpeg\"></td>\r\n        <td>\u5954\u9a70</td>\r\n       \r\n       \r\n        <td>  <a title=\"\u751f\u6210\u8d26\u5355\" href=\"javascript:;\"class=\"mr-10\"><i class=\"icon-file-alt\"></i></a> <a title=\"\u7ed3\u8d26\" href=\"javascript:;\"><i class=\"icon-check\"></i></a> <a title=\"\u5220\u9664\" href=\"javascript:;\" onClick=\"checkout_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"icon-trash\"></i></a></td>\r\n      </tr>\r\n  \r\n  </table>\r\n    <div id=\"pageNav\" class=\"pageNav\"></div>\r\n</div>\r\n<script type=\"text/javascript\" src=\"/js/jquery.min.js\"></script>\r\n<script type=\"text/javascript\" src=\"/layer/layer.min.js\"></script> \r\n<script type=\"text/javascript\" src=\"/js/pagenav.cn.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/H-ui.js\"></script> \r\n<script type=\"text/javascript\" src=\"/js/H-ui.admin.js\"></script>\r\n<script type=\"text/javascript\">\r\nwindow.onload = (function(){\r\n    // optional set\r\n    pageNav.pre=\"&lt;\u4e0a\u4e00\u9875\";\r\n    pageNav.next=\"\u4e0b\u4e00\u9875&gt;\";\r\n    // p,\u5f53\u524d\u9875\u7801,pn,\u603b\u9875\u9762\r\n    pageNav.fn = function(p,pn){$(\"#pageinfo\").text(\"\u5f53\u524d\u9875:\"+p+\" \u603b\u9875: \"+pn);};\r\n    //\u91cd\u5199\u5206\u9875\u72b6\u6001,\u8df3\u5230\u7b2c\u4e09\u9875,\u603b\u987533\u9875\r\n    pageNav.go(1,13);\r\n});\r\n</script>\r\n</body>\r\n</html>".toCharArray();
  }
}
