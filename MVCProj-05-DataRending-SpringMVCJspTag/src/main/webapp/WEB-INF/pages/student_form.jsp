<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color: red; text-align: center">Student Registration Page</h1>

<form action="student" method="post" modelAttribute="stud">
<table align="center" bgcolor="cyan">

<tr>
<td> Student no::</td>
<td><input type="text" name="sno"></td>
</tr>

<tr>
<td> Student name::</td>
<td><input type="text" name="sname"></td>
</tr>

<tr>
<td> Student Address::</td>
<td><input type="text" name="saddrs"></td>
</tr>

<tr>
<td> Student Average::</td>
<td><input type="text" name="savg"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="register"></td>
</tr>

</table>
</form>