import { useState } from "react";

export const useScrollPosition = ()=>{
    const[scrollPosition, setscrollPosition] = useState(0);

    const handleScroll = (event) =>{
        setscrollPosition(event.nativeEvent.contentOffset.y);
    }
    return{scrollPosition,handleScroll};
}