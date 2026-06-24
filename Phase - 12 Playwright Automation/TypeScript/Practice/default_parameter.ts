function showDetails(name_id:string, email?:string, id:number = 1) {

    if(email == undefined)
    {   
        console.log(`The email is not given`)
        return
    }
    console.log(`The email is : ${email}`)
}

showDetails(1, "Vignesh", "mail")