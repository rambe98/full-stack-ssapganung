import React,{useState} from "react";
import {Button, Grid, TextField} from "@mui/material";
 
const AddTodo = (props) => {
    const [item, setItem] = useState({title : ""});

    const addItem = props.addItem;

    // onButtinClick
    const onButtonClick =() => {
        addItem(item); //addItem 함수사용
        setItem({title : ""});
    }


    // onInputChange 함수작성
    const onInputChange=(e) =>{
        setItem({title:e.target.value});
        console.log(item);
    };
    //enterKeyEventHandler
    const enterKeyEventHandler =(e) => {
        if(e.key === 'Enter'){
            onButtonClick();
        }
    }


    return(
        <Grid container style={{marginTop:20}}>
            <Grid xs={11} md={11} item style={{paddingRignt:16}}>
                <TextField 
                    placeholder="Add Todo Here" 
                    fullWidth onChange={onInputChange} 
                    value={item.title} 
                    onKeyPress={enterKeyEventHandler}/>
            </Grid>
            <Grid xs={1} md={1} item>
                <Button 
                    fullWidth style={{height:'100%'}} 
                    color="secondary" variant="outlined" 
                    onClick={onButtonClick}> 
                    + 
                </Button>
            </Grid>
        </Grid>
    )
}
export default AddTodo;