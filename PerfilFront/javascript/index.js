const sliderProject = document.querySelector("#projects")
let sliderSection = document.querySelectorAll(".project")
let sliderSectionLast = sliderSection[sliderSection.length -1]



const btnLeft = document.querySelector("#btn-left")
const btnRight = document.querySelector("#btn-right")


sliderProject.insertAdjacentElement("afterbegin", sliderSectionLast)


function moveRight(){
    let sliderSectionFirst = document.querySelectorAll(".project")[0];
    sliderProject.style.marginLeft = "-200%";
    sliderProject.style.transition = "all 0.5s";
    setTimeout(function(){
        sliderProject.style.transition = "none"
        sliderProject.insertAdjacentElement("beforeend", sliderSectionFirst)
        sliderProject.style.marginLeft = "-100%"
    }, 500);

}

function moveLeft(){
    let sliderSection = document.querySelectorAll(".project")
    let sliderSectionLast = sliderSection[sliderSection.length]
    sliderProject.style.marginLeft = "0"
    sliderProject.style.transition = "all 0.5s"
    setTimeout(function(){
        sliderProject.style.transition = "none"
        sliderProject.insertAdjacentElement("afterbegin", sliderSectionLast)
        sliderProject.style.marginLeft = "-100%"
    }, 500);

}

btnRight.addEventListener('click' , ()=>{
    moveRight()
})

btnLeft.addEventListener('click',()=>{
    moveLeft()
})



 setInterval(()=>{
     moveRight();
 },5000)


// let sliderSectionFirst = document.querySelectorAll(".project")[0];
// sliderProject.style.marginLeft = "-200%";
// sliderProject.style.transition = "all 0.5s";
// setTimeout(function(){
//     sliderProject.style.transition = "none"
//     sliderProject.insertAdjacentElement("beforeend", sliderSectionFirst)
//     sliderProject.style.marginLeft = "-100%"
// }, 500);
