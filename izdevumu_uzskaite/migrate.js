const Database = require("better-sqlite3");
const fs = require("fs");

const db = new Database("expenses.db");

const sql = fs.readFileSync("migracijas/001_create_expenses.sql", "utf8");

db.exec(sql);

console.log("Migrācija veiksmīgi izpildīta!");

db.close();