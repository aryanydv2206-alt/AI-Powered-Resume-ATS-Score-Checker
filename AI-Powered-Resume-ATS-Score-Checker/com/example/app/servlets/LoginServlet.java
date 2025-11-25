// src/main/java/com/example/app/servlets/LoginServlet.java
package com.example.app.servlets;

import com.example.app.dao.UserDao;
import com.example.app.dao.UserDaoImpl;
import com.example.app.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserDao userDao = new UserDaoImpl();

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        try {
            Optional<User> maybeUser = userDao.findByUsername(username);
            if (maybeUser.isPresent() && maybeUser.get().getPassword().equals(password)) {
                // authentication successful
                HttpSession session = req.getSession(true);
                session.setAttribute("user", maybeUser.get());
                resp.sendRedirect(req.getContextPath() + "/dashboard.jsp");
            } else {
                req.setAttribute("error", "Invalid username or password");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
