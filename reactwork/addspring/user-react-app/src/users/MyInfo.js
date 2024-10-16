import React, { useEffect, useState } from "react";
import { call } from "../service/ApiService";


export default function MyInfo(){
    const [user,setUser] = useState({
        id : '',
        pwd: '',
        name:'',
        email:''
    });

    useEffect(() => {
        call("/users/name","GET")
        .then(result => setUser(result.data[0]))
    },[])

    const handleChange = (e) =>{
        const {name,value} = e.target;
        setUser(prevState => ({
            ...prevState,
            [name]:value
        }))
    }
    if(!user.id){
        return<div>Loading...</div>
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        const data = new FormData(e.target);
        const id = user.id;
        const pwd = data.get("pwd");
        const name = data.get("name");        
        const email = data.get("email");

        console.log(id);
        console.log(pwd);
        console.log(name);
        console.log(email);

        let users = {id:id,pwd:pwd,name:name,email:email} 
        
        call("/users","PUT",users)
        .then(result => {
            window.location.href="/main";
        })
    }

    return(
        <div>
            <form noValidate onSubmit={handleSubmit}>
                <table border="1" align='center' >
                    <caption>:::내 정보:::</caption>
                    <tr>
                        <th>아이디</th>
                        <td>{user.id}</td>
                    </tr>
                    <tr>
                        <th>비밀번호</th>
                        <td><input name='pwd' type='password' value={user.pwd} onChange={handleChange}/></td>
                    </tr>
                    <tr>
                        <th>이름</th>
                        <td><input name='name' value={user.name} onChange={handleChange}/></td>
                    </tr>
                    <tr>
                        <th>이메일</th>
                        <td><input name='email' value={user.email} onChange={handleChange}/></td>
                    </tr>
                    <tr>
                        <td colSpan="2" align='center'>
                            <input type='submit' value="수정"/>
                            <input type='button' value="취소"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    )
}