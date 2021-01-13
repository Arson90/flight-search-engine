package application.servlets;

import application.FlightService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/flightTo")
public class FlightsToServlet extends HttpServlet {

    private static final String FIRST_PARAM = "end";

    private FlightService service;

    public FlightsToServlet(){
        this(new FlightService());
    }

    public FlightsToServlet(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String endFlight = req.getParameter(FIRST_PARAM);

        List<String> list = service.getFlightToCity(endFlight);

        resp.setContentType("text/html");
        req.setAttribute("list", list);
        req.getRequestDispatcher("/flights.jsp").forward(req,resp);
    }
}
