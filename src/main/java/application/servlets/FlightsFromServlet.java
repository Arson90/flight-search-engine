package application.servlets;

import application.FlightService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet("/flightFrom")
public class FlightsFromServlet extends HttpServlet{

    private static final String FIRST_PARAM = "start";

    private FlightService service;

    public FlightsFromServlet(){
        this(new FlightService());
    }

    public FlightsFromServlet(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startFlight = req.getParameter(FIRST_PARAM);

        List<String> list = service.getFlightsFromCity(startFlight);

        if (list.isEmpty()){
            resp.getWriter().println(FlightService.RESPONDER);
        } else {
            resp.setContentType("text/html");
            req.setAttribute("list", list);
            req.getRequestDispatcher("/flights.jsp").forward(req,resp);
        }
    }
}
