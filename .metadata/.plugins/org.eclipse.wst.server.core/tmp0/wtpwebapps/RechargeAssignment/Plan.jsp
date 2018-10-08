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
	<div id="left" class="col-md-4" style="height: 50%; width: 40%; float:left;">
	<h3>Plans</h3>
	<table>
		<tr>
    <th>Plan</th>
    <th>Features</th> 
    <th>Price</th>
  </tr>
  
  <tr>
    <td>STV 17</td>
    <td>250MB for 6days</td>
    <td>17</td>
  </tr>
  <tr>
    <td>Roaming12</td>
    <td>Get free roaming for 30 days</td>
    <td>56</td>
  </tr>
  <tr>
    <td>STV333</td>
    <td>Unlimited calls for 30 days, 2.5GB/day data(Validity:4 months) </td>
    <td>333</td>
  </tr>
  <tr>
    <td>STV156</td>
    <td>1.5GB/day for 19 days</td>
    <td>156</td>
  </tr>
  <tr>
    <td>Combo offer</td>
    <td>Get 2GB data/day(Validity:2 months),Unlimited calls</td>
    <td>555</td>
  </tr>
	</table>
	</div>
<div id="right" class="col-md-4">
	<h3>Recharge</h3>
<form class="form" action="RechargeServlet">
	<label>Mobile Number</label>
	<input type="text" name="mobilenum" class="form-control" required="required" value="<%=mobileNumber %>"/><br /><br />
	<label>Select Plan</label>
	<select name="selectplan" class="form-control">
		<option value="STV17" <%if((plan!=null)&&plan.equals("STV17")){out.print("selected=selected");} %>>STV17</option>
		<option value="Roaming12" <%if((plan!=null)&&plan.equals("Roaming12")){out.print("selected=selected");} %>>Roaming12</option>
		<option value="STV333" <%if((plan!=null)&&plan.equals("STV333")){out.print("selected=selected");} %>>STV333</option>
		<option value="STV156" <%if((plan!=null)&&plan.equals("STV156")){out.print("selected=selected");} %>>STV156</option>
		<option value="ComboOffer" <%if((plan!=null)&&plan.equals("ComboOffer")){out.print("selected=selected");} %>>Combo offer</option>
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
	plan=ckysNames.get(1);
	mobileNumber=ckysNames.get(0);
	System.out.println(ckysNames.get(0));
	System.out.println(ckysNames.get(1));
	}	
}

%>
</html>