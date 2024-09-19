import React,{useState,useRef} from 'react';

function RefSample(){
    const refNum = useRef(0);

    const [statenum,setstatenum] = useState(0);

    console.log('렌더링 발생');

    const increaseRefNum = () => {
        refNum.current = refNum.current + 1;
        console.log(`refNum : ${refNum.current}`);
    }
    const increaseStateNum = () => {
        setstatenum(statenum => statenum + 1);
        console.log(`statenum : ${statenum}`);
    }

    return(
        <div>
            <h1>refNum : {refNum.current}</h1>
            <h1>statenum : {statenum.current}</h1>
            <button onClick={increaseRefNum}>refNum + 1</button>
            <button onClick={increaseStateNum}>statenum + 1</button>
        </div>
    )
}
export default RefSample;