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

@WebServlet("/cheapestFlight")
public class CheapestFlightServlet extends HttpServlet {
    private FlightService service;

    public CheapestFlightServlet(){
        this(new FlightService());
    }
    
    public CheapestFlightServlet(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Flight> cheapestFlight = new ArrayList<>();
        cheapestFlight.add(this.service.getTheCheapestFlight());

        resp.setContentType("text/html");
        req.setAttribute("flight", cheapestFlight);
        req.getRequestDispatcher("/listOfFlights.jsp").forward(req,resp);
    }
}
