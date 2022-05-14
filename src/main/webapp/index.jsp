<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Show" method="post">


<button type="submit" value="update">click me for update</button>
</form>
<%-- <%
int id = Integer.parseInt(request.getParameter("userid")); 
String name = request.getParameter("username");

String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "jdbc";
String userid = "root";
String password = "1234";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

%>
<h1>Retrieve data from database in jsp</h1>
<table border="1">
<tr>
<td>first name</td>
<td>last name</td>
<td>City name</td>
<td>Email</td>
<td>College</td>
</tr>
<%
List<Main> list = new ArrayList<Main>();
try{
	Connection conn = Dao.getConnection();
	PreparedStatement ps = conn.prepareStatement("select * from students");
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		Main m = new Main();
		m.setId(rs.getInt(1));
		m.setName(rs.getString(2));
		m.setEmail(rs.getString(3));
		m.setPass(rs.getString(4));
		m.setCollege(rs.getString(5));
		
		list.add(m);
	}
}
catch(Exception e){
	e.printStackTrace();
}
%> --%>
</body>
</html>