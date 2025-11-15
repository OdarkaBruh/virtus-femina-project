import { useState } from 'react'
import './App.css'

function App() {
    const [name, setName] = useState("lol")
    const [salary, setSalary] = useState(34)

    const handleClick = (e) => {
        e.preventDefault()
        const form = {name, salary}
        fetch('http://localhost:8093/add', {
            method: 'POST',
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(form)
        });
    }

  return (
    <>
      <h3>AAAAAA</h3>
        <form>
            <textarea value={name} onChange={(e) => setName(e.target.value)}></textarea>
            <button onClick={handleClick}>2</button>
        </form>
    </>
  )
}

export default App
