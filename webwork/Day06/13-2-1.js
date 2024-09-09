document.addEventListener('DOMContentLoaded',
    function(e){
        let button = document.querySelector("input");
        let p = document.querySelector("p");

        //const images = ['cat1.jpg', 'cat2.jpg', 'cat3.jpg'];
        //let currentIndex = 0;

        button.addEventListener('click',
            function(e){
                //textContent : 태그에 들어있는content내용을 반환한다.
                p.textContent = "js로 입력함";
            }
        )
    }
)