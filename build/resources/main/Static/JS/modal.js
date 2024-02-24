document.addEventListener("DOMContentLoaded", function () {
const addPetModalBlock = document.getElementById("modal-pet");
const addPetButton = document.getElementById("addButton");
const closeAddPetModal = document.getElementsByClassName("close")[0];
const deletePetModalBlock = document.getElementById("modal-pet-delete");
const deletePetButton = document.getElementById("deleteSinglePet");
const closeDeletePetModal = document.getElementsByClassName("close")[1];

addPetButton.addEventListener("click", function (event) {
    addPetModalBlock.style.display = "block";
});

deletePetButton.addEventListener("click", function (event) {
    deletePetModalBlock.style.display = "block";
});

closeAddPetModal.onclick=function(){
    addPetModalBlock.style.display = "none";
}

closeDeletePetModal.onclick=function(){
    deletePetModalBlock.style.display = "none";
}

window.onclick = function(event){
    if(event.target == addPetModalBlock){
        addPetModalBlock.style.display = "none";
    }
    if(event.target == deletePetModalBlock){
        deletePetModalBlock.style.display = "none";
    }
}
})