function adoptPet(event){
    event.preventDefault();
    const formData = new FormData(document.getElementById('deleteForm'));

    fetch(`http://localhost:8080/api/virtualpets/${formData.get('id')}`, {
        method: 'DELETE'

    }).then(response => {
        if(!response.ok){
            throw new Error('Pet could not be adopted');
        }
    }).then(() => {
        console.log("Success");
        location.reload()
    }).catch(error => {
        console.log("Failure");
        const deletePetModalBlock = document.getElementById("modal-pet-delete");
        deletePetModalBlock.style.display = "none";
    })
}