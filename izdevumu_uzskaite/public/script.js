const form = document.getElementById("izmaksu-form");
const expenseList = document.getElementById("expense-list");
const totalSum = document.getElementById("total");

let expenses = [];

form.addEventListener("submit", () => {
    event.preventDefault();

    const description = document.getElementById("description").value;
    const amount = Number(document.getElementById("amount").value);
    const category = document.getElementById("category").value;
    const date = document.getElementById("date").value;

    const expense = {
        description: description,
        amount: amount,
        category: category,
        date: date
    };

    expenses.push(expense);

    const li = document.createElement("li");
    li.textContent = `${description} - ${amount.toFixed(2)} eur - ${category} - ${date}`;
    expenseList.appendChild(li);

    let total = 0;

    for(let i = 0; i < expenses.length; i++) {
        total += expenses[i].amount;
    }

    totalSum.textContent = total.toFixed(2);

    form.reset();
});