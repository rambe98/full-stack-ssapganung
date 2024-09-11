document.addEventListener('DOMContentLoaded',
    function(e){
        let input = document.querySelector("#input");
        input.addEventListener('click', 
            function(e){
                // 속성 조회
                //console.log(e.target.getAttribute('type'));
                // 속성 변경
                //e.target.setAttribute('type','text');
                // 속성값 토글
                if(e.target.getAttribute('type') === "button"){
                    e.target.setAttribute('type','text');
                }
            
            }
        )
        //keydown은 포커스가 사리지지 않아서 바뀌지 않는다.
        // 포커스가 입력창 내부에 있기 때문에 택스트의 입력이 덜 끝났다고 생각하여 작업을 수행하지 않음
        /*
        input.addEventListener('keydown',
            function(e){
                if(e.key === 'enter'){
                    e.target.setAttribute('type','button');
                }
                    
            }
        )
        */
        input.addEventListener('change',
            function(e){
                    e.target.setAttribute('type','button');
            }
        )
    }
)