console.log("star patterns");




// for (let i = 1; i<= 5; i++){


//     // console.log("*")
//     for(let j=1;j<=i;j++){
//         console.log("*");
//     }
//     console.log("\n")
// }


// for (let i=1; i<=5;i++){

//     // process.stdout.write("*");

//     for(let j=1;j<=i;j++){
//         process.stdout.write("*");

//     }
//     console.log("\n");
// }

// let i,j,k;


// for (i=1;i<=5;i++){


//     for(k=1;k<=5-i;k++){
//         process.stdout.write(" ");

//     }


//     for(j=1;j<=i;j++){

//         process.stdout.write("*");
//     }

//     console.log("\n")
// }

// let i,j,k,l=1;





// for(i=1;i<=5;i++){


//     for(j=1;j<=5-i;j++){
//         process.stdout.write(" ")
//     }

//     for (k=1;k<=l;k++){
//         process.stdout.write("*");
//     }


//     console.log("*")

//     l = l+2;
// }


// for (i=1;i<=5;i++){

//     for (j=1;j<=5-i;j++){
//         process.stdout.write(" ");
//     }

//     for(k=1;k<=i;k++){
//         process.stdout.write("*");

//     }

//     for(l=2;l<=i;l++){
//         process.stdout.write("*");
//     }
//     console.log("\n");
// }




// let i,j,k,l,m;




// for(i=5;i>=1;i--){



//     for(j=1;j<=i;j++){
//         process.stdout.write("*");
//     }


    


//     process.stdout.write("\n");

// }



let row, col;


for (row = 1; row <= 5; row++){


    for(col=1;col<=row;col++){
         process.stdout.write("*")
    }

    console.log("\n")
}