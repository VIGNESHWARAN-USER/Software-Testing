const express = require("express");

const app = express();

app.use(express.json());

app.post("/login",(req,res)=>{

    const {username,password}=req.body;

    if(
        username==="admin" &&
        password==="admin123"
    ){

        return res.json({
            token:"SDET_TOKEN_12345"
        });
    }

    return res.status(401).json({
        message:"Invalid Credentials"
    });
});

app.listen(5000,()=>{
    console.log("Auth Running");
});