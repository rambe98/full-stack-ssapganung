export const addToCart = (id, name) => ({
    type: 'ADD_TO_CART',
    id,
    name
});
  
export const removeFromCart = (id) => ({
    type: 'REMOVE_FROM_CART',
    id
});

export const REMOVE_ALL_FROM_CART = 'REMOVE_ALL_FROM_CART';

export const removeAllFromCart = () => ({
    type: REMOVE_ALL_FROM_CART,
  });