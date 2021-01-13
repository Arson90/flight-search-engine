package application.servlets;

import application.FlightService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cheapestFlight")
public class CheapestFlight extends HttpServlet {

    FlightService service;

    public CheapestFlight(){
        this(new FlightService());
    }

    public CheapestFlight(FlightService service){
        this.service = service;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String result = service.getTheCheapestFlight();

        resp.setContentType("text/html");
        resp.getWriter().println("<h1>" + result + "</h2>");
    }
}
