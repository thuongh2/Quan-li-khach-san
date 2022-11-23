
<form action="${pageContext.request.contextPath }/SearchServlet?action=search" method="get">
	<div class="wrap">
		<div class="search">
			<input type="text" class="searchTerm" name="search"
				placeholder="Search">
			<input type="submit" class="searchButton">
				<i class="fa fa-search"></i>
			</input>

		</div>
	</div>
</form>

<style>
.search {
	width: 200px;
	height: 42px;
	position: relative;
	display: flex;
}

.searchTerm {
	width: 100%;
	border: 3px solid #009DFF;
	border-right: none;
	padding: 5px;
	height: 42px;
	outline: none;
	color: black;
}

.searchTerm:focus {
	color: black;
}

.searchButton {
	width: 40px;
	height: 42px;
	border: 1px solid #009DFF;
	background: #009DFF;
	text-align: center;
	color: #fff;
	cursor: pointer;
	font-size: 20px;
}

/*Resize the wrap to see the search bar change!*/
.wrap {
	width: 30%;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}
</style>