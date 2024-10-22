import React from 'react';
import { useState} from 'react';

export default function AddProduct(props){
    const [product, setProduct] = useState({name : "",inventory:0,price:0});
    const {name,inventory,price} = product;

    let addItem = props.addItem;
    
    const onChange = (e) => {    
        const { value, name } = e.target;
        setProduct({      
            ...product,
            [name]: value
            });
        };

    const onButtonClick = ()=>{
        console.log(product);
        addItem(product);
        resetFields();
        props.setOpen(true);
    }

    const enterKeyEventHandler =(e) => {
        if(e.key === 'Enter'){
            onButtonClick();
        }
    }

    const resetFields = () => {
        setProduct({ name: "", inventory: 0, price: 0 });
    };

    return(
        <div style={{width:'500px'}}>
			<div><input style={{width: '98.5%'}} value={name} onChange={onChange} name='name' placeholder='상품 이름'/></div>
			<div><input style={{width: '98.5%'}} value={inventory} onChange={onChange} name='inventory' placeholder='상품 재고'/></div>
			<div><input style={{width: '98.5%'}} value={price} onChange={onChange} name='price' placeholder='상품 가격' onKeyPress={enterKeyEventHandler}/></div>
			<input type="button" value="등록" onClick={onButtonClick} style={{width:'100%'}}/>
		</div>
    )
}

