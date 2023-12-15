package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Objects;

@WebServlet("/game")
public class Main extends HttpServlet {
    Boolean Win;
    String a11 = ":";
    String a12 = ":";
    String a13 = ":";
    String a21 = ":";
    String a22 = ":";
    String a23 = ":";
    String a31 = ":";
    String a32 = ":";
    String a33 = ":";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("Метод гет");
        req.setAttribute("Win", Win);
        req.setAttribute("a11", a11);
        req.setAttribute("a12", a12);
        req.setAttribute("a13", a13);
        req.setAttribute("a21", a21);
        req.setAttribute("a22", a22);
        req.setAttribute("a23", a23);
        req.setAttribute("a31", a31);
        req.setAttribute("a32", a32);
        req.setAttribute("a33", a33);
        req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("Метод Пост");
        String btn = req.getParameter("button");
        System.out.println(btn);
        if(Objects.equals(Win, Boolean.TRUE)){
            System.out.println("Я в победе");
            req.setAttribute("a11", a11);
            req.setAttribute("a12", a12);
            req.setAttribute("a13", a13);
            req.setAttribute("a21", a21);
            req.setAttribute("a22", a22);
            req.setAttribute("a23", a23);
            req.setAttribute("a31", a31);
            req.setAttribute("a32", a32);
            req.setAttribute("a33", a33);
            req.setAttribute("Win", Win);
            req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
        }
        else if(Objects.equals(Win, Boolean.FALSE)){
            System.out.println("Я в проигрыше");
            req.setAttribute("a11", a11);
            req.setAttribute("a12", a12);
            req.setAttribute("a13", a13);
            req.setAttribute("a21", a21);
            req.setAttribute("a22", a22);
            req.setAttribute("a23", a23);
            req.setAttribute("a31", a31);
            req.setAttribute("a32", a32);
            req.setAttribute("a33", a33);
            req.setAttribute("Win", Win);
            req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
        }
        if(Objects.equals(btn, "a11")){
            if(!Objects.equals(a11, "O")){
                a11 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            }
        }
        else if(Objects.equals(btn, "a12")){
            if(!Objects.equals(a12, "O")){
                a12 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            }
        }
        else if(Objects.equals(btn, "a13")){
            if(!Objects.equals(a13, "O")){
                a13 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            }
        }
        else if(Objects.equals(btn, "a21")){
            if(!Objects.equals(a21, "O")){
                a21 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            }
        }
        else if(Objects.equals(btn, "a22")){
            if(!Objects.equals(a22, "O")){
                a22 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            }
        }
        else if(Objects.equals(btn, "a23")){
            if(!Objects.equals(a23, "O")){
                a23 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            }
        }
        else if(Objects.equals(btn, "a31")){
            if(!Objects.equals(a31, "O")){
                a31 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            };
        }
        else if(Objects.equals(btn, "a32")){
            if(!Objects.equals(a32, "O")){
                a32 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            }
        }
        else if(Objects.equals(btn, "a33")){
            if(!Objects.equals(a33, "O")){
                a33 = "X";
            }
            else{
                req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);
            }
        }
        if(Objects.equals(a11, a12) & Objects.equals(a12, a13) & Objects.equals(a11, "X")){
            Win = Boolean.TRUE;
            req.setAttribute("Win", Win);
        }
        else if(Objects.equals(a21, a22) & Objects.equals(a22, a23) & Objects.equals(a21, "X")){
            Win = Boolean.TRUE;
            req.setAttribute("Win", Win);
        }
        else if(Objects.equals(a31, a32) & Objects.equals(a32, a33) & Objects.equals(a31, "X")){
            Win = Boolean.TRUE;
            req.setAttribute("Win", Win);
        }
        else if(Objects.equals(a11, a21) & Objects.equals(a21, a31) & Objects.equals(a21, "X")){
            Win = Boolean.TRUE;
            req.setAttribute("Win", Win);
        }
        else if(Objects.equals(a12, a22) & Objects.equals(a22, a32) & Objects.equals(a22, "X")){
            Win = Boolean.TRUE;
            req.setAttribute("Win", Win);
        }
        else if(Objects.equals(a13, a23) & Objects.equals(a23, a33) & Objects.equals(a33, "X")){
            Win = Boolean.TRUE;
            req.setAttribute("Win", Win);
        }
        else if(Objects.equals(a11, a22) & Objects.equals(a22, a33) & Objects.equals(a33, "X")){
            Win = Boolean.TRUE;
            req.setAttribute("Win", Win);
        }
        else if(Objects.equals(a31, a22) & Objects.equals(a22, a13) & Objects.equals(a13, "X")){
            Win = Boolean.TRUE;
            req.setAttribute("Win", Win);
        }
        if(!Objects.equals(a11, "X") & !Objects.equals(a11, "O")){
            a11 = "O";
        }
        else if(!Objects.equals(a12, "X") & !Objects.equals(a12, "O")){
            a12 = "O";
        }
        else if(!Objects.equals(a13, "X") & !Objects.equals(a13, "O")){
            a13 = "O";
        }
        else if(!Objects.equals(a21, "X") & !Objects.equals(a21, "O")){
            a21 = "O";
        }
        else if(!Objects.equals(a22, "X") & !Objects.equals(a22, "O")){
            a22 = "O";
        }
        else if(!Objects.equals(a23, "X") & !Objects.equals(a23, "O")){
            a23 = "O";
        }
        else if(!Objects.equals(a31, "X") & !Objects.equals(a31, "O")){
            a31 = "O";
        }
        else if(!Objects.equals(a32, "X") & !Objects.equals(a32, "O")){
            a32 = "O";
        }
        else if(!Objects.equals(a33, "X") & !Objects.equals(a33, "O")){
            a33 = "O";
        }
        if(!Objects.equals(Win, Boolean.TRUE)) {
            if (a11.equals(a12) & Objects.equals(a12, a13) & a11.equals("O")) {
                Win = Boolean.FALSE;
                req.setAttribute("Win", Win);
            } else if (Objects.equals(a21, a22) & Objects.equals(a22, a23) & Objects.equals(a21, "O")) {
                Win = Boolean.FALSE;
                req.setAttribute("Win", Win);
            } else if (Objects.equals(a31, a32) & Objects.equals(a32, a33) & Objects.equals(a31, "O")) {
                Win = Boolean.FALSE;
                req.setAttribute("Win", Win);
            } else if (a11.equals(a21) & Objects.equals(a21, a31) & Objects.equals(a21, "O")) {
                Win = Boolean.FALSE;
                req.setAttribute("Win", Win);
            } else if (Objects.equals(a12, a22) & Objects.equals(a22, a32) & Objects.equals(a22, "O")) {
                Win = Boolean.FALSE;
                req.setAttribute("Win", Win);
            } else if (Objects.equals(a13, a23) & Objects.equals(a23, a33) & Objects.equals(a33, "O")) {
                Win = Boolean.FALSE;
                req.setAttribute("Win", Win);
            } else if (a11.equals(a22) & Objects.equals(a22, a33) & Objects.equals(a33, "O")) {
                Win = Boolean.FALSE;
                req.setAttribute("Win", Win);
            } else if (Objects.equals(a31, a22) & Objects.equals(a22, a13) & Objects.equals(a13, "O")) {
                Win = Boolean.FALSE;
                req.setAttribute("Win", Win);
            }
        }
        req.setAttribute("a11", a11);
        req.setAttribute("a12", a12);
        req.setAttribute("a13", a13);
        req.setAttribute("a21", a21);
        req.setAttribute("a22", a22);
        req.setAttribute("a23", a23);
        req.setAttribute("a31", a31);
        req.setAttribute("a32", a32);
        req.setAttribute("a33", a33);
        req.getRequestDispatcher("jsp/game.jsp").forward(req, resp);

    }
}

