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

@WebServlet("/listFlightTo")
public class ListOfFlightsToServlet extends HttpServlet {
    private static final String FIRST_PARAM = "end";
    private FlightService service;

    public ListOfFlightsToServlet(){
        this(new FlightService());
    }

    public ListOfFlightsToServlet(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String endFlight = req.getParameter(FIRST_PARAM);

        List<Flight> flights = service.getFlightToCity(endFlight);

        if (flights.isEmpty()){
            resp.getWriter().println(FlightService.RESPONDER);
        } else {
            resp.setContentType("text/html");
            req.setAttribute("flight", flights);
            req.getRequestDispatcher("/listOfFlights.jsp").forward(req,resp);
        }
    }
}
