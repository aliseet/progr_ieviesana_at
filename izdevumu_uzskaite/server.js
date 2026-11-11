const express = require("express");
const app = express();

app.use(express.static("public"));

app.listen(3000, () => {
    console.log("Serveris darbojas: http://localhost:3000");
});
