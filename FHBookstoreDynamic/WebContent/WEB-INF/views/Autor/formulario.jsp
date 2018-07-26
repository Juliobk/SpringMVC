<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
              <body>
                  <h1>Adiciona Autor</h1>
                  <hr />
                  <form action="adicionado" method="GET">
                      Nome: <input type="text" name="nome" /><br />
                      Livro: <input type="text" name="livro" /><br />                      
                      <input type="submit" value="Adicionar" />
                  </form>
              </body>
          </html>