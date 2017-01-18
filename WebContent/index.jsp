<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<h1>Hello Form</h1>
<form action="hello.do">
	Name: <input type="text" name="name" property="name" />
	<input type="submit" value="SayHello" />
</form>