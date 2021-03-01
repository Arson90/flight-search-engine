package application.servlets;

import application.FlightService;
import application.data.Flight;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/findFlight")
public class ExistingFlightServlet extends HttpServlet {
    private static final String FIRST_PARAM = "start";
    private static final String SECOND_PARAM = "end";
    private FlightService service;

    public ExistingFlightServlet(){
        this(new FlightService());
    }

    public ExistingFlightServlet(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String startFlight = req.getParameter(FIRST_PARAM);
        String endFlight = req.getParameter(SECOND_PARAM);

        List<Flight> flight = new ArrayList<>();

        flight.add(this.service.checkIfFlightExists(startFlight, endFlight));

        if (flight == null){
            resp.getWriter().println(FlightService.RESPONDER);
        } else {
            resp.setContentType("text/html");
            req.setAttribute("flight", flight);
            req.getRequestDispatcher("/listOfFlights.jsp").forward(req,resp);
        }
    }
}
