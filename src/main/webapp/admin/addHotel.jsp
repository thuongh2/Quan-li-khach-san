<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


	<table class="table">
		<thead>
			<tr>
				<th scope="col">id</th>
				<th scope="col">content</th>
				<th scope="col">area</th>
				<th scope="col">address</th>
			</tr>
		</thead>
		<c:forEach items="${hotels}" var="hotel">
			<tbody>
				<tr>
					<th scope="row">${hotel.id }</th>
					<td>${hotel.content }</td>
					<td>${hotel.hotelDetail.area }</td>
					<td>${hotel.hotelDetail.address }</td>
				</tr>

			</tbody>
		</c:forEach>
	</table>

	<form method="POST" action="PostServlet">
		<div class="form-group">
			<label for="exampleInputEmail1">Content</label> <input name="content"
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email">

		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Image</label> <input name="image"
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email">

		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Area</label> <input name="area"
				type="number" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email">

		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Number Room</label> <input
				name="numberRoom" type="text" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp"
				placeholder="Enter email">

		</div>


		<div class="form-group">
			<label for="exampleInputEmail1">address</label> <input name="address"
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email">

		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Price</label> <input name="price"
				type="number" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email">

		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Description</label> <input
				name="desc" type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email">

		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
</body>
</html>