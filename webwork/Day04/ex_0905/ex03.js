/*
    변수
    데이터를 담아두기 위한 그릇

    변수의 선언
    var : 같은 이름의 변수가 만들어졌을 때를 감지하지 못한다.
	let : 같은 이름의 변수가 만들어졌을때를 감지한다(mutable) 값을 새롭게 대입은 가능
	const : 일종의 상수와 같은 자료형(immutable) 값 다시 대입 불가능
*/

//let i1,i2;
// 대입
// 선언된 변수에 데이터 넣기
//i1 = 100;
//1 = 'abc';
//i1 = false;
// let i1;  재선언은 불가능함

//const 는 초기화만 가능하다.
// 재대입이 불가능하기 때문이다.
//const c = 100;
/*
스코프(유효범위)
식별자(변수명,함수명,클래스명등)의 유효범위를 말한다.
전역에 선언된 전역변수는 하위 모든곳에서 참조가 가능하다.
지역에 선언된 지역변수는 해당 지역과 하위 지역에서만 참조가 가능하다.
var은 함수에서만 지역변수가 되는 함수레벨 스코프를 갖고있다.
*/
/*
function a(){
    var variavble = 1; //지역 변수 취급이라 밖에서 사용 불가
}console.log(variable);

if (true) {
    var variable = 1;
  }
  console.log(variable);
  // let과 const는 블록레벨 스코프를 가져 모든 코드블록에서 지역변수취급한다.
  function a(){
    let l3 = 100;
}console.log(l3);
*/
/*
호이스팅
자바스크립트 엔진은 소스코드를 한 줄씩 읽으며 순차적으로 
실행하기 전에 변수 선언을 포함한 모든 선언문을 찾아내어 먼저 실행한다.
마치 함수안의 선언들을 모두 끌어올려 해당 함수 유효 범위 
최상단에 선언된 것과 같은 특징을 호이스팅이라고 한다.
모든 식별자(변수, 함수, 클래스등)는 호이스팅이 되어 먼저 선언된다.
*/
/*
//변수의 호이스팅
//변수는 크게 '변수 선언'과 '값 할당'으로 이루어진다.
let a; //변수 선언
a = 1; //값 할당
*/
//선언단계 : 변수 이름을 등록해서 자바스크립트가 엔진에 의해 변수의 존재를 알린다.
//초기화 단계 : 값을 저장하기 위한 메모리 공간을 확보하고 암묵적으로 undifined를 할당해 초기화한다.
//var로 선언한 변수의 경우 호이스팅 시 undifined로 변수를 초기화까지 해준다.
console.log(a); //undifined
var a;

//let은 선언단계와 초기화 단계가 분리되어 진행된다.
//선언 단계는 런타임 이전에 변수 선언문에서 이루어진다.
//초기화 단계는 런타임 이후에 변수 선언문에서 이루어진다.
console.log(b); //ReferenceError: Cannot access 'b' before initialization
let b; //여기서 초기화 단계 실행, b에 undefined를 암묵적으로 할당
console.log(b); //undifined

//const는 선언과 동시에 초기화해야한다.
//그렇지 않으면 다른 에러가 출력된다.
//const c; // SyntaxError: Missing initializer in const declaration
//console.log(c);
//ReferenceError가 아닌 SyntaxError이다. 문법적으로 옳지 않다는 뜻이다.
console.log(c); //ReferenceError: Cannot access 'c' before initialization
const c = 1;
//문법을 지켜서 c가 자바스크립트 엔진에 등록은 됐지만
//초기화 단계는 런타임 이후 변수 선언문에서 이루어지기 때문이다.
//그러므로 let과 const는 Scope의 시작 위치에서 선언하는게 좋다.

/*
변수에 저장할 수 있는 자료형
문자형(String) : var 변수 = "사용할 문자나 숫자";

숫자형(Number) : var 변수 = 숫자; 또는 Number(”문자와 숫자”);

논리형(Boolean)
 ㄴ var 변수 = true 또는 false; Boolean(데이터);
 ㄴ false - false, 0, null, '', undefined

null : 변수의 값이 비어 있다는 것을 표시할 경우

undefined :
변수가 선언되었을때 값이 지정되지 않았을 경우
변수를 선언하면 기본값은 undefined 입니다.
자료형 체크 : typeof 변수 또는 데이터

객체(Object)

원시값 : 객체 이외의 값(숫자, 문자, 논리값, null, undefined, ""(빈값)
*/