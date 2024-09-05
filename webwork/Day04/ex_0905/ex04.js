//산술연산자
let i1 = 10;
let i2 = 7;

console.log(i1 + i2);
console.log(i1 - i2);
console.log(i1 * i2);
console.log(i1 / i2); //몫과 나머지
console.log(i1 % i2); // 나머지

// 대입연산자 -연산된 데이터를 변수에 저장할 때 사용
let a = 3;
let b = a;
console.log('b : '+ b);

// 복합대입연산자 : 산술연산자 + 대입연산자
A += B	//A = A + B
A *= B	//A = A * B
A /= B	//A = A / B
A %= B	//A = A % B

// 증감연산자
//증가연산자(++) - 숫자형 데이터를 1씩 증가
// 변수++; 또는 ++변수;
//감소연산자(--) - 숫자형 데이터를 1씩 감소
// 변수--; 또는 --변수; 

var A = 5;
var B = ++A;
console.log(B);
var B = A++;
console.log(B);

//비교연산자
//두 데이터를 '크다', '작다', '같다'와 같이 비교할때 사용
//연산된 결과는 논리형데이터(true - 참, false - 거짓)
/*
A > B		
A < B		
A >= B		
A <= B		
A == B	    A와 B는 같다	데이터 일치 여부만 체크( 10 == "10" -> true)
A != B	    A와 B는 다르다	데이터 불일치 여부만 체크( 10 != "10" -> false)
A === B	    A와 B는 같다	데이터 일치 + 데이터 종류 일치 여부 체크(10 === "10" --> false)
A !== B	    A와 B는 다르다	데이터 불일치 + 데이터 종류 불일치 여부 체크(10 !== "10" --> true)
*/

var c = 10;
var d = 7;

console.log(a>b);
// 같다를 비교할때
console.log(10 == "10");
console.log(10 === "10");
console.log(10 != "10");
console.log(10 !== "10");

//논리연산자
// ||	OR 연산자, 비교하는 대상 중 하나라도 true면 true가 됨
// &&	AND 연산자, 비교하는 대상 모두 true일때 true, 그렇지 않다면 false
// !	not 연산자, 피 연산자의 값을 반대로 바꿈, true -> false, false -> true
console.log(true || true);
console.log(true && true);
console.log(!true);
/*
연산자 우선순위
아래에서 위로 우선순위가 높아짐
()
단항 연산자(--, ++, !)
산술 연산자(*, /, %, +, -)
비교 연산자(>, >=, <, <=, ==, ===, !=, !==)
논리 연산자(&&, ||)
대입(복합 대입)연산자(=, +=, -=, *=, /=, %=)
*/