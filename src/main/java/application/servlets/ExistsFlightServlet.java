package application.servlets;

import application.FlightService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findFlight")
public class ExistsFlightServlet extends HttpServlet {

    private static final String FIRST_PARAM = "start";
    private static final String SECOND_PARAM = "end";

    private FlightService service;

    public ExistsFlightServlet(){
        this(new FlightService());
    }

    public ExistsFlightServlet(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
        String startFlight = req.getParameter(FIRST_PARAM);
        String endFlight = req.getParameter(SECOND_PARAM);

        String flight = service.checkIfFlightExists(startFlight, endFlight);

        resp.setContentType("text/html");
        resp.getWriter().write("<h1>" + flight + "</h1>");
    }
}
