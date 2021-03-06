package com.igeek.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.domain.Category;
import com.igeek.service.CategoryService;
import com.igeek.service.impl.CategoryServiceImpl;

/**
 * Servlet implementation class FindAllCategoryServlet
 */
@WebServlet("/findAllCategory")
public class FindAllCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	CategoryService categoryService=new CategoryServiceImpl();
	List<Category> list=categoryService.findAll();
//	for (Category category : list) {
//		System.out.println(category);
//	}
	request.setAttribute("list", list);
	request.getRequestDispatcher("/admin/category/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
