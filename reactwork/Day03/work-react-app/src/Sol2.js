import React, {useState, useEffect} from 'react';

export default function Sol2(){
    const [count, setCount] = useState(0);
    const [renderCount, setRCount] = useState(0);
    const [text, setText] = useState("");

    const inputHandler = (e) => {
        console.log('input 값이 바뀜')
        setText(e.target.value);
    }

    const countHandler = () => {
        
        setCount(count + 1);
    }
    
    useEffect(() => {
        setRCount(renderCount + 1);
        console.log("렌더링 완료")
    },[count])

    return(
        <div>
            <h3>count : {count} </h3>
            <h3>렌더링 횟수 : {renderCount}</h3>
            <button onClick={countHandler}>+ 1</button>
            <hr/>
            <input onChange={inputHandler} type="text"/>
            <h3>{text}</h3>
        </div>
    )
}

