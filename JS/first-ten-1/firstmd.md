1. Difference between let, const, and var
var is function-scoped, let and const are block-scoped.
const cannot be reassigned.
js
Copy
Edit
var a = 10; // Function-scoped
let b = 20; // Block-scoped
const c = 30; // Cannot be reassigned
2. Difference between == and ===
== checks only value, === checks value and type.
js
Copy
Edit
console.log(5 == "5");  // true  (type conversion happens)
console.log(5 === "5"); // false (strict comparison)
3. Arrow Functions vs Regular Functions
Arrow functions do not have their own this.
js
Copy
Edit
const add = (a, b) => a + b;  
console.log(add(2, 3)); // 5
4. Difference between null and undefined
null is an assigned empty value.
undefined means no value is assigned.
js
Copy
Edit
let x = null;  
let y;  
console.log(x, y); // null, undefined
5. Purpose of this
Refers to the object calling the function.
js
Copy
Edit
const obj = {
  name: "John",
  greet: function () {
    console.log(this.name);
  }
};
obj.greet(); // John
6. Callbacks in JavaScript
A function passed as an argument to another function.
js
Copy
Edit
function greet(name, callback) {
  console.log("Hello, " + name);
  callback();
}

greet("John", () => console.log("Callback executed!"));
7. Synchronous vs Asynchronous JavaScript
Synchronous: Runs line by line.
Asynchronous: Runs tasks in the background.
js
Copy
Edit
console.log("Start");
setTimeout(() => console.log("Async Task"), 1000);
console.log("End");
// Output: Start, End, Async Task
8. Promises in JavaScript
Handles async operations.
js
Copy
Edit
let promise = new Promise((resolve) => setTimeout(() => resolve("Done!"), 1000));

promise.then(console.log); // Done! (after 1 sec)
9. Difference between map(), forEach(), and filter()
map(): Returns a new array.
forEach(): Loops but does not return.
filter(): Returns a new filtered array.
js
Copy
Edit
let arr = [1, 2, 3];
console.log(arr.map(x => x * 2)); // [2, 4, 6]
arr.forEach(x => console.log(x * 2)); // 2, 4, 6
console.log(arr.filter(x => x > 1)); // [2, 3]
10. Function Declaration vs Function Expression
Declaration can be called before it's defined.
Expression cannot.
js
Copy
Edit
console.log(sum(2, 3)); // 5

function sum(a, b) {
  return a + b;
}

// Expression
const multiply = function (a, b) {
  return a * b;
};

console.log(multiply(2, 3)); // 6