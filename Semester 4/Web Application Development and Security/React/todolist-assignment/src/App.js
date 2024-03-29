import {useState} from 'react';

import AddTaskForm from './christopherowen2502019180/Add.jsx';
import UpdateForm from './christopherowen2502019180/Update.jsx';
import ToDo from './christopherowen2502019180/Layout.jsx';

import 'bootstrap/dist/css/bootstrap.min.css';

import './App.css';

function App() {
  // Tasks State
  const [toDo, setToDo] = useState([]);

  // Temp State
  const [newTask, setNewTask] = useState('');
  const [updateData, setUpdateData] = useState('');

  // Add task 
  const addTask = () => {
    if(newTask) {
      let num = toDo.length + 1; 
      let newEntry = {id: num, title: newTask, status: false}
      setToDo([...toDo, newEntry])
      setNewTask('');
    }
  }

  // Delete task 
  const deleteTask = (id) => {
    let newTasks = toDo.filter(task => task.id !== id)
    setToDo(newTasks);
  }

  // Mark as done
  const markDone = (id) => {
    let newTask = toDo.map( task => {
      if(task.id === id) {
        return ({ ...task, status: !task.status})
      }
      return task;
    })
    setToDo(newTask);
  }

  // Cancel update
  const cancelUpdate = () => {
    setUpdateData('');
  }

  // Change task for update
  const changeTask = (e) => {
    let newEntry = {
      id: updateData.id,
      title: e.target.value,
      status: updateData.status ? true : false
    }
    setUpdateData(newEntry);
  }

  // Update task
  const updateTask = () => {
    let filterRecords = [...toDo].filter( task => task.id !== updateData.id);
    let updatedObject = [...filterRecords, updateData]
    setToDo(updatedObject);
    setUpdateData('');
  }

  return (
    <div className="container App">

    <br />
    <br />
    <h2>To Do List</h2>
    <br />
    <br />

    {updateData && updateData ? (
      <UpdateForm 
        updateData = {updateData}
        changeTask = {changeTask}
        updateTask = {updateTask}
        cancelUpdate = {cancelUpdate}
      />
    ) : (
      <AddTaskForm 
        newTask = {newTask}
        setNewTask = {setNewTask}
        addTask = {addTask}
      />
    )}

    {/* Display Task */}
    {toDo && toDo.length ? '' : 'No Tasks...'}

    <ToDo
      toDo = {toDo}
      markDone = {markDone}
      setUpdateData = {setUpdateData}
      deleteTask = {deleteTask}
    />  

    </div>
  );
}

export default App;