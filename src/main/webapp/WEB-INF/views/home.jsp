<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>wine-quality chart</title>
<%@include file="./common_resource.jsp"%>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/series-label.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/home.css" rel="stylesheet" />
</head>
<body>
<figure class="highcharts-figure">
	<h1>Wine Quality</h1>
	<div class="custom-select">
	<select name="qualityType" id="qualityType">
		<option value="">와인 품질 데이터 필드 목록</option>
		<option value="fixed_acidity">fixed_acidity</option>
		<option value="volatile_acidity">volatile_acidity</option>
        <option value="citric_acid">citric_acid</option>
        <option value="residual_sugar">residual_sugar</option>
        <option value="chlorides">chlorides</option>
        <option value="free_sulfur_dioxide">free_sulfur_dioxide</option>
        <option value="total_sulfur_dioxide">total_sulfur_dioxide</option>
        <option value="density">density</option>
        <option value="ph">pH</option>
        <option value="sulphates">sulphates</option>
        <option value="alcohol">alcohol</option>
        <option value="quality">quality</option>
	</select>
	</div>
	<p>count: 
	<input id="limitText" type="text"></input>
	<button id="limitButton" type="button">조회</button>
	</p>
    <div id="container">
	</div>
</figure>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/home.js"></script>
</body>
</html>