import React, {useState} from 'react';

export default function Sol1(){
    const[food, setfood] = useState(['초콜릿','사탕']);
    const[val,setval] = useState("");

    const inputHandler = (e) => {
        setval(e.target.value);
    }
    const clickHandler =() => {
        setfood(prev => [val, ...prev]);
        setval("");
    }
    return(
        <div>
            <input
                type="text" 
                value={val}
                onChange={inputHandler}
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









        
        
    
  