let form = document.querySelector("form");


form.addEventListener("submit", function(e) {

    e.preventDefault(); 

    let title = document.getElementById("book_title").value;
    let author = document.getElementById("author").value;
    let isbn = document.getElementById("isbn").value;

    if (title === "" || author === "") {
        alert("Please fill Title and Author");
        return;
    }

    if (isbn !== "" && isbn.length !== 13) {
        alert("ISBN must be 13 digits");
        return;
    }

    let status = document.querySelector('input[name="status"]:checked');
    
    if (status) {
        status = status.id;
    } else {
        status = "Not selected";
    }

    let favorite = document.getElementById("favorite").checked;

    
    console.log("Title:", title);
    console.log("Author:", author);
    console.log("ISBN:", isbn);
    console.log("Status:", status);
    console.log("Favorite:", favorite);

    alert("Book added successfully!");
});