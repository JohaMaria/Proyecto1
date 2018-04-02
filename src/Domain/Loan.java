/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.Serializable;

/**
 *
 * @author Arturo
 */
public class Loan extends Student implements Serializable{
    private String dateStart;
    private String dateFinal;
    private int penalty;
    private Books books;
    private Student student;
//    private Audiovisual audioVisual;

    public Loan() {
        //super();
        this.dateStart = "";
        this.dateFinal = "";
        this.penalty = 0;
        
    }

    public Loan(/*String name, String career, String lastName, int year, String carnet,*/String dateStart, String dateFinal, int penalty, Books books,Student student) {
      //  super(name, career, lastName, year, carnet);
        this.dateStart = dateStart;
        this.dateFinal = dateFinal;
        this.penalty = penalty;
        this.books = books;
        this.student=student;
       // this.audioVisual = audioVisual;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateFinal() {
        return dateFinal;
    }

    public void setDateFinal(String dateFinal) {
        this.dateFinal = dateFinal;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



    @Override
    public String toString() {
        return student+"libro"+ books +"Dia inicial="+ dateStart+ "Dia final="+ dateFinal+
                "Multa="+ penalty;
    }
    
    
}
