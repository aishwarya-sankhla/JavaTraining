<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.util.stream.*"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
#left{
float:left;
margin-left:70px;
}
#right{
margin-left:400px;
}
table,td{
border: 1px solid black;
cell-spacing:60px; 

}
</style>
<body>
	<div id="left" class="col-md-6">
	<h3>Plans</h3>
	<table>
		<th><tr>
			<td>Plan</td>
			<td>Feature</td>
			<td>Amount</td>
		</tr></th>
	<tr>
		<td>120mb</td>
		<td>28 days,2mbps</td>
		<td>500</td>
	</tr>
	<tr>
		<td>150mb</td>
		<td>50 days,5mbps</td>
		<td>1000</td>
	</tr>
	<tr>
		<td>80mb</td>
		<td>82 days,1mbps</td>
		<td>800</td>
	</tr>
	</table>
	</div>
<div id="right" class="col-md-6">
	<h3>Recharge</h3>
<form class="form" action="RechargeServlet">
	<label>Mobile Number</label>
	<input type="text" name="mobilenum" class="form-control" required="required"/><br /><br />
	<label>Select Plan</label>
	<select name="selectplan" class="form-control">
		<option value="STV17" <%if((plan!=null)&&plan.equals("STV17")){out.print("selected=selected");} %>>STV17</option>
		<option value="Roaming12" <%if((plan!=null)&&plan.equals("Roaming12")){out.print("selected=selected");} %>>Roaming12</option>
		<option value="STV333">STV333</option>
		<option value="STV156">STV156</option>
		<option value="ComboOffer">Combo offer</option>
	</select><br /><br />
	<label>Amount</label>
	<input type="text"  name="amt" class="form-control" required="required"/><br /><br />
	
	<input type="submit" value="recharge" class="btn btn-danger">
</form>
</div>
</body>

<%!String mobileNumber; %>
<%!String plan; %>
<%
Cookie[] ckys=request.getCookies();
if(ckys!=null && ckys.length>1){
	List<Cookie> list = Arrays.asList(ckys);
	List<String> ckysNames=list.stream().filter(cky->cky.getName().equals("mobileNumber")|| cky.getName().equals("plan")).map(Cookie::getValue).collect(Collectors.toList());

	if(ckysNames!=null){
	System.out.println(ckysNames.get(0));
	System.out.println(ckysNames.get(1));
	}	
}

%>
</html>