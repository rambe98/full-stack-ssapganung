//document 객체를 대상으로 이벤트 리스너를 추가한다.
// 이벤트 종류는 DOMContentLoaded이다.
// DOMContentLoaded : 문서의 콘텐츠 로딩이 완료되었음을 의미하는 이벤트
document.addEventListener('DOMContentLoaded',
    // html 코드 로딩 후 처리할 작업
    function(e){
        // 인풋 태그를 찾아 버튼 변수에 저장
        let button = document.querySelector("input");
        //버튼 변수에 이벤트 리스너 추가
        // 이벤트 종류는 인풋
        button.addEventListener('input', 
            function(e){
                // 콘솔에 입력창의 값을 출력
                console.log(e.target.value);
            }
        );
    }
)
// p 태그에서 인라인 이벤트 모델로 호출할 함수를 정의한다
// 함수의 이름은 hi이다
//alert 띄워 hi라는 글자 출력

function hi(){
    alert('hi');
}


