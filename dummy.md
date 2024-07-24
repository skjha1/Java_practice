```html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>To Do List</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #87a5f1, #42f4bd);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        header {
            padding: 20px;
            text-align: center;
            margin-top: 0;
            color: white;
        }
        * {
            box-sizing: border-box;
        }
        .container {
            display: flex;
            justify-content: space-between;
            width: 80%;
            max-width: 1200px;
        }
        .todo-inputs {
            background: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            width: 45%;
        }
        .todo-tasks {
            background: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            width: 45%;
        }
        .btn {
            background: #2980b9;
            color: #fff;
            border: none;
            padding: 10px;
            cursor: pointer;
            border-radius: 25px;
            transition: background 0.3s ease transform 0.3s ease;
            font-size: 1em;
            width: 100px;
            margin-top: 10px;
        }
        .todo-listli {
            display: flex;
            flex-direction: column;
            background: rgba(255, 255, 255, 0.9);
            color: black;
            backdrop-filter: blur(10px);
            border-radius: 12px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            margin: 10px 0;
            padding: 20px;
        }
        .btn:hover {
            background-color: #3498db;
            transform: translateY(-3px);
        }
    </style>
</head>
<body>
    <header>
        <h1 class="heading">Welcome to To-Do List</h1>
    </header>
    <div class="container">
        <div class="todo-inputs">
            <h2>What is to be done?</h2>
            <input type="text" id="work-input" placeholder="Enter a task...">
            <h2>Due date</h2>
            <input type="date" id="duedate-input" step="1">
            <button id="add-task" class="btn">Add task</button>
        </div>
        <div class="todo-tasks">
            <h2>Task List</h2>
            <ul id="todo-listli">
                <!-- Todo List Items will be rendered here -->
            </ul>
        </div>
    </div>
</body>
<script>
    const workInput = document.getElementById('work-input');
    const duedateInput = document.getElementById('duedate-input');
    const todoListli = document.getElementById('todo-listli');
    const addTaskbtn = document.getElementById('add-task');
    let tasks = [];
    addTaskbtn.addEventListener('click', addTask);
    function addTask() {
        var task = workInput.value;
        var date = duedateInput.value;
        if (task && date) {
            tasks.push({ 'task': task, 'date': date });
            rendertasks();
            workInput.value = '';
            duedateInput.value = '';
        } else {
            alert('Please enter the task and date');
        }
    }
    function rendertasks() {
        todoListli.innerHTML = '';
        tasks.forEach(task => {
            var taskBox = document.createElement('li');
            taskBox.className = 'todo-listli';
            var taskText = document.createElement('p');
            taskText.textContent = `Task: ${task.task}`;
            var dueDateText = document.createElement('p');
            dueDateText.textContent = `Due: ${task.date}`;
            taskBox.appendChild(taskText);
            taskBox.appendChild(dueDateText);
            todoListli.appendChild(taskBox);
        });
    }
</script>
</html>


```
