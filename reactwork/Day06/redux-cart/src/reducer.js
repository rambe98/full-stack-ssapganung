const initialState = {cart: []};
  
export default function cartReducer(state = initialState, action) {
    switch (action.type) {
      case 'ADD_TO_CART':
        const existingProduct = state.cart.find(item => item.id === action.id);
        if (existingProduct) {
          // 제품이 이미 카트에 있으면 수량 증가
          return {
            ...state,
            cart: state.cart.map(item =>
              item.id === action.id
                ? { ...item, quantity: item.quantity + 1 }
                : item
            ),
          };
        } else {
          // 제품이 없으면 새로 추가
          return {
            ...state,
            cart: [...state.cart, { id: action.id, name: action.name, quantity: 1 }],
          };
        }
        case 'REMOVE_FROM_CART':
          const productToRemove = state.cart.find(item => item.id === action.id);
          if (productToRemove) {
            if (productToRemove.quantity > 1) {
              return {
                ...state,
                cart: state.cart.map(item =>
                  item.id === action.id
                    ? { ...item, quantity: item.quantity - 1 }
                    : item
                ),
              };
            } else {
              return {
                ...state,
                cart: state.cart.filter(item => item.id !== action.id),
              };
            }
          }
          return state;
        case 'REMOVE_ALL_FROM_CART': // 카트를 비우는 로직
            return {
                ...state,
            cart: [],
        };
      default:
        return state;
    }
}
  
