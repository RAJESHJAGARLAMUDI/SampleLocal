package com.sample.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileImageServlet
 */
@WebServlet("/ProfileImageServlet")
public class ProfileImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fileName = request.getParameter("fileName");
		response.addHeader("Content-Disposition",
				"attachment; filename=" + fileName);
		response.setContentType("image/jpeg");
		try{
		OutputStream out =response.getOutputStream();
		File file = null;
//		response.setContentLength((int)file.length());
		InputStream in = null;
		
		
		file = new File(fileName);
		response.setContentLength((int)file.length());
		in = new FileInputStream(file);
		
		
		if (in == null) {
		out.close();
		} else {
		byte[] buffer = new byte[(int)file.length()];
		int len;

		while ((len = in.read(buffer)) != -1) {
		out.write(buffer, 0, len);
		}
		}
	}
		catch(Exception e){
			System.out.println("Profile pic not found ");
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
