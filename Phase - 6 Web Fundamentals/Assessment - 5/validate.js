const submit = document.getElementById("submit")

submit.addEventListener('click', (e) =>{
    e.preventDefault();
    const name = document.getElementById("fullName");

    if(name.value === "" || name.value === undefined)
    {
        const nameDiv = document.getElementById("nameDiv")
        const err = document.createElement('p')
        err.textContent = "Name must not be empty."
        err.style = "color: red";
        nameDiv.appendChild(err);
        return;
    }

    const email = document.getElementById("email").value;

    if(email === "" || email === undefined)
    {
        const emailDiv = document.getElementById("emailDiv")
        const err = document.createElement('p')
        err.textContent = "Email must not be empty."
        err.style = "color: red";
        emailDiv.appendChild(err);
        return;
    }
    else if(!email.endsWith(".com") || email.split("@")[0] === email)
        {
        const emailDiv = document.getElementById("emailDiv")
        const err = document.createElement('p')
        err.textContent = "Email is invalid"
        err.style = "color: red";
        emailDiv.appendChild(err);
        return;
    }

    const dob = document.getElementById("dob").value;

    if(dob === "" || dob === undefined)
    {
        const dobDiv = document.getElementById("dobDiv")
        const err = document.createElement('p')
        err.textContent = "DOB must not be empty."
        err.style = "color: red";
        dobDiv.appendChild(err);
        return;
    }
    array = dob.split("-");

    
    if("2026" - array[0] < 17)
    {
        const dobDiv = document.getElementById("dobDiv")
        const err = document.createElement('p')
        err.textContent = "The student is under age."
        err.style = "color: red";
        dobDiv.appendChild(err);
        return;
    }

    const course = document.getElementById("course").value;

    if(course === "" || course === undefined)
    {
        const courseDiv = document.getElementById("courseDiv")
        const err = document.createElement('p')
        err.textContent = "Course must not be empty."
        err.style = "color: red";
        courseDiv.appendChild(err);
        return;
    }

})