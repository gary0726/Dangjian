$(document).ready(function(){
	var firstdata  = ["北京1","北京2","北京3","北京4","北京5"];
	var seconddata = [
						["朝阳区1","朝阳区2","朝阳区3","朝阳区4","朝阳区5"],
						["朝阳区11","朝阳区22","朝阳区33","朝阳区44","朝阳区55"],
						["朝阳区111","朝阳区222","朝阳区333","朝阳区444","朝阳区555"],
						["朝阳区1111","朝阳区2222","朝阳区3333","朝阳区4444","朝阳区5555"],
						["朝阳区11111","朝阳区22222","朝阳区33333","朝阳区44444","朝阳区55555"]
					 ];
	var thirddata  = [
						["朝阳小区1","朝阳小区2","朝阳小区3","朝阳小区4","朝阳小区5"],
						["朝阳小区11","朝阳小区22","朝阳小区33","朝阳小区44","朝阳小区55"],
						["朝阳小区111","朝阳小区222","朝阳小区333","朝阳小区444","朝阳小区555"],
						["朝阳小区1111","朝阳小区2222","朝阳小区3333","朝阳小区4444","朝阳小区5555"],
						["朝阳小区11111","朝阳小区22222","朝阳小区33333","朝阳小区44444","朝阳小区55555"]
					 ]
	$("#test").showselect({firstdata : firstdata,seconddata : seconddata});
});