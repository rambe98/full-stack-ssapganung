import React from "react";
import styled from "styled-components/native";
import userContext from "../contexts/User";

const StyledText = styled.Text`
    font-size: 24px;
    margin: 10px;
`
const User= ()=>{
    return(
        <userContext.Consumer>
            {value => <StyledText>Name: {value.name}</StyledText>}
        </userContext.Consumer>
    );
};
export default User;