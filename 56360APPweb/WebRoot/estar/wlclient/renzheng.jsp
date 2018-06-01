String username=MyFun.GetRequest(request.getParameter("username"));
			if(username.isEmpty() || username.equals("")){
				out.print(MyFun.MyEnCode(MyFun.printError("error",new String("用户名为空 ".getBytes()))));
				return;
			}
			//密码
			String password=MyFun.GetRequest(request.getParameter("password"));
			if(password.isEmpty() || password.equals("")){
				out.print(MyFun.MyEnCode(MyFun.printError("error",new String("密码为空 ".getBytes()))));
				return;
			}
			String sql="update e_user set password = '"+password+"' where username = '"+username+"' and id = " +userid;
			int i =stmt.executeUpdate(sql);
			JSONObject json = new JSONObject(); 
			if(i==1){
				json.put("state","ok");
			}else{
				json.put("state","err");
			}
					
			out.print(MyFun.MyEnCode(json.toString()));
			stmt.close();
			conn.close();
			out.close();