import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/discount")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        float discountAmount = (price * percent * 0.1f) / 100;
        float discountPrice = price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>\n" +
                "    <head>\n" +
                "        <title>Product Discount Calculator</title>\n" +
                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <div id=\"content\">\n" +
                "            <h1>Product Discount Calculator</h1>\n" +
                "            <label>Product Description: </label>\n" + description +
                "            <span></span><br/>\n" +
                "            <label>Price: </label>\n" + price +
                "            <span>$</span><br/>\n" +
                "            <label>Discount Percent: </label>\n" + percent +
                "            <span>%</span><br/>\n" +
                "            <label>Discount Amount: </label>\n" + discountAmount +
                "            <span>$</span><br/>\n" +
                "            <label>Discount Price: </label>\n" + discountPrice +
                "            <span>$</span><br/>\n" +
                "        </div>\n" +
                "    </body>\n" +
                "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
