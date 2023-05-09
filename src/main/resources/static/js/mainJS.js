function change_language(){
    var selectedOption = document.getElementById("change_language").value;

/*    var selectValue = selectedOption.options[selectedOption.selectedIndex].value;*/

    if(selectedOption != ''){
        window.location.replace('?lang='+selectedOption);
    }

    alert(selectedOption);
}

