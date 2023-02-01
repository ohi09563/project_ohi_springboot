function change_language(){
    var selectedOption = document.getElementById(change_language);

    var selectValue = selectedOption.options[selectedOption.selectedIndex].value;

    if(selectValue != ''){
        window.location.replace('?lang='+selectValue);
    }

    alert(selectValue);
}