import React,{useState,useRef} from 'react';

function InputSample(){
    const [inputs,setinputs]= useState({
        이름:"",
        nickname:""
    })
    const nameFocus = useRef();
    const {이름, nickname}=inputs;
    const onChange = (e) =>{
        const {value,name} = e.target;
        setinputs({
            ...inputs,
            [name] : value
        })
    }
    const onReset = () => {
        setinputs({
            이름:"",
            nickname:""
        })
        nameFocus.current.focus();
    }
    return (
        <div>
            <input
                name="이름"
                placeholder='이름을 작성해 주시오'
                value={이름}
                ref={nameFocus}
                onChange={onChange}
            />
            <input
                name='nickname'    
                placeholder='닉네임 쓰시오'
                onChange={onChange}
                value={nickname}
            />
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값: </b>
                {이름}({nickname})
            </div>
        </div>
    )
}
export default InputSample;