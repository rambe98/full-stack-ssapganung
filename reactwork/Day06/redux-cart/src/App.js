import logo from './logo.svg';
import './App.css';
import React from 'react';
import { useDispatch, useSelector } from 'react-redux'; // Redux 관련 훅을 불러옴
import { addToCart, removeFromCart, removeAllFromCart } from './actions'; // 액션 생성 함수 불러오기

export default function ShopApp() {
  const products = [
    { id: 1, name: 'Apple' },
    { id: 2, name: 'Banana' },
    { id: 3, name: 'Orange' },
  ]; // 상품 목록을 미리 정의
  
  const cart = useSelector((state) => state.cart); // Redux에서 쇼핑카트 상태를 가져옴
  const dispatch = useDispatch(); // 액션을 디스패치하기 위한 훅

  const handleAddToCart = (id, name) => {
    dispatch(addToCart(id, name)); // 제품을 카트에 추가
  };

  const handleRemoveFromCart = (id) => {
    dispatch(removeFromCart(id)); // 제품을 카트에서 제거
  };
  const handleRemoveAllFromCart = () => {
    dispatch(removeAllFromCart()); // 모든 제품을 카트에서 제거
  };

  return (
    <div className='App'>
      <h1>Products</h1>
      <ul>
        {products.map(product => (
          <li key={product.id}>
            {product.name}
            <button onClick={() => handleAddToCart(product.id, product.name)}>
              Add to Cart
            </button>
          </li>
        ))}
      </ul>

      <h2>Shopping Cart</h2>
      {cart.length === 0 ? (
        <p>Your cart is empty</p>
      ) : (
        <ul>
          {cart.map(item => (
            <li key={item.id}>
              {item.name} (x{item.quantity})
              <button onClick={() => handleRemoveFromCart(item.id)}>
                Remove
              </button>
            </li>
          ))}
        </ul>
      )}
      {cart.length > 0 && ( // 카트에 제품이 있을 경우 버튼 표시
        <button onClick={handleRemoveAllFromCart}>Remove All</button>
      )}
    </div>
  );
}
