const express = require("express");
const app = express();
const mysql = express();

// const db = mysql.createPool({
//     host: 'localhost',
//     user: 'root',
//     password: '123456',
//     database: ''
// })

app.get('/',(req, res) => {
    res.send("Hello word")
})

app.listen(3001, () =>{
    console.log("Servidor iniciado na porta 3001: http://localhost:3001")
})