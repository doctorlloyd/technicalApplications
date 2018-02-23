/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author ABRMA86
 */
public class AddStudentServlet extends HttpServlet {

    @EJB
    private StudentFacadeLocal studentFacade;

    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long studentNo = Long.parseLong(request.getParameter("studNo"));
        String name= request.getParameter("name");
        String surname =request.getParameter("surname");
        String cellNo=request.getParameter("cellno");
        String email = request.getParameter("email");
        Character gender = request.getParameter("gender").charAt(0);
        
        Student student = createStudent(studentNo, name, surname, gender, email, cellNo);
        studentFacade.addStudent(student);
        
        RequestDispatcher disp = request.getRequestDispatcher("/student_addition_outcome.jsp");
        disp.forward(request, response);
    }
    
    
     private Student createStudent(Long studentNumber, String name, String surname, Character gender, String email, String cellNo) {
        
         Student student = new Student();
         student.setStudentNumber(studentNumber);
         student.setName(name);
         student.setSurname(surname);
         student.setCellNo(cellNo);
         student.setEmail(email);
         student.setGender(gender);
         
         return student;
    }
}
