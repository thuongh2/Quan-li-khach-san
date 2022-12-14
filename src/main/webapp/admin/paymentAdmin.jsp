<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Quản lí bài đăng</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
	color: #566787;
	background: #f5f5f5;
	font-family: 'Varela Round', sans-serif;
	font-size: 13px;
}

.table-responsive {
	margin: 30px 0;
}

.table-wrapper {
	min-width: 1000px;
	background: #fff;
	padding: 20px 25px;
	border-radius: 3px;
	box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
}

.table-title {
	padding-bottom: 15px;
	background: #435d7d;
	color: #fff;
	padding: 16px 30px;
	margin: -20px -25px 10px;
	border-radius: 3px 3px 0 0;
}

.table-title h2 {
	margin: 5px 0 0;
	font-size: 24px;
}

.table-title .btn-group {
	float: right;
}

.table-title .btn {
	color: #fff;
	float: right;
	font-size: 13px;
	border: none;
	min-width: 50px;
	border-radius: 2px;
	border: none;
	outline: none !important;
	margin-left: 10px;
}

.table-title .btn i {
	float: left;
	font-size: 21px;
	margin-right: 5px;
}

.table-title .btn span {
	float: left;
	margin-top: 2px;
}

table.table tr th, table.table tr td {
	border-color: #e9e9e9;
	padding: 12px 15px;
	vertical-align: middle;
}

table.table tr th:first-child {
	width: 60px;
}

table.table tr th:last-child {
	width: 100px;
}

table.table-striped tbody tr:nth-of-type(odd) {
	background-color: #fcfcfc;
}

table.table-striped.table-hover tbody tr:hover {
	background: #f5f5f5;
}

table.table th i {
	font-size: 13px;
	margin: 0 5px;
	cursor: pointer;
}

table.table td:last-child i {
	opacity: 0.9;
	font-size: 22px;
	margin: 0 5px;
}

table.table td a {
	font-weight: bold;
	color: #566787;
	display: inline-block;
	text-decoration: none;
	outline: none !important;
}

table.table td a:hover {
	color: #2196F3;
}

table.table td a.edit {
	color: #FFC107;
}

table.table td a.delete {
	color: #F44336;
}

table.table td i {
	font-size: 19px;
}

table.table .avatar {
	border-radius: 50%;
	vertical-align: middle;
	margin-right: 10px;
}

.pagination {
	float: right;
	margin: 0 0 5px;
}

.pagination li a {
	border: none;
	font-size: 13px;
	min-width: 30px;
	min-height: 30px;
	color: #999;
	margin: 0 2px;
	line-height: 30px;
	border-radius: 2px !important;
	text-align: center;
	padding: 0 6px;
}

.pagination li a:hover {
	color: #666;
}

.pagination li.active a, .pagination li.active a.page-link {
	background: #03A9F4;
}

.pagination li.active a:hover {
	background: #0397d6;
}

.pagination li.disabled i {
	color: #ccc;
}

.pagination li i {
	font-size: 16px;
	padding-top: 6px
}

.hint-text {
	float: left;
	margin-top: 10px;
	font-size: 13px;
}
/* Custom checkbox */
.custom-checkbox {
	position: relative;
}

.custom-checkbox input[type="checkbox"] {
	opacity: 0;
	position: absolute;
	margin: 5px 0 0 3px;
	z-index: 9;
}

.custom-checkbox label:before {
	width: 18px;
	height: 18px;
}

.custom-checkbox label:before {
	content: '';
	margin-right: 10px;
	display: inline-block;
	vertical-align: text-top;
	background: white;
	border: 1px solid #bbb;
	border-radius: 2px;
	box-sizing: border-box;
	z-index: 2;
}

.custom-checkbox input[type="checkbox"]:checked+label:after {
	content: '';
	position: absolute;
	left: 6px;
	top: 3px;
	width: 6px;
	height: 11px;
	border: solid #000;
	border-width: 0 3px 3px 0;
	transform: inherit;
	z-index: 3;
	transform: rotateZ(45deg);
}

.custom-checkbox input[type="checkbox"]:checked+label:before {
	border-color: #03A9F4;
	background: #03A9F4;
}

.custom-checkbox input[type="checkbox"]:checked+label:after {
	border-color: #fff;
}

.custom-checkbox input[type="checkbox"]:disabled+label:before {
	color: #b8b8b8;
	cursor: auto;
	box-shadow: none;
	background: #ddd;
}
/* Modal styles */
.modal .modal-dialog {
	max-width: 400px;
}

.modal .modal-header, .modal .modal-body, .modal .modal-footer {
	padding: 20px 30px;
}

.modal .modal-content {
	border-radius: 3px;
}

.modal .modal-footer {
	background: #ecf0f1;
	border-radius: 0 0 3px 3px;
}

.modal .modal-title {
	display: inline-block;
}

.modal .form-control {
	border-radius: 2px;
	box-shadow: none;
	border-color: #dddddd;
}

.modal textarea.form-control {
	resize: vertical;
}

.modal .btn {
	border-radius: 2px;
	min-width: 100px;
}

