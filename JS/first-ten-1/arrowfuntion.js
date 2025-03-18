//  return simple funtion

function add(a,b){
    return a+b;

}

console.log(add(3,4));

// arrow funtion


const ArrowFun = (a,b) => a+b;
console.log(ArrowFun(3,4));


function table (num){

    for (let i=1;i<=10;i++){
        console.log(`${num} x ${i} = ${num * i}`);
    }


};

table(2);