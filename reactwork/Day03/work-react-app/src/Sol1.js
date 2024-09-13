import React, {useState} from 'react';

export default function Sol1(){
    const[food,setfood] = useState([]);
    const[val,setval] = useState("");

    // 값 변경
    const inputHandler = (e) => {
        setval(e.target.value);
        
    }
    const clickHandler = () =>{
        if(val !==""){
            setfood(prev => [val,...prev]); 
            setval("");
        }else{
            alert("값넣어줘");
        }
        
        
    }
    const enterKeyEventHandler =(e) => {
        if(e.key === 'Enter'){
            clickHandler();
        }
    }
    return(
        <div>
            <input 
            type="text" 
            value={val}
            onChange={inputHandler} 
            onKeyPress={enterKeyEventHandler} 
            />
            <button onClick={clickHandler} >추가</button>
            <ul>
                {food.map((i,idx) =>(
                    <li key={idx}>{i}</li>
                ))}
            </ul>
        </div>
    )
}