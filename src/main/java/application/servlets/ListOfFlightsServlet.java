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

@WebServlet("/listFlights")
public class ListOfFlightsServlet extends HttpServlet {
    private FlightService service;

    public ListOfFlightsServlet(){
        this(new FlightService());
    }

    public ListOfFlightsServlet(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Flight> flights = this.service.getAllFlights();

        resp.setContentType("text/html");
        req.setAttribute("flight", flights);
        req.getRequestDispatcher("/listOfFlights.jsp").forward(req,resp);
    }
}
