<jsp:include page="header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="AdicionarAluno.action" method="post">
	<table>
		<tr>
			<td>Numero da matricula: </td>
			<td><input type="text" name="matricula"></td>
		</tr>	
		<tr>
			<td>Nome do aluno: </td>
			<td><input type="text" name="nomeAluno"></td>
		</tr>	
		<tr>
			<td colspan="2"><input type="submit" value=Salvar></td>
		</tr>
	</table>
</form>




<jsp:include page="footer.jsp" />
