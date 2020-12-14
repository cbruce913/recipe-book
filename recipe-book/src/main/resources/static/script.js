var button = document.getElementById("add");
var input = document.getElementById("ingredientInput");
var ul = document.querySelector("ul");
var hiddenIngredients = document.getElementById("hide");

button.addEventListener("click", function() {
  var li = document.createElement("li");
  // Add Bootstrap class to the list element
  li.classList.add("list-group-item");
  //li.setAttribute("name","ingredients");
  li.appendChild(document.createTextNode(input.value));
  ul.appendChild(li);
  hiddenIngredients.value += input.value + ",";
  // Clear your input
  input.value = "";
})