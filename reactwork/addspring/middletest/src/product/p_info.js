import React from 'react';
import { useState,useEffect } from 'react';
import '../css/styles.css'
import { call } from '../service/ApiService';
import AddProduct from './AddProduct';


export default function P_info(){
    const [items,setItems] = useState([]);
    const [open, setOpen] = useState(true);

    useEffect(()=>{
        call("/han","GET")
        .then(result => {
            setItems(result.data);
        })
    },[])

    const addItem = (newProduct) => {
        call("/han","POST",newProduct)
        .then(result => {
            setItems(result.data);
        })
    };

    const onButtonClick = ()=>{
        setOpen(false);
    }

    let productItems = items.length > 0 && (
        <div>
            <table border="1">
                <tr>
                    <th>상품 번호</th>
                    <th>상품 이름</th>
                    <th>상품 재고</th>
                    <th>상품 가격</th>
                    <th>등록 날짜</th>
                    <th>수정 날짜</th>
                </tr>
                <tbody>
                {items.map((item) => (
                    <tr>
                        <td>{item.id}</td>
                        <td>{item.name}</td>
                        <td>{item.inventory}</td>
                        <td>{item.price}</td>
                        <td>{item.adddate}</td>
                        <td>{item.editdate}</td>
                    </tr>
                ))}
                </tbody>
            </table>
        </div>
    );
    let addProductbtn = <button type="button" onClick={onButtonClick}>상품 추가</button>
    let addProductScreen = <AddProduct addItem={addItem} setOpen={setOpen} />;
    let addButton = addProductbtn;

    if(!open){
    addButton = addProductScreen;
    }
    return(
        <div className='container'>
            {addButton}
            {productItems}
        </div>
    );
}