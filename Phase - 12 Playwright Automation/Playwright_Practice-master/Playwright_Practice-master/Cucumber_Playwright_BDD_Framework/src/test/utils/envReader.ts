import * as dotenv from 'dotenv'
export const getRnv=()=>{
    if(process.env.ENV){
        dotenv.config({
            override:true,
            path:`env/.env ${process.env.ENV}`
        })

    }else{
        console.error("NO ENV")
    }
}