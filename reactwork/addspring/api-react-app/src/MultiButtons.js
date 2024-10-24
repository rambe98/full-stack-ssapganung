import { Navigate, useNavigate } from "react-router-dom";

export default function MultiButtons (){
    const navigate = useNavigate();
    
    const handleButtonClick = (event) =>{
        const buttonId = event.target.id;

        switch(buttonId){
            case 'address':
                navigate('/address');
                break;
            case 'bookSearch':
                navigate('/search');
                break;
            case 'newsSearch':
                navigate('/news');
                break;
        }
    }


    return(
        <div>
            <button id="address" onClick={handleButtonClick}>
                주소 찾기 api
            </button>
            <button id="bookSearch" onClick={handleButtonClick}>
                도서 찾기 api
            </button>
            <button id="newsSearch" onClick={handleButtonClick}>
                뉴스 찾기 api
            </button>
        </div>
    );
}