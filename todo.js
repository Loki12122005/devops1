import React, {useState} from 'react';
import './index.css';
export default function App(){
const [tasks, setTasks] = useState([]);
const [text, setText] = useState('');
function add(){ if(!text) return; setTasks([...tasks,{id:Date.now(),text,done:false}]); setText(''); }
function remove(id){ setTasks(tasks.filter(t=>t.id!==id)); }
function toggle(id){ setTasks(tasks.map(t=> t.id===id? {...t,done:!t.done}:t)); }
return (
<div style={{padding:20}}>
<h2>To-Do</h2>
<input value={text} onChange={e=>setText(e.target.value)} placeholder="New task" />
<button onClick={add}>Add</button>
<ul>
{tasks.map(t=> (
<li key={t.id}>
<input type="checkbox" checked={t.done} onChange={()=>toggle(t.id)} />
<span style={{textDecoration:t.done?'line-through':'none', marginLeft:8}}>{t.text}</span>
<button onClick={()=>remove(t.id)} style={{marginLeft:8}}>Delete</button>
</li>
))}
</ul>
</div>
);
}
