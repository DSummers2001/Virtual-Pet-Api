function submitPet(event){
    event.preventDefault();
    const formData = new FormData(document.getElementById('petForm'));
    const jsonObject = {
        "pet_name":formData.get('pet_name'),
        "pet_description":formData.get('pet_description'),
        "pet_hunger": formData.get('pet_hunger'),
        "pet_thirst": formData.get('pet_thirst'),
        "pet_boredom": formData.get('pet_boredom')
    }
    fetch(`http://localhost:8080/api/virtualpets/new`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(jsonObject)
    }).then(response => {
        if(!response.ok){
            throw new Error('Pet could not be created');
        }
        return response.json();
    }).then(data => {
        console.log("Success: ", data);
        location.reload()
    }).catch(error => {
        var newDiv = document.createElement('div');
        newDiv.innerHTML = '<a></a><p>' + error + '</p>';
    })
}