.modal form label {
	font-weight: normal;
}
</style>
<script>
	$(document)
			.ready(
					function() {
						// Activate tooltip
						$('[data-toggle="tooltip"]').tooltip();

						$('table .delete').on('click', function() {
							var id = $(this).parent().find('#id').val();
							$('#deleteEmployeeModal #id').val(id);
						})

						$('table .edit')
								.on(
										'click',
										function() {
											var id = $(this).parent().find(
													'#id').val();
											$
													.ajax({
														type : "GET",
														url : '${pageContext.request.contextPath }/PaymentServlet',
														data : {
															action : 'find',
															id : id
														},
														dataType : 'json',
														contentType : 'application/json',
														success : function(
																result) {
															$(
																	'#editEmployeeModal #id')
																	.val(
																			result.id);
															$(
																	'#editEmployeeModal #paymentPrice')
																	.val(
																			result.paymentPrice);
															$(
																	'#editEmployeeModal #description')
																	.val(
																			result.description);
															$(
																	'#editEmployeeModal #paymentOption')
																	.val(
																			result.paymentOption);
															$(
																	'#editEmployeeModal #hotel')
																	.val(
																			result.hotel);

														}

													})
										})

						// Select/Deselect checkboxes
						var checkbox = $('table tbody input[type="checkbox"]');
						$("#selectAll").click(function() {
							if (this.checked) {
								checkbox.each(function() {
									this.checked = true;
								});
							} else {
								checkbox.each(function() {
									this.checked = false;
								});
							}
						});
						checkbox.click(function() {
							if (!this.checked) {
								$("#selectAll").prop("checked", false);
							}
						});
					});
</script>
</head>
<body>

	<div class="container">
		<div class="table-responsive">
			<div class="table-wrapper">
				<div class="table-title">
					<div class="row">
						<div class="col-xs-6">
							<h2>Quản lí Thanh Toán</h2>
						</div>
						<div class="col-xs-6">
							<a href="#addEmployeeModal" class="btn btn-success"
								data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add
									New Hotel</span></a>
						</div>
					</div>
				</div>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th><span class="custom-checkbox"> <input
									type="checkbox" id="selectAll"> <label for="selectAll"></label>
							</span></th>
							<th>id</th>
							<th>paymentDate</th>
							<th>paymentPrice</th>
							<th>paymentOption</th>
							<th>description</th>
							<th>hotel</th>
							<th>userPayment</th>
						</tr>
					</thead>
					<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
					<c:forEach items="${payments}" var="payment">
						<tbody>
							<tr>
								<td><span class="custom-checkbox"> <input
										type="checkbox" id="checkbox1" name="options[]" value="1">
										<label for="checkbox1"></label>
								</span></td>
								<td>${payment.id }</td>
								<td>${payment.paymentDate }</td>
								<td>${payment.paymentPrice }</td>
								<td>${payment.paymentOption }</td>
								<td>${payment.description }</td>
								<td>${payment.hotel.content }</td>
								<td>${payment.userPayment }</td>
								<td><a href="#editEmployeeModal" class="edit"
									data-toggle="modal"><i class="material-icons"
										data-toggle="tooltip" title="Edit">&#xE254;</i></a> <a
									href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i
										class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
									<input type='hidden' name='id' id='id' value='${payment.id }'></input>
								</td>
							</tr>

						</tbody>
					</c:forEach>
				</table>

			</div>
		</div>
	</div>
	<!-- Edit Modal HTML -->
	<div id="addEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form method="POST"
					action='${pageContext.request.contextPath }/PaymentServlet?action=create'>
					<div class="modal-header">
						<h4 class="modal-title">Add Hotel</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label>paymentPrice</label> <input type="text" id="paymentPrice"
								name="paymentPrice" class="form-control" required>
						</div>
						<div class="form-group">
							<select class="form-select" name="paymentOption"
								id="paymentOption" class="form-select"
								aria-label="Default select example">
								<option value="Momo">Momo</option>
								<option value="Vnpay">Vnpay</option>
								<option value="Tiền mặt">Tiền mặt</option>
							</select>
						</div>
						<div class="form-group">
							<select class="form-select" id="hotel"
								aria-label="Default select example" name="hotel">
								<c:forEach var="item" items="${hotels}">
									<option value="${item.id}">${item.content}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label>Description</label>
							<textarea name="description" id="description" name="desc"
								class="form-control" required></textarea>
						</div>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Cancel"> <input type="submit"
							class="btn btn-success" value="Add">
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Edit Modal HTML -->
	<div id="editEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form method="POST"
					action='${pageContext.request.contextPath }/PaymentServlet?action=update'>
					<div class="modal-header">
						<h4 class="modal-title">Edit Payment</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label>paymentPrice</label> <input type="text" id="paymentPrice"
								name="paymentPrice" class="form-control" required>
						</div>
						<div class="form-group">
							<select class="form-select" name="paymentOption"
								id="paymentOption" class="form-select"
								aria-label="Default select example">
								<option value="Momo">Momo</option>
								<option value="Vnpay">Vnpay</option>
								<option value="Tiền mặt">Tiền mặt</option>
							</select>
						</div>
						<div class="form-group">
							<select class="form-select" id="hotel"
								aria-label="Default select example" name="hotel">
								<c:forEach var="item" items="${hotels}">
									<option value="${item.id}">${item.content}</option>
								</c:forEach>
							</select>
						</div>

						<div class="form-group">
							<label>Description</label>
							<textarea name="description" id="description" name="desc"
								class="form-control" required></textarea>
						</div>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Cancel"> <input type="submit"
							class="btn btn-success" value="Add">
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Delete Modal HTML -->
	<div id="deleteEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form method='POST'
					action='${pageContext.request.contextPath }/PaymentServlet?action=delete'>
					<div class="modal-header">
						<h4 class="modal-title">Delete Employee</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
						<p>Are you sure you want to delete these Records?</p>
						<p class="text-warning">
							<small>This action cannot be undone.</small>
						</p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Cancel"> <input type="submit"
							class="btn btn-danger" value="Delete"> <input
							type='hidden' name='id' id='id'></input>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>