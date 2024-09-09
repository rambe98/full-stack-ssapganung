document.addEventListener('DOMContentLoaded',
    function(e){
        let button = document.querySelector("#button");
        let image = document.querySelector("#img");

        const images = ['cat1.jpg', 'cat2.jpg', 'cat3.jpg'];
        let currentIndex = 0;

        button.addEventListener('click',
            function(e){
                currentIndex = (currentIndex + 1) % images.length;
                image.src = images[currentIndex];
            }
        )
    }
)