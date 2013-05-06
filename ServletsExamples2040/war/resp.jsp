<html>
<title>Confirmación de datos</title>
<body>
<% 
	int value = Integer.valueOf(request.getParameter("monto"));
    	
%>
<h1>Confirmación de datos</h1>
<form>
<table>
	<tr>
		<td>Monto</td>
		
		<td><input type="text" name="monto"
			value='<%=value*0.1%>'></td>
	</tr>
	<tr>
		<td>Cuenta</td>
		<td><input type="text" name="cuenta"
			value='<%=request.getParameter("cuenta")%>'></td>
	</tr>
	<tr>
		<td>Comentario</td>
		<td><input type="text" name="comentario"
			value='<%=request.getParameter("comentario")%>'></td>
	</tr>
</table>

</form>
<body>
</html>