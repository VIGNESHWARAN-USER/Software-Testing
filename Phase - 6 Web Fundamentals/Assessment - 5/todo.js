
const input = document.getElementById('input');
const button = document.getElementById('button');
const list = document.getElementById('list');

button.addEventListener('click', function() {
    const taskText = input.value;
   
    if (taskText === '') {
        alert('Please enter a task.');
        return;
    }
    
    const li = document.createElement('li');
    li.textContent = taskText;
    const deleteButton = document.createElement('button');  
    deleteButton.textContent = 'Delete';
    deleteButton.addEventListener('click', function() {
        list.removeChild(li); 
    });
    const space = document.createElement('span');
    space.textContent = " "
    li.appendChild(space);
    li.appendChild(deleteButton); 
    list.appendChild(li); 
    input.value = ''; 
});