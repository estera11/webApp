package service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.StockItemDAO;
import iterator.ArrayListStockItem;
import model.StockItem;

@WebServlet(name = "StockServlet", urlPatterns = {"/StockServlet"})
public class StockService extends HttpServlet {


	ArrayListStockItem items = new ArrayListStockItem();
		private static final long serialVersionUID = 1L;

		@Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html;charset=UTF-8");
	        
	        StockItemDAO stockDao = new StockItemDAO();
			List<StockItem> items = stockDao.getStockItems();
		
	
	        request.setAttribute("sItem", items.get(0));
	       
	        request.getRequestDispatcher("show.jsp").forward(request, response);
	    }
}


