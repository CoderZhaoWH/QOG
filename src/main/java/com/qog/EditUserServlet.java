package com.qog;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.qog.util.Constant;
import com.qog.util.DESede;
import com.qog.util.WebUtil;

public class EditUserServlet extends HttpServlet {
	private UserService userService;

	public EditUserServlet() {
	}

	public void init(ServletConfig config) throws ServletException {

		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
		userService = (UserService) ctx.getBean("userService");
	}

	public void destroy() {

		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("信息：方法【AddSurveyServletdoGet】开始！");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("信息：方法【AddSurveyServletdoPost】开始！");

		int id = Integer.valueOf(WebUtil.getParam(request, "id", null));
		System.out.println(id);
		String name = WebUtil.getParam(request, "name", null);
		String sex = WebUtil.getParam(request, "sex", null);
		String password = WebUtil.getParam(request, "password", null);
		String auth = WebUtil.getParam(request, "auth", null);
		String tel = WebUtil.getParam(request, "tel", null);
		String email = WebUtil.getParam(request, "email", null);

		int affectrows = userService.updateAndReturnID(name, sex, password, auth, tel, email, id);
		WebUtil.respond(request, response, affectrows);
	}
}