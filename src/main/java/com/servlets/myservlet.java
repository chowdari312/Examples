package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.stu;
import com.helper.fact;

public class myservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest re, HttpServletResponse ro) throws ServletException, IOException {
        try {
            String name = re.getParameter("name");
            String roll = re.getParameter("roll");
            stu st = new stu(name, roll);
            System.out.println(st);
            Session s = fact.getFactory().openSession();
            Transaction tx = s.beginTransaction();
            s.save(st);
            tx.commit();
            s.close();
            ro.setContentType("text/html");
            ro.getWriter().print("Success!..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest re, HttpServletResponse ro) throws ServletException, IOException {
        try {
            Session s = fact.getFactory().openSession();
            Transaction tx = s.beginTransaction();
            
            Query<stu> query = s.createQuery("FROM stu", stu.class);   
            List<stu> students = query.getResultList();
            
           System.out.println(students);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


   
    }

