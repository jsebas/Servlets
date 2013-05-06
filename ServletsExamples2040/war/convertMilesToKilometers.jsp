<%!
private String convert(int miles) {
  java.text.DecimalFormat formatter = new java.text.DecimalFormat("###.##");
  String value = formatter.format(1.6 * miles);
  return value;
}
%>

<% int numero = 0,numero2=0; %>

<%
int[] mileValues = {1,2,3,5,10,15,20,50,100,200,500};
%>
<html>
<head><title>Millas a kilómetros</title></head>
<body>
<table border="1">
  <tr>
    <th><b>Miles</b></th>
    <th><b>Kilómetros</b></th>
  </tr>
<% for (int i = 0; i < mileValues.length; i++) { %>
  <tr>
    <td><%=mileValues[i]%></td>
    <td><%=convert(mileValues[i])%></td>
  </tr>
<% } %>
</table>
</body>
</html>