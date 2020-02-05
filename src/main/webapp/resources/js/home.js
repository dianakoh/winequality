var wineQualityList;
var type;
var categoriesData;
var seriesData;

$(function(){
	$('#qualityType').change(function(){
		type = this.value;
	});
});

$(function(){
	$('#limitButton').click(function(){
		var limitValue = $('#limitText').val();
		categoriesData = [];
		seriesData = [];
		var url="/winequality/restex?type1=" + type;
		if(limitValue != null && limitValue != '')
			url += "&limit=" + limitValue;
		$.ajax({
			type:"POST",
			url:url,
			success:function(args){
				wineQualityList = args;
				categoriesData = [];
				seriesData = [];
				for(var i=0; i<args.length;i++){
					categoriesData.push(args[i]['product_seq']);
					seriesData.push(args[i][type]);
				}
				drawChart();
	
			},
            beforeSend:function(){
                $("#container").empty();
            },
            error:function(e){  
                alert(e.responseText);  
            }
		});
		drawChart(cate, series);
	});
});

function drawChart() {
	Highcharts.chart('container', {
        
	    title: {
	        text: ''
	    },

	    yAxis: {
	        title: {
	            text: type
	        }
	    },

	    xAxis: {
	    	categroies: categoriesData
	    },

	    legend: {
	        layout: 'vertical',
	        align: 'right',
	        verticalAlign: 'middle'
	    },

	    plotOptions: {
	        series: {
	            label: {
	                connectorAllowed: false
	            },
	            pointStart: 1
	        }
	    },

	    series:[{
	    	name: type,
	    	data: seriesData
	    }],

	    responsive: {
	        rules: [{
	            condition: {
	                maxWidth: 2000
	            },
	            chartOptions: {
	                legend: {
	                    layout: 'horizontal',
	                    align: 'center',
	                    verticalAlign: 'bottom'
	                }
	            }
	        }]
	    }

	});
}