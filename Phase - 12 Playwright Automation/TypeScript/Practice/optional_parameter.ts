function showDetails(id:number, name_id:string, email?:string) {

    if(email == undefined)
    {   
        console.log(`The email is not given`)
        return
    }
    console.log(`The email is:${email}`)
}

showDetails(1, "Vignesh")