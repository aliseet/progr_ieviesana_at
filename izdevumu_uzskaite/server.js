const express = require("express");
const Database = require("better-sqlite3");
const db = new Database("expenses.db");
const app = express();

app.use(express.json());
app.use(express.static("public"));

app.listen(3000, () => {
    console.log("Serveris darbojas: http://localhost:3000");
});
