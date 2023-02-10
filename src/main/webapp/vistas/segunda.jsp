<%@ include file="/vistas/cabecera.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>Esta es la segunda vista</title>
</head>
<h1>Ejemplo aplicacion web</h1>
<p>Segunda(dentro de vistas)</p>
<!-- <p>
	Mensaje del controlador:
	<c:out value="${arrayPersona.mensaje}" />
</p>-->


<!--<c:forEach var = "item" items = "${arrayPersona }"> ${item.value}</c:forEach>
<p>  </p>-->




<body>
	<form method="POST" action="hablar">

		palabra 1: <input type="text" name="fraseuno" id="idUno" /> palabra 2:
		<input type="text" name="frasedos" id="idDos" /> <input type="submit"
			name="concatenar" value="frase" />

	</form>
</body>
</html>
