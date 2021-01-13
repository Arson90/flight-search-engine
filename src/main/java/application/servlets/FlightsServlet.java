package application.servlets;

import application.FlightService;
import application.data.Flight;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/allFlights")
public class FlightsServlet extends HttpServlet {

    private FlightService service;

    public FlightsServlet(){
        this(new FlightService());
    }

    public FlightsServlet(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Flight> list = service.getAllFlights();
        req.setAttribute("list", list);

        resp.setContentType("text/html");
        req.getRequestDispatcher("/flightList.jsp").forward(req,resp);
    }
}
