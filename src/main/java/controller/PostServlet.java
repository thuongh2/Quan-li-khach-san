package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IBookDetailDAO;
import dao.JpaEntityManager;
import dao.Impl.BookDetailDAO;
import dao.Impl.HotelDAO;
import model.HotelDetail;
import model.Hotel;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private BookDetailDAO bookDetailDAO = new BookDetailDAO();
	private HotelDAO postDAO = new HotelDAO();
	private JpaEntityManager jpaEntityManager = new JpaEntityManager();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("hotels", postDAO.getAll(Hotel.class));
		request.getRequestDispatcher("/admin/addHotel.jsp").forward(request, response);
    }

		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String content = (String) request.getParameter("content");
		String image = (String) request.getParameter("image");
		String area = (String) request.getParameter("area");
		String numberRoom = (String) request.getParameter("numberRoom");
		String address = (String) request.getParameter("address");
		String price =  (String) request.getParameter("price");
		String desc = (String) request.getParameter("desc");
		
		Hotel post = new Hotel();
		post.setContent(content);
		post.setCreateDate(new Date());
		post.setImage(image);
		
		HotelDetail hotelDetail = new HotelDetail();
		hotelDetail.setArea(100);
		hotelDetail.setNumberRoom(1);
		hotelDetail.setAddress(address);
		hotelDetail.setPrice(100);
		hotelDetail.setDesc(desc);
		
		postDAO.savePostAndHotel(post, hotelDetail);
		
		doGet(request, response);
	}

}
