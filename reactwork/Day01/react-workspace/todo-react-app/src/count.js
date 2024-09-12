import React,{useState} from "react";

export default function Count(){
    const [count, setCount] = useState(0);
    //배열 구존 분해
    //let countArray = useState(0);
    //let count = countArray[0];
    //let setCount = countArray[1];


    return(
        <div>
            <p> click {count} times</p>
            <button onClick={() => setCount(count+1)}> Click me</button>
        </div>
    )
}
