//조건문
// 조건문에 따라 컴퓨터가 어떻게 행동해야 하는지 명령을 결정하는 문법이다./

/* 예시
주의할 점 0,null,'',undefined ->모두 false로 인식
if (조건식) {
    // 처리할 내용
} 

if (조건식1) {
	} else if (조건식2) { // 조건식1이 false일때 
	
	} else if (조건식3) { // 조건식1, 조건식2가 false 일때
 
	} else { // 조건식1, 조건식2, 조건식3이 false 일때 
	}
*/
// switch문 - 여러 케이스 중 하나 선택
/* 예시
var 변수 = 초기값;
switch (변수) {
	case 값1 : 코드1;
		break;
	case 값2 : 코드2;
		break;
	case 값3 : 코드3;
		break;
	case 값4 : 코드4;
		break;
	default : 코드5;	
}
*/
// 반복문

var sum = 0;

for(var i = 1; i < 11; i++){
    sum +=i;
}
console.log(sum);

